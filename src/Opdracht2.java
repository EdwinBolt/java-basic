import java.util.Scanner;
public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef temperatuur in graden Celsius");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius*1.8) + 32;

        System.out.println("temperature is " + fahrenheit + " degrees Fahrenheit");

    }
}
