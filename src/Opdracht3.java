import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("give the length of the first side of the triangle");
        double side1 = scanner.nextDouble();

        System.out.println("give te length of the second side of the triangle");
        double side2 = scanner.nextDouble();

        double summedSquares = (side1 * side1) + (side2 * side2);
        double hypotenuse;
        hypotenuse = Math.sqrt(summedSquares);

        System.out.print("hypotenuse = " + hypotenuse);
    }
}
