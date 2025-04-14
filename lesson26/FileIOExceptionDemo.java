package lesson26;

import java.io.*;

/**
* A class that demonstrates the File I/O exception in Java.
*/
public class FileIOExceptionDemo {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  * @throws Exception If an exception occurs.
  */
 public static void main(String[] args) throws Exception {
   // abstract represents a path to a file or directory
   File f = new File("test9.txt");
   FileInputStream fis = new FileInputStream(f); // java.io.FileNotFoundException
   fis.read(); // IOException when you call close in circle
   fis.close();
   FileOutputStream fos = new FileOutputStream(f); // java.io.FileNotFoundException
   fos.write(100); // char, exception IOException
   fos.close();

   // IOException parent class for FileNotFoundException
 }
}

