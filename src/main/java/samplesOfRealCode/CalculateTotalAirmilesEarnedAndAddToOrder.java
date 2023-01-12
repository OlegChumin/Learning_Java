//package samplesOfRealCode;
//
//package com.fluentretail.etos.rule.order;
//
//import com.fluentretail.etos.util.Constants;
//import com.fluentretail.etos.util.OrderGqlQueryHelper;
//import com.fluentretail.etos.util.OrderUtil;
//import com.fluentretail.rubix.exceptions.RubixException;
//import com.fluentretail.rubix.foundation.graphql.com.fluentretail.mutations.order.UpdateOrderMutation;
//import com.fluentretail.rubix.foundation.graphql.com.fluentretail.queries.order.GetOrderByIdQuery;
//import com.fluentretail.rubix.foundation.graphql.type.AttributeInput;
//import com.fluentretail.rubix.foundation.graphql.type.UpdateOrderInput;
//import com.fluentretail.rubix.foundation.graphql.type.UpdateOrderItemWithOrderInput;
//import com.fluentretail.rubix.rule.meta.EventInfo;
//import com.fluentretail.rubix.rule.meta.RuleInfo;
//import com.fluentretail.rubix.v2.context.Context;
//import com.fluentretail.rubix.v2.rule.Rule;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//import static com.fluentretail.etos.util.Constants.*;
//import static org.apache.commons.httpclient.HttpStatus.SC_NOT_FOUND;
//
//@RuleInfo(
//        name = "CalculateTotalAirmilesEarnedAndAddToOrder",
//        description = "Calculates total Airmiles Earned and adds the issued quantity as the order item attributes and total of it to the order.",
//        accepts = {
//                @EventInfo(entityType = "ORDER")
//        }
//)
//public class CalculateTotalAirmilesEarnedAndAddToOrder implements Rule {
//
//    private final OrderGqlQueryHelper orderHelper = new OrderGqlQueryHelper();
//
//    @Override
//    public void run(Context context) {
//        GetOrderByIdQuery.Data data = orderHelper.getOrderDataByOrderId(context, true, true);
//        if (OrderUtil.isOrderOrFulfilmentsEmpty(data)) {
//            throw new RubixException(SC_NOT_FOUND, Constants.DATA_NULL);
//        }
//        GetOrderByIdQuery.OrderById orderById = data.orderById();
//
////        List<GetOrderByIdQuery.FulfilmentsEdge> shippedfulfilments = filterShippedFulfilments(orderById.fulfilments());
//        GetOrderByIdQuery.OrderItems orderItems = orderById.orderItems();
//
////        Map<String, Double> airMilesToIssueForItems = calculateAirMilesToIssueForItems(orderItems, shippedfulfilments);
//        Map<String, Double> airMilesToIssueForItems = calculateAirMilesToIssueForItems(orderItems);
//
//        Map<String, GetOrderByIdQuery.OrderItemsNode> refToOrderItemMap = orderItems.orderItemsEdges().stream().map(GetOrderByIdQuery.OrderItemsEdge::orderItemsNode).collect(Collectors.toMap(orderItemsNode -> orderItemsNode.ref(), Function.identity()));
//
//        int totalAirMilesToIssue = (int) Math.floor(airMilesToIssueForItems.values().stream().reduce(0.0, Double::sum));
//
//        addAirMilesDataToOrderAndOrderItems(context, totalAirMilesToIssue, airMilesToIssueForItems, refToOrderItemMap);
//    }
//
//    private void addAirMilesDataToOrderAndOrderItems(Context context, int totalAirMilesToIssue, Map<String, Double> airMilesToIssueForItems, Map<String, GetOrderByIdQuery.OrderItemsNode> refToOrderItemMap) {
//        List<UpdateOrderItemWithOrderInput> itemList = new ArrayList<>();
//        for (Map.Entry<String, Double> entry : airMilesToIssueForItems.entrySet()) {
//            String itemRef = entry.getKey();
//            String itemId = refToOrderItemMap.get(itemRef).id();
//            List<AttributeInput> attributeInputs = new ArrayList<>();
//            attributeInputs.add(AttributeInput.builder().name(AIRMILES_TO_ISSUE).type(ATTRIBUTE_TYPE_DOUBLE).value(BigDecimal.valueOf(entry.getValue()).setScale(2, RoundingMode.FLOOR).doubleValue()).build());
//            UpdateOrderItemWithOrderInput updateOrderItemWithOrderInput = UpdateOrderItemWithOrderInput.builder().id(itemId).attributes(attributeInputs).build();
//            itemList.add(updateOrderItemWithOrderInput);
//        }
//        List<AttributeInput> attributeInputs = new ArrayList<>();
//        attributeInputs.add(AttributeInput.builder().name(TOTAL_AIRMILES_TO_ISSUE).type(ATTRIBUTE_TYPE_INTEGER).value(totalAirMilesToIssue).build());
//        UpdateOrderInput updateOrderInput = UpdateOrderInput.builder()
//                .id(context.getEvent().getEntityId())
//                .items(itemList)
//                .attributes(attributeInputs)
//                .build();
//        context.action().mutation(UpdateOrderMutation.builder().input(updateOrderInput).build());
//    }
//
//    private List<GetOrderByIdQuery.FulfilmentsEdge> filterShippedFulfilments(GetOrderByIdQuery.Fulfilments fulfilments) {
//        return fulfilments.fulfilmentsEdges().stream().filter(fulfilmentsEdge -> SHIPPED.equalsIgnoreCase(fulfilmentsEdge.fulfilmentsNode().status())).collect(Collectors.toList());
//    }
//
//    //    private Map<String, Double> calculateAirMilesToIssueForItems(GetOrderByIdQuery.OrderItems orderItems, List<GetOrderByIdQuery.FulfilmentsEdge> shippedfulfilments) {
//    private Map<String, Double> calculateAirMilesToIssueForItems(GetOrderByIdQuery.OrderItems orderItems) {
//
//        Map<String, Double> airMilesToIssueForItems = new HashMap<>();
//        orderItems.orderItemsEdges().stream().forEach(orderItemsEdge -> {
//            GetOrderByIdQuery.OrderItemsNode orderItemsNode = orderItemsEdge.orderItemsNode();
//            int totalQuantity = orderItemsNode.quantity();
////            AtomicInteger shippedQuantity = new AtomicInteger();
//            Double airMilesEarned = orderItemsNode.attributes().stream().filter(attribute -> AIRMILES_EARNED.equals(attribute.name())).findFirst().map(attribute -> Double.parseDouble(attribute.value().toString())).orElse(0.0);
////            shippedfulfilments.stream().forEach(fulfilmentsEdge -> {
////                GetOrderByIdQuery.FulfilmentsNode fulfilmentsNode = fulfilmentsEdge.fulfilmentsNode();
////                fulfilmentsNode.fulfilmentItems().fulfilmentItemsEdges().stream().forEach(fulfilmentItemsEdge -> {
////                    GetOrderByIdQuery.FulfilmentItemsNode fulfilmentItemsNode = fulfilmentItemsEdge.fulfilmentItemsNode();
////                    if (fulfilmentItemsNode.ref().equals(orderItemsNode.ref())) {
////                        shippedQuantity.addAndGet(fulfilmentItemsNode.filledQuantity());
////                    }
////                });
////            });
//            double airMilesToIssue = 0;
//            if (totalQuantity != ZERO) {
////                airMilesToIssue = (airMilesEarned * shippedQuantity.get()) / totalQuantity;
//                airMilesToIssue = airMilesEarned / totalQuantity;
//            }
//            airMilesToIssueForItems.put(orderItemsNode.ref(), airMilesToIssue);
//        });
//
//        return airMilesToIssueForItems;
//    }
//}
