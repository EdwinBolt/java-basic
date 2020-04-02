import java.util.ArrayList;

public class Opdracht27 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i<20; i++){
            scores.add(80+i);
        }

        int studentCounter = 0;

        for (int i = 0; i< scores.size(); i++){
            if (scores.get(i) >= 85 && scores.get(i) <= 90){
                studentCounter += 1;
            }
        }

        System.out.println(studentCounter + " students");

    }
}
