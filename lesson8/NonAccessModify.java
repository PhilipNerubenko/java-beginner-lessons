package lesson8;

public class NonAccessModify {
  // default value 0
  // public int a;

  // final field can't be isn't initialized only in constructor
  public final int a;

  // final field can't be isn't initialized
  // public static final int c;

  // that's not allowed
  // a =  10;

  // read only variable
  // public final int a = 10;

  NonAccessModify() {
    a = 10;
    // not allowed
    // c = 20;
  }

  NonAccessModify(boolean b) {
    a = 10;
    // not allowed
    // c = 20;
  }

  public void abc(short s) {
    final byte b;
    b = 10;
    System.out.println(s + b);
  }

  public static void main(String[] args) {
    NonAccessModify nonAccessModify = new NonAccessModify();
    // nonAccessModify.a = nonAccessModify.a * 2;
    System.out.println(nonAccessModify.a);
  }
}
