package lesson26;

/**
 * A class that demonstrates the null exception throw in Java.
 */
public class NullExceptionThrowDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   * @throws Exception If an exception occurs.
   */
  public static void main(String[] args) throws Exception {
    Exception exception = null;
    throw exception;
  }
}
