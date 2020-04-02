import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("provide article");
        String article = scanner.nextLine();

        System.out.println("provide noun");
        String noun = scanner.nextLine();

        System.out.println("provide verb");
        String verb = scanner.nextLine();


        System.out.println(article + " " + noun + " " + verb);

    }
}
