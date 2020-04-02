import java.util.Scanner;
import java.util.ArrayList;

public class Opdracht11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> productNumber = new ArrayList<>();
        ArrayList<Integer> retailPrice = new ArrayList<>();

        productNumber.add(1);
        productNumber.add(2);
        productNumber.add(3);
        productNumber.add(4);
        productNumber.add(5);
        retailPrice.add(295);
        retailPrice.add(499);
        retailPrice.add(549);
        retailPrice.add(780);
        retailPrice.add(885);

        System.out.println("give product number");
        Integer productGiven = scanner.nextInt();

        System.out.println("give quantity");
        Integer quantity = scanner.nextInt();

        Integer itemPrice = retailPrice.get(productNumber.indexOf(productGiven));

        double outputvalue = quantity * itemPrice;
        outputvalue /=100;

        System.out.println("total retail value: " + outputvalue);

    }
}