public class Opdracht15 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i < 20; i++){
            if ((i+1) % 2 == 1) {
                System.out.println(i + 1);
                sum = sum + (i + 1);
            }
        }

        System.out.println(sum);
    }
}
