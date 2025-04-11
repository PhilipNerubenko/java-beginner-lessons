package lesson26;

import java.io.*;

public class ExceptionRethrowDemo {
  static void abc() throws FileNotFoundException {
    try {
      File file1 = new File("test1.txt");
      FileInputStream fis1 = new FileInputStream(file1);
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      throw e;
    } finally {
      System.out.println("This block finally");
    }
  }

  void method() {
    try {
      abc();
    } catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException");
    }
  }

  static void def() {
    try {
      int[] array = {1, 2, 3};
      System.out.println(array[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException");
      throw e; // RuntimeException no need to process
    } finally {
      System.out.println("This block finally");
    }
  }
}
