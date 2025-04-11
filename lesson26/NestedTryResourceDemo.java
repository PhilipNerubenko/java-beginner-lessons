package lesson26;

import java.io.*;

public class NestedTryResourceDemo {
  FileInputStream fis1, fis2;
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

  public static void main(String[] args) {
    new NestedTryResourceDemo().abc();
  }
}
