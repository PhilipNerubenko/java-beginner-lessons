package lesson6;

public class MethodOverloading2 {
  public int sum(int a, int b) {
    return a + b;
  }

  protected String sum(String a, String b) {
    return a + b;
  }
}

class MethodOverloadingTest1 {
  public static void main(String[] args) {
    MethodOverloading2 obj = new MethodOverloading2();
    int result = obj.sum(10, 20);
    System.out.println("Result: " + result);
    String result2 = obj.sum("Hello ", "World!");
    System.out.println("Result: " + result2);
  }
}