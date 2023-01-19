package Java_405_lessons.Patterns.Pattern_16_Prototype;

// Prototype -> copy of available entity
public class PrototypePatternLesson {
    public static void main(String[] args) throws CloneNotSupportedException {
        //I and II
//        GoodsItem item =  new GoodsItem("Monitor", 23_942_349);
//        // Object.clone Clonable
//        GoodsItem item2 = item.clone();
//        System.out.println("item2 != item = " + (item2 != item));
//        System.out.println("item.name = item2.name = " + (item.name == item2.name));
//        System.out.println("item.id = item2.id = " + (item.id == item2.id));

        //deep and not deep cloning
        Address address = new Address("230", 23);
        GoodsItem item = new GoodsItem("Keyboard", 293872394, address);
        GoodsItem item2 = item.clone();
        System.out.println("item2 != item = " + (item2 != item));
        System.out.println("item.name == item2.name = " + (item.name == item2.name));
        System.out.println("item.id == item2.id = " + (item.id == item2.id));
        System.out.println("item.address.street == item2.address.street = " + (item.address.street == item2.address.street));
        item.name = "NewKeyboard";
        System.out.println("item.name = " + item.name);
        System.out.println("item2.name = " + item2.name);
        System.out.println();

        System.out.println("item2.address.street = " + item2.address.street);
        item.address.street = "110";
        System.out.println("item.address.street = " + item.address.street);
        System.out.println("item2.address.street = " + item2.address.street);

    }
}

//III
class Address{ //IV implements Clonable Ovveride clone
    String street;
    int houseNumber;

    public Address(String street, int houseNumber) {
//        System.out.println("constructor");
        this.street = street;
        this.houseNumber = houseNumber;
    }

//    public Address(Address address) {
//        this.street = address.street;
//        this.houseNumber =  address.houseNumber;
//
//    }
//    @Override
//    protected Address clone() {
//        return (Address) super.clone();
//    }

}

//I
//class GoodsItem {
//    String name;
//    int id;
//
//    public GoodsItem(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    public GoodsItem copyOfEntity(GoodsItem item) {
//        return new GoodsItem(item.name, item.id);
//    }
//}

/**
 * Класс реализует интерфейс Cloneable, чтобы указать методу Object.clone(), что этому методу разрешено создавать
 * полевые копии экземпляров этого класса.
 * Вызов метода clone объекта для экземпляра, который не реализует интерфейс Cloneable, приводит к возникновению
 * исключения CloneNotSupportedException.*/

//II
//class GoodsItem implements Cloneable{
//    String name;
//    int id;
//
//    public GoodsItem(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    @Override
//    protected GoodsItem clone() throws CloneNotSupportedException {
//        return (GoodsItem) super.clone();
//    }
//}

class GoodsItem implements Cloneable{
    String name;
    int id;
    Address address; //final


    public GoodsItem(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

//    public GoodsItem(GoodsItem goodsItem) {
//        this.name = goodsItem.name;
//        this.id = goodsItem.id;
//        this.address = new Address(goodsItem.address);
//    }

    @Override
    protected GoodsItem clone() throws CloneNotSupportedException {
        //IV
//        GoodsItem goodsItem = (GoodsItem) super.clone(); //Deep cloning
//        goodsItem.address = this.address.clone();
//        return goodsItem;
        return (GoodsItem) super.clone();
    }
}


