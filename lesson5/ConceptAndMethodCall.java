package lesson5;

public class ConceptAndMethodCall {
  int sum(int a, int b, int c) {
    return a + b + c;
  }

  int average(int a, int b, int c) {
    return sum(a, b, c) / 3;
  }
}

class Test {
  public static void main(String[] args) {
    ConceptAndMethodCall obj = new ConceptAndMethodCall();
    System.out.println("Sum: " + obj.sum(10, 20, 30));
    System.out.println("Average: " + obj.average(20, 40, 60));
  }
}