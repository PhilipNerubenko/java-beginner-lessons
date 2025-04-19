package lesson26;

import java.io.*;

/**
 * A class that demonstrates exception propagation in Java.
 */
public class ExceptionPropagationDemo {
  /**
   * A method that throws a FileNotFoundException.
   *
   * @throws FileNotFoundException If a file is not found.
   */
  void abc() throws FileNotFoundException {
    File f = new File("test.txt");
    FileInputStream fis = new FileInputStream(f);
    System.out.println("Everybody good day!");
  }

  /**
   * A method that calls the abc method and throws a FileNotFoundException.
   *
   * @throws FileNotFoundException If a file is not found.
   */
  void def() throws FileNotFoundException {
    abc();
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    ExceptionPropagationDemo t = new ExceptionPropagationDemo();

    try {
      t.def();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
