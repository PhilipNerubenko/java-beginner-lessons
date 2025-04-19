package lesson22;

/**
 * A class that demonstrates the difference between compile time and run time binding in Java.
 */
public class BindingDifferenceDemo {
  /**
   * A method that prints "a".
   *
   * @param a The animal.
   */
  void abc(Animal a) {
    System.out.println("a");
  } // overloading

  /**
   * A method that prints "m".
   *
   * @param m The mouse.
   */
  void abc(Mouse m) {
    System.out.println("m");
  } // overloading

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    BindingDifferenceDemo t = new BindingDifferenceDemo();
    Animal a = new Mouse();
    // compile time binding
    t.abc(a); // animal not mouse, so it calls abc(Animal a)
    // run time binding
    a.getName(); // mouse, so it calls mouse.getName()
  }
}

/**
 * A class that represents an animal.
 */
class Animal {
  /**
   * A method that prints "Animal".
   */
  void getName() {
    System.out.println("Animal");
  }
}

/**
 * A class that represents a mouse.
 */
class Mouse extends Animal {
  /**
   * A method that prints "Mouse".
   */
  @Override
  void getName() {
    System.out.println("Mouse");
  }
}
