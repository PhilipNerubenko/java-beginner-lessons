package lesson14;

/**
* A class that demonstrates the classical cycle for with unreachable statements in Java.
*/
public class ClassicalCycleForUnreachableStatement {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   // Unreachable statement, complier time error
   // for (int i = 0; false; i++) {
   //     System.out.println(i);
   // }
   // for (int i = 2; 3 < 2 ; i++) {
   //     System.out.println(i);
   // }
   for (int i = 2; i <= 30; i += 2) {
     System.out.println(i);
   }
   int j = 10;
   if (j < 3)
     System.out.println("Less than 3"); // Unreachable statement, exception from the rule
 }
}

