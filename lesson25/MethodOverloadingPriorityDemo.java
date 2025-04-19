package lesson25;

/**
 * A class that demonstrates method overloading priority in Java.
 */
public class MethodOverloadingPriorityDemo {
  /**
   * A method that prints "int".
   *
   * @param i The integer.
   */
  void abc(int i) {
    System.out.println("int");
  }

  /**
   * A method that prints "byte".
   *
   * @param i The byte.
   */
  void abc(byte i) {
    System.out.println("byte");
  }

  /**
   * A method that prints "long".
   *
   * @param i The long.
   */
  void abc(long i) {
    System.out.println("long");
  }

  /**
   * A method that prints "Object".
   *
   * @param o The object.
   */
  void def(Object o) {
    System.out.println("Object");
  }

  /**
   * A method that prints "String".
   *
   * @param s The string.
   */
  void def(String s) {
    System.out.println("String");
  }

  /**
   * A method that prints "int, int".
   *
   * @param a The first integer.
   * @param b The second integer.
   */
  void ghi(int a, int b) {
    System.out.println("int, int");
  }

  /**
   * A method that prints "long, long".
   *
   * @param a The first long.
   * @param b The second long.
   */
  void ghi(long a, long b) {
    System.out.println("long, long");
  }

  /**
   * A method that prints "Integer, Integer".
   *
   * @param a The first Integer.
   * @param b The second Integer.
   */
  void ghi(Integer a, Integer b) {
    System.out.println("Integer, Integer");
  }

  /**
   * A method that prints "int ...".
   *
   * @param a The integers.
   */
  void ghi(int... a) {
    System.out.println("int ...");
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    MethodOverloadingPriorityDemo t = new MethodOverloadingPriorityDemo();
    t.abc(5); // default int, long

    t.def("hello"); // String
    t.def(new StringBuilder("hello")); // Object

    // priority of methods: int, long, auto-boxing, varargs
    t.ghi(5, 6); // int, int
    t.ghi(5l, 6l); // long, long
    t.ghi(new Integer(5), new Integer(6)); // Integer, Integer
    t.ghi(45, 65, 75, 85, 95); // int ...
  }
}
