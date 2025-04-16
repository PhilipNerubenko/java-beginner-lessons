package lesson26;

import java.io.*;

/**
* A class that demonstrates the nested stream exception in Java.
*/
public class NestedStreamExceptionDemo {
 /**
  * A FileInputStream object.
  */
 static FileInputStream fis1, fis2;

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   try {
     fis1 = new FileInputStream("text1.txt");
     System.out.println("File 1 opened");
     try {
       fis2.close();
     } catch (IOException e) {
       System.out.println("Exception methods fis2.close()");
     }
   } catch (FileNotFoundException e) {
     System.out.println("File not found");
   } catch (NullPointerException e) {
     System.out.println("NullPointerException");
   }
 }
}

