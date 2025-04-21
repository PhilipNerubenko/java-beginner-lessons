package lesson3;

/**
 * A class that demonstrates arithmetic, logical, assignment, and relational operations in Java.
 */
public class ArithmeticAndLogicalAndAssignmentAndRelationalOperations {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    int a = 5;
    int b = a * 2;
    double c = 5.5, d = 3.5;

    System.out.println("Integer value:"); // Integer variables
    System.out.println(a + b); // 5+10=15 plus the sum of variables
    System.out.println(a - b); // 5-10=-5 minus the difference of variables
    System.out.println(a * b); // 5*10=50 multiplication of variables
    System.out.println(a / b); // 5/10 = 0.5 -> 0 - integer division
    System.out.println(a % b); // 5%10 = 5 -> 5 - remainder of division
    System.out.println(b % a); // 10%5 = 0 -> 0 - remainder of division
    System.out.println(a++); // 5 - increases the value of the variable by 1 after output
    System.out.println(a--); // 6 - decreases the value of the variable by 1 after output
    System.out.println(++a); // 6 - increases the value of the variable by 1 before output
    System.out.println(--a); // 5 - decreases the value of the variable by 1 before output
    System.out.println(
        a += b); // 11 - increases the value of the variable by the value of variable b
    System.out.println();
    System.out.println("Double value:"); // Floating-point variables
    System.out.println(c + d); // 5.5+3.5=9.0 plus the sum of variables
    System.out.println(c - d); // 5.5-3.5=2.0 minus the difference of variables
    System.out.println(c * d); // 5.5*3.5=19.25 multiplication of variables
    System.out.println(
        c / d); // 5.5/3.5=1.5714285714285714 -> 1.5714285714285714 - integer division
    System.out.println(c % d); // 5.5%3.5=2.0 -> 2.0 - remainder of division
    System.out.println(d % c); // 3.5%5.5=3.5 -> 3.5 - remainder of division
    System.out.println(c++); // 5.5 - increases the value of the variable by 1 after output
    System.out.println(c--); // 6.5 - decreases the value of the variable by 1 after output
    System.out.println(++c); // 6.5 - increases the value of the variable by 1 before output
    System.out.println(--c); // 5.5 - decreases the value of the variable by 1 before output
    System.out.println(
        c += d); // 9.0 - increases the value of the variable by the value of variable b
    System.out.println();
    System.out.println("Logical operations:"); // Logical operations
    System.out.println(a > b); // false - greater than
    System.out.println(a < b); // true - less than
    System.out.println(a >= b); // false - greater than or equal to
    System.out.println(a <= b); // true - less than or equal to
    System.out.println(a == b); // false - equal to
    System.out.println(a != b); // true - not equal to
    System.out.println(a > b && a < b); // false - logical AND
    System.out.println(a > b || a < b); // true - logical OR
    System.out.println(!(a > b)); // true - logical NOT
    System.out.println(!(a < b)); // false - logical NOT
    System.out.println(a > b | ++b == 10); // true - logical OR
    System.out.println(b); // 10 - increases the value of the variable by 1 after output
    System.out.println(a > b & ++b == 10); // false - logical AND
    System.out.println(b); // 11 - increases the value of the variable by 1 after output
    System.out.println(true ^ true ^ true ^ true); // false - logical exclusive OR
    System.out.println(false ^ false ^ false ^ true); // true - logical exclusive OR
    System.out.println(true ^ true ^ true ^ false); // true - logical exclusive OR
    System.out.println();
  }
}