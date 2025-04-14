package lesson25;

/**
* A class that demonstrates the initialization order in Java.
*/
public class InitializationOrderDemo {
 // constructor
 /**
  * A constructor for the InitializationOrderDemo class.
  */
 public InitializationOrderDemo() {
   System.out.println("Hello from constructor");
   System.out.println(s);
 }

 /**
  * A string field.
  */
 String s = "another string";

 // initialization block
 {
   int i = 1;
   System.out.println("Hello calls created Object InitializationOrderDemo ");
   System.out.println("Value of i = " + i);
   System.out.println(s);
 }

 // static initialization block
 static {
   System.out.println("Hello from static block");
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   InitializationOrderDemo t5 = new InitializationOrderDemo();
   InitializationOrderDemo t51 = new InitializationOrderDemo();
   System.out.println("Hello from main");
 }
}

