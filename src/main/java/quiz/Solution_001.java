package quiz;

public class Solution_001 {
    public static void main(String[] args) {
        sum();
    }
    public static int sum(){
        try{
            int a = 5+2;
            return a;
        }catch (Exception e){
            e.getMessage();
        }finally {
            int b = 4+5;
            return b;
        }
    }
}
