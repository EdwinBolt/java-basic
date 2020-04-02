import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> inputNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            System.out.println("number" + (i+1));
            inputNumbers.add(scanner.nextInt());
        }

        int counterAboveSevens = 0;

        for (int i = 0; i<inputNumbers.size(); i++){
            if (inputNumbers.get(i) > 7){
                counterAboveSevens += 1;
            }
        }

        System.out.println(counterAboveSevens + " numbers higher than 7");

    }
}
