import  java.util.ArrayList;

public class Opdracht22 {
    public static void main(String[] args) {

        int tryNumber = 1;
        ArrayList<Integer> primes = new ArrayList<>();

        do {
            boolean possiblePrime=true;
            for (int i = 0; i<tryNumber; i++){
                switch (i){
                    case 0:
                    case 1:
                        break;
                    default:
                        if (tryNumber % (i) == 0) {
                            possiblePrime = false;
                            //System.out.println(".");
                        }
                }


            }
            if (possiblePrime){
                primes.add(tryNumber);
                System.out.println(tryNumber);
            }
            tryNumber += 1;
        }while (primes.size()<10);



    }
}
