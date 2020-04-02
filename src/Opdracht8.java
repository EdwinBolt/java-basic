import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht8 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            System.out.println("provide number " + (i+1));
            numbers.add(scanner.nextInt());
        }

        int maxValue = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > maxValue) {
                maxValue = numbers.get(i);
            }
        }
        System.out.println("largest value = " + maxValue);



    }
}
