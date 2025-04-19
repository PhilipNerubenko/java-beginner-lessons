package lesson26;

import java.io.*;

/**
 * A class that demonstrates the file stream closure in Java.
 */
public class FileStreamClosureDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    StringBuilder result = new StringBuilder("");
    try {
      File f = new File("test9.txt");
      System.out.println("Faile created: " + f.createNewFile());
      FileInputStream fis = new FileInputStream(f);
      System.out.println("fis: " + fis.available());
      int count = 0;
      while (true) {
        count++;
        result.append((char) fis.read());
        System.out.println("Information read from file: " + result.toString());
        if (count == 3) {
          fis.close();
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Exception 1: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Exception 2: " + e.getMessage());
    } finally {
      System.out.println("This finally!");
    }
  }
}
