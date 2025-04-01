package lesson14;

public class ClassicalCycleForNestedLoop {
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

  public static void main(String[] args) {
    ClassicalCycleForNestedLoop time = new ClassicalCycleForNestedLoop();
    time.time();
  }
}
