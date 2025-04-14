package lesson26;

/**
* A class that demonstrates the stack overflow error in Java.
*/
public class StackOverflowErrorDemo {
 /**
  * A method that calls itself recursively.
  */
 static void bcv() {
   System.out.println("Run method abc");
   bcv();
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   // RuntimeException and Error - unchecked exceptions, they should not be processed
   try {
     bcv();
   } catch (StackOverflowError e) {
     System.out.println("Error: " + e);
   }
 }
}

