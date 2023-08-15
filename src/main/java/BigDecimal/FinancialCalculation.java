package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FinancialCalculation {
    public static void main(String[] args) {
        BigDecimal loanAmount = new BigDecimal("10000.00"); // Сумма кредита
        BigDecimal annualInterestRate = new BigDecimal("0.05"); // Годовая процентная ставка (5%)
        int loanTermMonths = 24; // Срок кредита в месяцах

        BigDecimal monthlyInterestRate = annualInterestRate.divide(new BigDecimal("12"), 10, RoundingMode.HALF_UP);
        BigDecimal onePlusMonthlyInterestRate = monthlyInterestRate.add(BigDecimal.ONE);
        
        BigDecimal numerator = onePlusMonthlyInterestRate.pow(loanTermMonths)
                               .multiply(monthlyInterestRate)
                               .setScale(10, RoundingMode.HALF_UP);
        
        BigDecimal denominator = onePlusMonthlyInterestRate.pow(loanTermMonths)
                                 .subtract(BigDecimal.ONE)
                                 .setScale(10, RoundingMode.HALF_UP);
        
        BigDecimal monthlyPayment = loanAmount.multiply(numerator.divide(denominator, RoundingMode.HALF_UP))
                                    .setScale(2, RoundingMode.HALF_UP);

        BigDecimal totalPayment = monthlyPayment.multiply(new BigDecimal(loanTermMonths))
                                 .setScale(2, RoundingMode.HALF_UP);
        
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
    }
}
