package lesson14;

/**
* A class that demonstrates the statement break and continue in Java.
*/
public class StatementBreakAndContinue {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   for (int i = 1; i <= 10; i++) {
     if (i == 5) {
       continue;
     }
     if (i == 7) {
       break;
     }
     System.out.println(i);
   }
 }
}

