//package Java_405_lessons.Patterns.Pattern_12_Iterator;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class IteratorPatternLesson {
//    public static void main(String[] args) {
//        Menu menu = new Menu();
//        MyIterator<String> iterator = menu.getMyIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        Iterator<String> iteratorItr = menu.getIteratorItr();
//        while (iteratorItr.hasNext()) {
//            System.out.println(iteratorItr.next());
//        }
//
//        for(String str: new Menu()) {
//
//        }
//
//    }
//}
//
//class Menu implements Iterator<String>{
//    //    String[] items = {"one", "two", "three"}; I
//    List<String> items = new ArrayList<>();
//
//    public Menu() {
//        items.add("one");
//        items.add("two");
//        items.add("three");
//    }
//
//    MyIterator<String> getMyIterator() {
//        return new MyIterator<String>() {
//            int i;
//
//            @Override
//            public boolean hasNext() {
////                return i < items.length;
//                return i < items.size();
//            }
//
//            @Override
//            public String next() {
////                return items[i++];
//                return items.get(i++);
//            }
//        };
//    }
//
//    @Override
//    public boolean hasNext() {
//        return false;
//    }
//
//    @Override
//    public String next() {
//        return null;
//    }
////    void printMenu(){
////    }
//}
//
//interface MyIterator<T> {
//    boolean hasNext();
//
//    T next();
//}
