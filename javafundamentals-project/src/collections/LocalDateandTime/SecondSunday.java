package LocalDateandTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class SecondSunday {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        LocalDate firstDayNextMonth = date.plusMonths(1).withDayOfMonth(1);
        LocalDate firstSunday = firstDayNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Second Sunday of next month : " + secondSunday);

        sc.close();
    }
}