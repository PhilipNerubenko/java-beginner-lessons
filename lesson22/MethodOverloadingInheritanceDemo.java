package lesson22;

/**
 * A class that demonstrates method overloading and inheritance in Java.
 */
public class MethodOverloadingInheritanceDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    A c = new C();
    c.abc(new B()); // a, call only A's abc method
  }
}

/**
 * A class that represents A.
 */
class A {
  /**
   * A method that prints "a".
   *
   * @param a The A object.
   */
  void abc(A a) {
    System.out.println("a");
  }
}

/**
 * A class that represents B.
 */
class B extends A {
  // @Override
  // void abc(A a){
  //     System.out.println("bbb");
  // }
  /**
   * A method that prints "b".
   *
   * @param b The B object.
   */
  void abc(B b) {
    System.out.println("b");
  }
}

/**
 * A class that represents C.
 */
class C extends B {
  /**
   * A method that prints "c".
   *
   * @param b2 The B object.
   */
  void abc(B b2) {
    System.out.println("c");
  }
}
