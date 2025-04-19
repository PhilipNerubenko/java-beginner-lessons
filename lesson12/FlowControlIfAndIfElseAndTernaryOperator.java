package lesson12;

/**
 * A class that demonstrates flow control using if, if-else, and the ternary operator.
 */
public class FlowControlIfAndIfElseAndTernaryOperator {
  /**
   * A method that prints the maximum of three integers.
   *
   * @param a The first integer.
   * @param b The second integer.
   * @param c The third integer.
   */
  void max(int a, int b, int c) {
    if (a > b && a > c) {
      System.out.println("a is maximum");
    } else if (b > a && b > c) {
      System.out.println("b is maximum");
    } else {
      System.out.println("c is maximum");
    }
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    FlowControlIfAndIfElseAndTernaryOperator fct = new FlowControlIfAndIfElseAndTernaryOperator();

    fct.max(1, 2, 3);

    int a = 10;
    int b = 15;
    int max = (a > b) ? a : b;
    System.out.println("Max: " + max);
  }
}
