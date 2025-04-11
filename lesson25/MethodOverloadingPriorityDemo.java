package lesson25;

public class MethodOverloadingPriorityDemo {
  void abc(int i) {
    System.out.println("int");
  }

  void abc(byte i) {
    System.out.println("byte");
  }

  void abc(long i) {
    System.out.println("long");
  }

  void def(Object o) {
    System.out.println("Object");
  }

  void def(String s) {
    System.out.println("String");
  }

  void ghi(int a, int b) {
    System.out.println("int, int");
  }

  void ghi(long a, long b) {
    System.out.println("long, long");
  }

  void ghi(Integer a, Integer b) {
    System.out.println("Integer, Integer");
  }

  void ghi(int... a) {
    System.out.println("int ...");
  }
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
