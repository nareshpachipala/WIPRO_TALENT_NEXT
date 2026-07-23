package LocalDateandTime;

import java.time.LocalTime;

public class TimeAfter25Minutes {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println("Current Time : " + time);
        System.out.println("After 25 minutes : " + time.plusMinutes(25));
    }
}
