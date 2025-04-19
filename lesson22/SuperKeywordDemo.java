package lesson22;

/**
 * A class that demonstrates the super keyword in Java.
 */
public class SuperKeywordDemo {
  /**
   * A string field.
   */
  String s1 = "hello";

  /**
   * A static double field.
   */
  static double d1 = 3.14;

  /**
   * A method that returns the sum of the given integers.
   *
   * @param i The integers.
   * @return The sum of the given integers.
   */
  int summa(int... i) {
    int res = 0;
    for (int a : i) {
      res += a;
    }
    return res;
  }

  /**
   * A static method that prints "static method".
   */
  static void abc() {
    System.out.println("static method");
  }
}

/**
 * A class that extends SuperKeywordDemo.
 */
class B8 extends SuperKeywordDemo {
  /**
   * A string field.
   */
  String s2 = super.s1 + " world";

  /**
   * A double field.
   */
  double d2 = super.d1; // static is ok here
  // analogous to
  // String s2 = s1 + " world";

  // recommended to avoid "super" in field declarations
  // String s1 = super.s1 + " world";

  /**
   * A boolean field.
   */
  boolean s1 = true;

  // static String s1 = super.s1; // doesn't work - static not allowed

  /**
   * A method that returns the sum of the given integers.
   *
   * @param i The integers.
   * @return The sum of the given integers.
   */
  int summa(int... i) {
    int res = super.summa(i);
    System.out.println("Super summa: " + res);
    super.abc();
    return res;
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    B8 b = new B8();
    System.out.println(b.s2);
    System.out.println(b.s1);
    // System.out.println(super.s1); // doesn't work - super not allowed in static methods
  }
}
