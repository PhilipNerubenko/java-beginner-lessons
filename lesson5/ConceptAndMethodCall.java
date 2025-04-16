package lesson5;

/**
* A class that demonstrates the concept of method calls in Java.
*/
public class ConceptAndMethodCall {
 /**
  * A method that calculates the sum of three integers.
  *
  * @param a The first integer.
  * @param b The second integer.
  * @param c The third integer.
  * @return The sum of the three integers.
  */
 int sum(int a, int b, int c) {
   return a + b + c;
 }

 /**
  * A method that calculates the average of three integers.
  *
  * @param a The first integer.
  * @param b The second integer.
  * @param c The third integer.
  * @return The average of the three integers.
  */
 int average(int a, int b, int c) {
   return sum(a, b, c) / 3;
 }
}


/**
* A class that tests the ConceptAndMethodCall class.
*/
class Test {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   ConceptAndMethodCall obj = new ConceptAndMethodCall();
   System.out.println("Sum: " + obj.sum(10, 20, 30));
   System.out.println("Average: " + obj.average(20, 40, 60));
 }
}
