import java.util.Scanner;
public class Opdracht21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give a number");
        String number = scanner.nextLine();
        String[] digits = number.split("");

        int sum = 0;
        for (int i=0; i<number.length();i++){

            sum += Integer.parseInt(digits[i]);

        }
        System.out.println(sum);
        //for (int i = 0; i<number)


    }
}
