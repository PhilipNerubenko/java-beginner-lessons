package lesson6;

/**
 * A class that demonstrates method overloading in Java.
 */
public class MethodOverloading {
  /**
   * A method that prints the value and data type of an integer.
   *
   * @param x The integer value.
   */
  void show(int x) {
    System.out.println("x: " + x);
    System.out.println("Data Type is int");
  }

  /**
   * A method that prints the value and data type of a double.
   *
   * @param x The double value.
   */
  void show(double x) {
    System.out.println("x: " + x);
    System.out.println("Data Type is double");
  }

  /**
   * A method that prints the value and data type of a boolean.
   *
   * @param x The boolean value.
   */
  void show(boolean x) {
    System.out.println("x: " + x);
    System.out.println("Data Type is boolean");
  }

  /**
   * A method that prints the value and data type of a string.
   *
   * @param x The string value.
   */
  void show(String x) {
    System.out.println("x: " + x);
    System.out.println("Data Type is String");
  }

  /**
   * A method that prints the values of a string and an integer.
   *
   * @param x The string value.
   * @param y The integer value.
   */
  void show(String x, int y) {
    System.out.println("String is: " + x + " int is: " + y);
  }

  /**
   * A method that prints the values of an integer and a string.
   *
   * @param y The integer value.
   * @param x The string value.
   */
  void show(int y, String x) {
    System.out.println("int is: " + y + " String is: " + x);
  }
}

/**
 * A class that tests the MethodOverloading class.
 */
class MethodOverloadingTest {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    MethodOverloading obj = new MethodOverloading();
    obj.show(10);
    obj.show(10.0);
    obj.show(true);
    obj.show("Hello");
    obj.show("Hello", 10);
    obj.show(10, "Hello");
  }
}
