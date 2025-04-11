package lesson27;

import java.time.*;

public class DurationPeriodDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.JANUARY, 1);
        
        // Period period = Period.ofMonths(3).ofDays(10); // method chaining not working
        // Period period1 = Period.ofMonths(3);
        // period1 = Period.ofDays(10);

        // System.out.println(date.plus(period));
         // System.out.println(period1);

        LocalTime time = LocalTime.of(10, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration d = Duration.ofDays(10);
        Duration d1 = Duration.ofHours(3);
        Duration d2 = Duration.ofMinutes(5);
        Period p = Period.ofDays(10);

        // System.out.println(date.plus(d)); // java.time.temporal.UnsupportedTemporalTypeException
        System.out.println(time.plus(d));
        System.out.println(time.plus(d1));
        System.out.println(time.plus(d2));

        System.out.println(dateTime.plus(d));
        System.out.println(dateTime.plus(d1));
        System.out.println(dateTime.plus(d2));
        System.out.println(dateTime.plus(p));
       
    }
}
