package LocalDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getMonth() + ", " + today.getYear());

        LocalDate twoWeeksFromNow = LocalDate.now().plusWeeks(2);
        System.out.println(twoWeeksFromNow);

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour() + ":" +now.getMinute());

        DateTimeFormatter dutchFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(today.format(dutchFormat));
    }
}
