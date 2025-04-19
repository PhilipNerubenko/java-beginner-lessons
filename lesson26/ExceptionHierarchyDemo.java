package lesson26;

import java.io.*;

/**
 * A class that demonstrates the exception hierarchy in Java.
 */
public class ExceptionHierarchyDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    try {
      File f = new File("test.txt");
      FileInputStream fis = new FileInputStream(f);
    }
    // Sequence matters
    catch (NullPointerException e) {
      System.out.println("Exception 1: " + e.getMessage());
    } catch (FileNotFoundException e) {
      System.out.println("Exception 2: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Exception 3: " + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Exception 4: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Exception 5: " + e.getMessage());
    } catch (Throwable e) {
      System.out.println("Exception 6: " + e.getMessage());
    }
  }
}
