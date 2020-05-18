package staticImport;

import static java.lang.Math.*;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
        System.out.println(area(radius));
        System.out.println(perimeter(radius));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);

    }

    double area(int radius){
        return PI*radius*radius;
    }

    double perimeter(int radius){
        return PI*2*radius;
    }
}
