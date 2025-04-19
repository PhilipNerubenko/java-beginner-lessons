package lesson26;

/**
 * A class that demonstrates exceptions in the catch block in Java.
 */
public class ExceptionInCatchDemo {
  /**
   * A method that prints the length of an array.
   */
  void abc() {
    int[] array = {1, 2, 3};

    try {
      System.out.println(array[4]);
    } catch (ArrayIndexOutOfBoundsException e) {
      String s = null;
      System.out.println(s.length()); // not catch this exception
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    }
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    ExceptionInCatchDemo t12 = new ExceptionInCatchDemo();
    t12.abc();
  }
}
