package javarush;

public class ObjectsAndReferences {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        Hotel h2 = new Hotel();
        Hotel h3 = h2;
        Hotel h5 = h2;

        h2.rating = 9;
        h3.rating = 8;
        h1.rating = 7;
        h5.rating = 6;

        String str2 = new String("one");
        System.out.println("str2 = " + str2);
        String str3 = str2;
        System.out.println("str3 = " + str3);
        str2 = "two+";
        System.out.println("str2 = " + str2);
        str3 = "three+";
        System.out.println("str3 = " + str3);
        System.out.println("str2 = " + str2);
        System.out.println(h2.rating);
    }
}

class Hotel {
    String name;
    String address;
    int rating;
}

