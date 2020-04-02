import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> maxTemperatures = new ArrayList<>();
        ArrayList<Integer> minTemperatures = new ArrayList<>();


        for (int i = 0; i<12; i++){
            System.out.println("give the highest temperature in month " + (i+1));
            maxTemperatures.add(scanner.nextInt());
            System.out.println("give the lowest temperature in month " + (i+1));
            minTemperatures.add(scanner.nextInt());
        }

    }
}
