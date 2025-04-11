package lesson26;

public class FinallyWithErrorDemo {
  void method1() {
    System.out.println("method1");
    throw new StackOverflowError();
  }
  void method2() {
    try {
      method1();
      return;
    } finally {
      System.out.println("finally");
    }
  }
  public static void main(String[] args) {
    FinallyWithErrorDemo test18 = new FinallyWithErrorDemo();
    test18.method2();
  }
}
