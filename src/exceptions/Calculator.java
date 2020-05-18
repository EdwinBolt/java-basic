package exceptions;

public class Calculator {

    public static void main(String[] args) {


        //Calculator calc = new Calculator();
        int a = 5, b = 0;
        try{
            int result = divide(a,b);
            System.out.println("xxx" +result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }




    private static int divide(int a, int b){
        return a/b;
    }
}
