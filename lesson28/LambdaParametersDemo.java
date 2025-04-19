package lesson28;

/**
 * A class that demonstrates the lambda parameters in Java.
 */
public class LambdaParametersDemo {
  /**
   * A method that takes in a StringCalculator.
   *
   * @param t The StringCalculator.
   */
  static void def(StringCalculator t) {
    // System.out.println(t.abc("Hello"));
    System.out.println(t.abc("hello", "bye"));
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // def(x -> x.length()); // size of string word "hello"
    def((x, y) -> x.length() + y.length()); // size of string word "hello" and "bye"
  }
}

/**
 * An interface that represents a StringCalculator.
 */
interface StringCalculator {
  // int abc(String s);
  /**
   * A method that takes in two strings.
   *
   * @param s1 The first string.
   * @param s2 The second string.
   * @return An integer.
   */
  int abc(String s1, String s2);
}
