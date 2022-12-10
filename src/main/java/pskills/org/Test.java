package pskills.org;

public class Test {
    public void print(Integer x) {
        System.out.print("Integer");
    }
    public void print(float x) {
        System.out.print("float");
    }
    public void print(Object x) {
        System.out.print("Object");
    }
    public static void main(String[] args) {
        Test t = new Test();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
    }




//    public static void main(String args[]) {
////        Integer intObj=Integer.valueOf(args[args.length-1]);
////        int i = intObj.intValue();
////
////        if(args.length > 1)
////            System.out.println(i);
////        if(args.length > 0)
////            System.out.println(i - 1);
////        else
////            System.out.println(i - 2);
////
////        for(int i = 1; i < 3; i++)
////            for(int j = 3; j > i; j--)
////                assert i!=j; {System.out.println(i); }
//    }
}
