package lesson26;

import java.io.*;

/**
* A class that demonstrates the unreachable catch in Java.
*/
public class UnreachableCatchDemo {
 // void abc() throws Exception{
 //     System.out.println("OK");
 // }
 /**
  * A method that prints "OK".
  */
 static void abc() {
   System.out.println("OK");
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
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

