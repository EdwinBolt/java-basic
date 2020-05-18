package lambdas;

public class Main {

    interface Calc {
        int apply(int a, int b);
    }
//    static int calculate (Calc calc, int g1, int g2) {
//        return calc.apply(g1, g2);
//    }

    public static void main(String[] args) {
//        Calc add = new Calc() {
//            @Override
//            public int apply(int a, int b) {
//                return a + b;
//            }
//        };

        Calc add = (a,b) -> a+b;
        Calc multiply = (a,b) -> a*b;
        Calc substract = (a,b) -> a/b;

        int result = multiply.apply(3,4);
        System.out.println(result);
    }
}
