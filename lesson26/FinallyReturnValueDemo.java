package lesson26;

import java.io.*;

/**
* A class that demonstrates the finally return value in Java.
*/
public class FinallyReturnValueDemo {
 /**
  * A method that returns an integer.
  *
  * @return An integer.
  */
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

 /**
  * A method that returns a StringBuilder.
  *
  * @return A StringBuilder.
  */
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

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   System.out.println(abc() + "\n"); // 5
   System.out.println(def()); // Hello!!!
 }
}
