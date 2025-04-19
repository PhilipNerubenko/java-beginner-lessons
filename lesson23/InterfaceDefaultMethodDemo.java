package lesson23;

/**
 * A class that demonstrates the default method in interfaces in Java.
 */
public class InterfaceDefaultMethodDemo {}

/**
 * An interface that represents I1.
 */
interface I1 {
  // public abstract by default
  void abc();
  // java 8 added new features to interfaces
  /**
   * A default method that prints "This is method def in interface I1".
   */
  default void def() {
    System.out.println("This is method def in interface I1");
  }

  /**
   * A static method that prints "This is static method xyz in interface I1".
   */
  static void xyz() {
    System.out.println("This is static method xyz in interface I1");
  }
}

/**
 * A class that implements I1.
 */
class Z2 implements I1 {
  /**
   * A method that prints "This is method abc".
   */
  public void abc() {
    System.out.println("This is method abc");
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
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
