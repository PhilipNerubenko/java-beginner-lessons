package lesson14;

public class StatementBreakAndContinue {
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
