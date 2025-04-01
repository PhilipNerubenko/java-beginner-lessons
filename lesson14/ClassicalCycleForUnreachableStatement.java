package lesson14;

public class ClassicalCycleForUnreachableStatement {
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
