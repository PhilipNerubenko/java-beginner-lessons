package lesson26;

public class ExceptionInCatchDemo {
  void abc() {
    int[] array = {1, 2, 3};

    try {
      System.out.println(array[4]);
    } catch (ArrayIndexOutOfBoundsException e) {
      String s = null;
      System.out.println(s.length()); // not catch this exception
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    }
  }

  public static void main(String[] args) {
    ExceptionInCatchDemo t12 = new ExceptionInCatchDemo();
    t12.abc();
  }
}
