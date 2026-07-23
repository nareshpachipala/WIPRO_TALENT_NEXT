package LocalDateandTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExperienceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter joining date (yyyy-mm-dd): ");
        LocalDate joinDate = LocalDate.parse(sc.nextLine());

        LocalDate today = LocalDate.now();
        Period p = Period.between(joinDate, today);

        System.out.println("Years  : " + p.getYears());
        System.out.println("Months : " + p.getMonths());
        System.out.println("Days   : " + p.getDays());

        sc.close();
    }
}
