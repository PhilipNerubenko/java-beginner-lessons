package lesson27;

import java.time.*;

/**
 * A class that demonstrates the date and time manipulation in Java.
 */
public class DateTimeManipulationDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // System.out.println(LocalDate.now());
    // System.out.println(LocalTime.now());
    // System.out.println(LocalDateTime.now());

    // LocalDate, LocalTime and LocalDateTime Immutable Classes
    LocalDate date = LocalDate.of(2020, 1, 25);
    System.out.println("Old date: " + date);
    date.plusDays(5);
    System.out.println("New date: " + date);

    date = date.plusDays(5);
    System.out.println("Change date plus: " + date);
    date = date.minusDays(5);
    System.out.println("Change date minus: " + date);
    date = date.plusWeeks(3);
    System.out.println("Change date plus weeks: " + date);
    date = date.minusWeeks(3);
    System.out.println("Change date minus weeks: " + date);
    date = date.plusMonths(3);
    System.out.println("Change date plus months: " + date);
    date = date.minusMonths(3);
    System.out.println("Change date minus months: " + date);
    date = date.plusYears(3);
    System.out.println("Change date plus years: " + date);
    date = date.minusYears(3);
    System.out.println("Change date minus years: " + date);

    LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 25);
    System.out.println(date2);

    LocalTime time = LocalTime.of(23, 15);
    System.out.println(time);
    time = time.plusHours(5);
    System.out.println("Change time plus: " + time);
    time = time.minusHours(5);
    System.out.println("Change time minus: " + time);
    time = time.plusMinutes(5);
    System.out.println("Change time plus minutes: " + time);
    time = time.minusMinutes(5);
    System.out.println("Change time minus minutes: " + time);
    time = time.plusSeconds(5);
    System.out.println("Change time plus seconds: " + time);
    time = time.minusSeconds(5);
    System.out.println("Change time minus seconds: " + time);
    time = time.plusNanos(5);
    System.out.println("Change time plus nanos: " + time);
    time = time.minusNanos(5);
    System.out.println("Change time minus nanos: " + time);
    time = time.minusHours(5).plusMinutes(4).plusSeconds(5).plusNanos(3);
    System.out.println("Change time: " + time);

    LocalTime time2 = LocalTime.of(23, 15, 30);
    System.out.println(time2);

    LocalTime time3 = LocalTime.of(23, 15, 30, 999999999);
    System.out.println(time3);

    LocalDateTime dateTime = LocalDateTime.of(2020, Month.JANUARY, 25, 23, 15);
    System.out.println(dateTime);
    dateTime = dateTime.plusDays(5);
    System.out.println("Change date plus: " + dateTime);
    dateTime = dateTime.minusDays(5);
    System.out.println("Change date minus: " + dateTime);
    dateTime = dateTime.plusWeeks(3);
    System.out.println("Change date plus weeks: " + dateTime);
    dateTime = dateTime.minusWeeks(3);
    System.out.println("Change date minus weeks: " + dateTime);
    dateTime = dateTime.plusMonths(3);
    System.out.println("Change date plus months: " + dateTime);
    dateTime = dateTime.minusMonths(3);
    System.out.println("Change date minus months: " + dateTime);
    dateTime = dateTime.plusYears(3);
    System.out.println("Change date plus years: " + dateTime);
    dateTime = dateTime.minusYears(3);
    System.out.println("Change date minus years: " + dateTime);
    dateTime = dateTime.plusHours(5);
    System.out.println("Change time plus: " + dateTime);
    dateTime = dateTime.minusHours(5);
    System.out.println("Change time minus: " + dateTime);
    dateTime = dateTime.plusMinutes(5);
    System.out.println("Change time plus minutes: " + dateTime);
    dateTime = dateTime.minusMinutes(5);
    System.out.println("Change time minus minutes: " + dateTime);
    dateTime = dateTime.plusSeconds(5);
    System.out.println("Change time plus seconds: " + dateTime);
    dateTime = dateTime.minusSeconds(5);
    System.out.println("Change time minus seconds: " + dateTime);
    dateTime = dateTime.plusNanos(5);
    System.out.println("Change time plus nanos: " + dateTime);
    dateTime = dateTime.minusNanos(5);
    System.out.println("Change time minus nanos: " + dateTime);
    dateTime = dateTime.minusHours(5)
                   .plusMinutes(4)
                   .plusSeconds(5)
                   .plusNanos(3)
                   .plusDays(5)
                   .plusYears(3)
                   .minusMonths(3)
                   .minusDays(5);
    System.out.println("Change time: " + dateTime);

    LocalDateTime dateTime1 = LocalDateTime.of(date, time2);
    System.out.println(dateTime1);

    LocalDateTime dateTime2 = LocalDateTime.of(date, time3);
    System.out.println(dateTime2);

    // LocalDate date3 = LocalDate.of(2020,15,25); // DateTimeException
    // LocalDate date4 = LocalDate.of(2020,15,65); // DateTimeException
  }
}
