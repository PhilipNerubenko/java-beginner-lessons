package lesson27;

import java.time.*;

public class DateTimeComparisonDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, 1, 20);
        LocalDate date1 = LocalDate.of(2014, Month.JANUARY, 18);

        System.out.println(date.isAfter(date1));
        System.out.println(date.isBefore(date1));
        System.out.println(date.equals(date1));
        System.out.println(date.compareTo(date1));
        System.out.println(date.isLeapYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());

        LocalTime time = LocalTime.of(5, 15);
        LocalTime time1 = LocalTime.of(6, 15, 30, 200);

        System.out.println("\n" + time.isAfter(time1));
        System.out.println(time.isBefore(time1));
        System.out.println(time.equals(time1));
        System.out.println(time.compareTo(time1));
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getNano());
        System.out.println(time.getSecond());

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
        System.out.println("\n" + dateTime.isAfter(dateTime1));
        System.out.println(dateTime.isBefore(dateTime1));
        System.out.println(dateTime.equals(dateTime1));
        System.out.println(dateTime.compareTo(dateTime1));
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getDayOfYear());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getNano());
        System.out.println(dateTime.getSecond());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getMonthValue());
        System.out.println(dateTime.getYear());

    }
}
