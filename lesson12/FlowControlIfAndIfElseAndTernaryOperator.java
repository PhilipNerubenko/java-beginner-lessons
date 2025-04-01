package lesson12;

public class FlowControlIfAndIfElseAndTernaryOperator {
  void max(int a, int b, int c) {
    if (a > b && a > c) {
      System.out.println("a is maximum");
    } else if (b > a && b > c) {
      System.out.println("b is maximum");
    } else {
      System.out.println("c is maximum");
    }
  }
  public static void main(String[] args) {
    FlowControlIfAndIfElseAndTernaryOperator fct = new FlowControlIfAndIfElseAndTernaryOperator();

    fct.max(1, 2, 3);

    int a = 10;
    int b = 15;
    int max = (a > b) ? a : b;
    System.out.println("Max: " + max);
  }
}
