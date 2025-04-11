package lesson26;

import java.io.*;

public class FinallyReturnValueDemo {
  static int abc() {
    int a = 4;
    try {
      File file1 = new File("test1.txt");
      FileInputStream fis1 = new FileInputStream(file1);
    } catch (FileNotFoundException e) {
      a = 5;
      System.out.println("File not found");
      System.out.println("variable a = " + a);
      return a;
    } finally {
      a = 10;
      System.out.println("This block finally");
      System.out.println("variable a = " + a);
      // return 7; // this code will be executed after return
    }
    return a;
  }

  static StringBuilder def() {
    StringBuilder a = new StringBuilder("Hello");
    try {
      File file1 = new File("test1.txt");
      FileInputStream fis1 = new FileInputStream(file1);
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      System.out.println("variable a = " + a);
      return a;
    } finally {
      a.append("!!!");
      System.out.println("This block finally");
      System.out.println("variable a = " + a);
      // return 7; // this code will be executed after return
    }
    return a;
  }
  public static void main(String[] args) {
    System.out.println(abc() + "\n"); // 5
    System.out.println(def()); // Hello!!!
  }
}