package lesson25;

public class MethodOverloadingResolutionDemo {
  static void abc(String s) {
    System.out.println("String");
  }
  static void abc(String... i) {
    System.out.println("String ...");
  }
  static void abc(Object i) {
    System.out.println("Object");
  }
  static void abc(String s, String s2) {
    System.out.println("String, String");
  }

  static void def(Long a) {
    System.out.println("Long");
  }
  static void def(Long... a) {
    System.out.println("Long ...");
  }
  static void def(long a) {
    System.out.println("long");
  }
  static void def(Object a) {
    System.out.println("Object");
  }
  static void def(Integer a, Integer b) {
    System.out.println("Integer, Integer");
  }

  public static void main(String[] args) {
    // exact match priority over varargs
    abc("hello");
    abc("hello", "world");
    abc(new String("hello"));
    abc("String", "Object", "Third");

    def(5L);
    def(5, 7);
    def(5L, 6L, 7L);
    def(5);
    def("Hello");
  }
}
