import java.util.Scanner;

public class Opdracht19 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a word");

        String substringInput = scanner.nextLine();
        int matches=0;

        while (substringInput.contains("a")) {
            matches += 1;
            substringInput = substringInput.substring(substringInput.indexOf("a")+1, substringInput.length()-substringInput.indexOf("a") +1);

        }
        System.out.println(matches + " occurances of 'a'");

    }
}
