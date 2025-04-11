package lesson26;

public class InitializerErrorDemo {
  // static {
  //     int a = Integer.parseInt("12t"); // java.lang.ExceptionInInitializerError
  // }
  // static String s = null;
  // static int a = s.length(); // java.lang.ExceptionInInitializerError
  static String s = abc();
  static String abc() {
    String[] array = {"1", "2"};
    return array[100]; // java.lang.ExceptionInInitializerError
  }
}
