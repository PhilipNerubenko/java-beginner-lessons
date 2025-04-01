package lesson6;

public class MethodOverloading {
  void show(int x) {
    System.out.println("x: " + x);
    System.out.println("Data Type is int");
  }

  void show(double x) {
    System.out.println("x: " + x);
    System.out.println("Data Type is double");
  }

  void show(boolean x) {
    System.out.println("x: " + x);
    System.out.println("Data Type is boolean");
  }

  void show(String x) {
    System.out.println("x: " + x);
    System.out.println("Data Type is String");
  }

  void show(String x, int y) {
    System.out.println("String is: " + x + " int is: " + y);
  }

  void show(int y, String x) {
    System.out.println("int is: " + y + " String is: " + x);
  }
}

class MethodOverloadingTest {
  public static void main(String[] args) {
    MethodOverloading obj = new MethodOverloading();
    obj.show(10);
    obj.show(10.0);
    obj.show(true);
    obj.show("Hello");
    obj.show("Hello", 10);
    obj.show(10, "Hello");
  }
}