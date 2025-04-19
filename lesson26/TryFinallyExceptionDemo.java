package lesson26;

import java.io.*;

/**
 * A class that demonstrates the try-finally exception in Java.
 */
public class TryFinallyExceptionDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    File f = new File("test9.txt");

    try {
      FileInputStream fis = new FileInputStream(f);
      System.out.println("Everybody good day");
    } catch (FileNotFoundException e) {
      System.out.println("Exception: " + e);
    } catch (NullPointerException e) {
      System.out.println("Exception: " + e);
    } finally {
      System.out.println("Bye everybody!");
    }

    System.out.println("Code have not exception");
  }
}
