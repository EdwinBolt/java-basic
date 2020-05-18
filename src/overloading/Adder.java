package overloading;

import java.math.BigInteger;

public class Adder {
    int add(int a, int b) {
        return a + b;

    }

    double add(double a, double b){
        return a+b;
    }

    BigInteger add(BigInteger a, BigInteger b){
        return a.add(b);
    }



}
