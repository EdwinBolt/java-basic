import  java.util.ArrayList;
import  java.util.Scanner;

public class Opdracht23 {
    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();
        ArrayList<String> geboortedatum = new ArrayList<>();
        ArrayList<String> telefoonnr = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        namen.add("jan");
        namen.add("piet");
        namen.add("henk");
        geboortedatum.add("18 okt 1999");
        geboortedatum.add("2 jun 1943");
        geboortedatum.add("4 feb 2001");
        telefoonnr.add("061234567890");
        telefoonnr.add("065485512365");
        telefoonnr.add("069854712354");

        System.out.println("name:");
        String searchName = scanner.nextLine();

        boolean matchFound=false;
        int entry= 0;

        for (int i=0; i<namen.size(); i++){
            if (namen.get(i).matches(searchName)){
                matchFound=true;
                entry=i;
            }
        }
        if (!matchFound){
            System.out.println("name not found");
        } else{
            System.out.println("birth date: " + geboortedatum.get(entry) + ", phone nr: " + telefoonnr.get(entry));
        }

    }
}
