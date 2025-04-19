package lesson26;

import java.io.*;

/**
 * A class that demonstrates the nested try resource in Java.
 */
public class NestedTryResourceDemo {
  /**
   * A FileInputStream object.
   */
  FileInputStream fis1, fis2;

  /**
   * A method that opens two files and closes them in the finally block.
   */
  public void abc() {
    try {
      fis1 = new FileInputStream("1.txt");
      try {
        fis2 = new FileInputStream("2.txt");
      } catch (FileNotFoundException e) {
        System.out.println("File not found 2.txt");
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found 1.txt");
    } finally {
      System.out.println("This finally");
      try {
        fis1.close();
        fis2.close();
      } catch (IOException e) {
        System.out.println("Exception finally code");
      }
    }
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    new NestedTryResourceDemo().abc();
  }
}
