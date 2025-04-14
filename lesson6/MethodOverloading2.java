package lesson6;

/**
* A class that demonstrates method overloading in Java.
*/
public class MethodOverloading2 {
 /**
  * A method that calculates the sum of two integers.
  *
  * @param a The first integer.
  * @param b The second integer.
  * @return The sum of the two integers.
  */
 public int sum(int a, int b) {
   return a + b;
 }

 /**
  * A method that concatenates two strings.
  *
  * @param a The first string.
  * @param b The second string.
  * @return The concatenated string.
  */
 protected String sum(String a, String b) {
   return a + b;
 }
}


/**
* A class that tests the MethodOverloading2 class.
*/
class MethodOverloadingTest1 {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   MethodOverloading2 obj = new MethodOverloading2();
   int result = obj.sum(10, 20);
   System.out.println("Result: " + result);
   String result2 = obj.sum("Hello ", "World!");
   System.out.println("Result: " + result2);
 }
}
