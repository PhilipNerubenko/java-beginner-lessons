package lesson27;

import java.time.*;
import java.time.format.*;

/**
 * A class that demonstrates the date and time formatting in Java.
 */
public class DateTimeFormattingDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();

    // get methods for LocalDate and LocalDateTime
    System.out.println(today.getDayOfWeek());
    System.out.println(today.getDayOfMonth());
    System.out.println(today.getDayOfYear());
    System.out.println(today.getMonth());
    System.out.println(today.getMonthValue());
    System.out.println(today.getYear());

    // get methods for LocalTime and LocalDateTime
    System.out.println("\n" + time.getHour());
    System.out.println(time.getMinute());
    System.out.println(time.getSecond());
    System.out.println(time.getNano());

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    // DateTimeFormatter formatter2 = DateTimeFormatter.ISO_LOCAL_DATE;
    System.out.println("Before formatter: " + today);
    System.out.println(today.format(DateTimeFormatter.ISO_LOCAL_DATE));

    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd,MMMM,yyyy HH:mm");
    DateTimeFormatter formatter4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    System.out.println("Before formatter: " + dateTime);
    System.out.println(dateTime.format(formatter4));

    System.out.println("Before formatter: " + dateTime);
    System.out.println(dateTime.format(formatter));
    System.out.println("Before formatter: " + dateTime);
    System.out.println(dateTime.format(formatter3));

    System.out.println("Before formatter: " + dateTime);
    System.out.println(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE));

    DateTimeFormatter shorting1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter shorting2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    DateTimeFormatter shorting3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

    System.out.println("Before formatter LocalDate: " + today);
    System.out.println(today.format(shorting1));
    System.out.println("Before formatter LocalTime: " + time);
    System.out.println(shorting2.format(time));
    System.out.println("Before formatter LocalDateTime: " + dateTime);
    System.out.println(dateTime.format(shorting3));

    DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd,MMMM,yyyy");
    LocalDate parseDate = LocalDate.parse("04,апреля,2019", formatter5);
    System.out.println("Method parse: " + parseDate);
    LocalDate parseDate2 = LocalDate.parse("2019-04-04"); // default ISO_LOCAL_DATE
    System.out.println("Method parse: " + parseDate2);
  }
}
