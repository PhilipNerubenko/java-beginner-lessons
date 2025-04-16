package lesson8;

/**
* A class that demonstrates non-access modifiers in Java.
*/
public class NonAccessModify {
 // default value 0
 // public int a;

 /**
  * A final field that can't be initialized only in the constructor.
  */
 public final int a;

 // final field can't be initialized
 // public static final int c;

 // that's not allowed
 // a =  10;

 // read only variable
 // public final int a = 10;

 /**
  * A constructor for the NonAccessModify class.
  */
 NonAccessModify() {
   a = 10;
   // not allowed
   // c = 20;
 }

 /**
  * A constructor for the NonAccessModify class that takes in a boolean.
  *
  * @param b The boolean value.
  */
 NonAccessModify(boolean b) {
   a = 10;
   // not allowed
   // c = 20;
 }

 /**
  * A method that takes in a short and prints the sum of the short and a final byte.
  *
  * @param s The short value.
  */
 public void abc(short s) {
   final byte b;
   b = 10;
   System.out.println(s + b);
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   NonAccessModify nonAccessModify = new NonAccessModify();
   // nonAccessModify.a = nonAccessModify.a * 2;
   System.out.println(nonAccessModify.a);
 }
}

