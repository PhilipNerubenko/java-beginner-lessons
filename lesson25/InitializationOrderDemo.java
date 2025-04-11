package lesson25;

public class InitializationOrderDemo {
  // constructor
  public InitializationOrderDemo() {
    System.out.println("Hello from constructor");
    System.out.println(s);
  }
  String s = "another string";
  // initialization block
  {
    int i = 1;
    System.out.println("Hello calls created Object InitializationOrderDemo ");
    System.out.println("Value of i = " + i);
    System.out.println(s);
  }
  // static initialization block
  static {
    System.out.println("Hello from static block");
  }

  public static void main(String[] args) {
    InitializationOrderDemo t5 = new InitializationOrderDemo();
    InitializationOrderDemo t51 = new InitializationOrderDemo();
    System.out.println("Hello from main");
  }
}
