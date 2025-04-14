package lesson26;

/**
* A class that demonstrates the initializer error in Java.
*/
public class InitializerErrorDemo {
 // static {
 //     int a = Integer.parseInt("12t"); // java.lang.ExceptionInInitializerError
 // }
 // static String s = null;
 // static int a = s.length(); // java.lang.ExceptionInInitializerError
 static String s = abc();

 /**
  * A method that returns a string.
  *
  * @return A string.
  */
 static String abc() {
   String[] array = {"1", "2"};
   return array[100]; // java.lang.ExceptionInInitializerError
 }
}

