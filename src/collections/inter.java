package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class inter {

    public static void main(String[] args) {

        List<Integer> rij = new ArrayList<Integer>();
        rij.add(1);
        rij.add(2);
        rij.add(3);

        for (int i: rij){
            System.out.println(i);
        }

        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1,"first");
        hash.put(2,"second");
        hash.put(3,"third");

    }

}
