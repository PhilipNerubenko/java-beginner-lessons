package lesson27;

import java.time.*;

/**
 * A class that demonstrates the period scheduling in Java.
 */
public class PeriodSchedulingDemo {
  /**
   * A method that changes the duty officer.
   *
   * @param starting The starting date.
   * @param ending The ending date.
   * @param p The period.
   */
  static void changeOfDutyOfficer(LocalDate starting, LocalDate ending, Period p) {
    LocalDate date = starting;
    while (date.isBefore(ending)) {
      System.out.println("Data change officer: " + date);
      date = date.plus(p);
    }
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Period p = Period.ofYears(2);
    Period p2 = Period.ofMonths(1);
    Period p3 = Period.ofDays(2);
    Period p4 = Period.of(2, 1, 1);
    // LocalTime time = LocalTime.of(20, 30);
    // time.plus(p); //java.time.temporal.UnsupportedTemporalTypeException

    changeOfDutyOfficer(LocalDate.of(2018, 1, 1), LocalDate.of(2020, 1, 1), Period.ofWeeks(2));
    System.out.println(p);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
  }
}
