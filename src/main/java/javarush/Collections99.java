package javarush;

import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
//
//class Collections99 {
//
//    public class Solution {
//        public static void main(String[] args) {
//
//        }
//
//        public static boolean isPalindromePermutation(String s) {
//            if (s==null || s.length()==0) return false;
//            HashMap<String, Integer> map = new HashMap<>();
//            String[] tempStr = s.toLowerCase(Locale.ROOT).split("");
//            int count = 1;
//            for (String str: tempStr){
//                if (!(map.containsKey(str))){
//                    map.put(str, count);
//                }else {
//                    count++;
//                    map.put(str, count);
//                }
//                count = 1;
//            }
//            Collection<Integer> val = map.values();
//            int nechet = 0;
//            for (Integer c: val){
//                if (c % 2 != 0) {
//                    nechet++;
//                }
//            }
//            if (tempStr.length%2==0 && nechet == 0){
//                return true;
//            }else if (tempStr.length%2 != 0 && nechet == 1){
//                return true;
//            }else {
//                return false;
//            }
//        }
//    }
//}
