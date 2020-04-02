import java.util.Scanner;

public class Opdracht9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("give a number in the range of 1 through 10");
            inputNumber = scanner.nextInt();

        }while (inputNumber<1 || inputNumber > 10);
    }
}
