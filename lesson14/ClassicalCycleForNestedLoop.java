package lesson14;

/**
 * A class that demonstrates the classical cycle for nested loop in Java.
 */
public class ClassicalCycleForNestedLoop {
  /**
   * A method that prints the time.
   */
  public void time() {
  // Labeled loop
  OUTER:
    for (int hour = 0; hour <= 23; hour++) {
      System.out.println("Start outer loops");
    // Labeled loop
    INNER:
      for (int minute = 0; minute <= 59; minute++) {
        if (minute == 20) {
          continue OUTER;
        }
        System.out.println(hour + ":" + minute);

        if (minute == 30) {
          break INNER;
        }
      }
      System.out.println("End outer loops");
    }
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    ClassicalCycleForNestedLoop time = new ClassicalCycleForNestedLoop();
    time.time();
  }
}
