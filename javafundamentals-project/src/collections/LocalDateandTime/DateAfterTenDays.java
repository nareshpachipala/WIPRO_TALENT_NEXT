package LocalDateandTime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateAfterTenDays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.println("Today : " + date);
        System.out.println("After 10 days : " + date.plusDays(10));

        sc.close();
    }
}
