package lesson23;

public class InterfaceDefaultMethodDemo {}

interface I1 {
  // public abstract by default
  void abc();
  // java 8 added new features to interfaces
  default void def() {
    System.out.println("This is method def in interface I1");
  }
  static void xyz() {
    System.out.println("This is static method xyz in interface I1");
  }
}

class Z2 implements I1 {
  public void abc() {
    System.out.println("This is method abc");
  }
  public static void main(String[] args) {
    Z2 z = new Z2();
    z.abc();
    z.def();
    I1.xyz(); // implementation not required
  }

  @Override
  public void def() {
    System.out.println("This is method def in class Z2");
    I1.super.def();
  }
}