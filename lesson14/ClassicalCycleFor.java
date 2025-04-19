package lesson14;

/**
 * A class that demonstrates the classical cycle for in Java.
 */
public class ClassicalCycleFor {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("Lesson №14");
    }

    for (int i = 0; i < 11; i++, abc(10)) {
      System.out.println(i);
    }

    for (int i = 10; i >= 0; i--) {
      System.out.println(i);
    }
    // for (int i = 0;;) { //endless loop
    // for (int i = 0;;) {
    //     System.out.println(i);
    // }
    for (int i = 2; i < 30; i += 2) {
      System.out.println(i);
    }

    int a = 15;
    // no best practice
    if (a > 10)
      for (int i = 1; i <= 10; i++) System.out.println(i);
    // best practice
    if (a > 10) {
      for (int i = 1; i <= 10; i++) {
        System.out.println(i);
      }
    }
  }

  /**
   * A static method that prints the value of i.
   *
   * @param i The value to be printed.
   */
  static void abc(int i) {
    System.out.println("abc " + i);
  }
}
