package lesson26;

/**
* A class that demonstrates basic exceptions in Java.
*/
public class ExceptionBasicDemo {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   int array[] = {1, 4, 0};
   String s = null;

   System.out.println(s.length()); // NullPointerException
   System.out.println(array[5]); // ArrayIndexOutOfBoundsException
   System.out.println("hello");
 }
}
