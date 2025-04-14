package lesson25;

/**
* A class that demonstrates method overloading resolution in Java.
*/
public class MethodOverloadingResolutionDemo {
 /**
  * A method that prints "String".
  *
  * @param s The string.
  */
 static void abc(String s) {
   System.out.println("String");
 }

 /**
  * A method that prints "String ...".
  *
  * @param i The strings.
  */
 static void abc(String... i) {
   System.out.println("String ...");
 }

 /**
  * A method that prints "Object".
  *
  * @param i The object.
  */
 static void abc(Object i) {
   System.out.println("Object");
 }

 /**
  * A method that prints "String, String".
  *
  * @param s The first string.
  * @param s2 The second string.
  */
 static void abc(String s, String s2) {
   System.out.println("String, String");
 }

 /**
  * A method that prints "Long".
  *
  * @param a The long.
  */
 static void def(Long a) {
   System.out.println("Long");
 }

 /**
  * A method that prints "Long ...".
  *
  * @param a The longs.
  */
 static void def(Long... a) {
   System.out.println("Long ...");
 }

 /**
  * A method that prints "long".
  *
  * @param a The long.
  */
 static void def(long a) {
   System.out.println("long");
 }

 /**
  * A method that prints "Object".
  *
  * @param a The object.
  */
 static void def(Object a) {
   System.out.println("Object");
 }

 /**
  * A method that prints "Integer, Integer".
  *
  * @param a The first Integer.
  * @param b The second Integer.
  */
 static void def(Integer a, Integer b) {
   System.out.println("Integer, Integer");
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
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

