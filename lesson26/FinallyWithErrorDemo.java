package lesson26;

/**
 * A class that demonstrates the finally block with an error in Java.
 */
public class FinallyWithErrorDemo {
  /**
   * A method that throws a StackOverflowError.
   */
  void method1() {
    System.out.println("method1");
    throw new StackOverflowError();
  }

  /**
   * A method that calls the method1 method and has a finally block.
   */
  void method2() {
    try {
      method1();
      return;
    } finally {
      System.out.println("finally");
    }
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    FinallyWithErrorDemo test18 = new FinallyWithErrorDemo();
    test18.method2();
  }
}
