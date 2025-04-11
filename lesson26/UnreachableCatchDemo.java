package lesson26;

import java.io.*;

public class UnreachableCatchDemo {
  // void abc() throws Exception{
  //     System.out.println("OK");
  // }
  static void abc() {
    System.out.println("OK");
  }
  public static void main(String[] args) {
    try {
      abc();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error");
    }
    // catch (IOException e) { // not allowed
    //     System.out.println("Error");
    // }
    finally {
      System.out.println("Finally");
    }
  }
}
