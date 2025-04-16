package lesson26;

import java.io.*;

/**
* A class that demonstrates exception inheritance in Java.
*/
public class ExceptionInheritanceDemo {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   // Animal12 a = new Mouse12();
   // try {
   // a.run();
   // } catch (IOException e) {
   //     System.out.println("IOException");
   // }
 }
}

/**
* A class that represents an animal.
*/
class Animal12 {
 /**
  * A constructor for the Animal12 class that throws a FileNotFoundException.
  *
  * @throws FileNotFoundException If a file is not found.
  */
 Animal12() throws FileNotFoundException {}

 // void run() throws IOException{
 //     System.out.println("Animal run");
 // }
 // void run(int a) throws Exception{
 //     System.out.println("Animal run " + a);
 // }
}

/**
* A class that represents a mouse.
*/
class Mouse12 extends Animal12 {
 /**
  * A constructor for the Mouse12 class that throws an Exception and an IOException.
  *
  * @throws Exception If an exception occurs.
  * @throws IOException If an I/O error occurs.
  */
 Mouse12() throws Exception, IOException {
   super();
 }

 // @Override
 // void run() throws Exception{ // This is not possible - Exception must either be equal to or
 // inherit from IOException for checked exceptions
 //     System.out.println("Mouse run");
 // }
}

/**
* A class that represents a human.
*/
class Human12 {
 /**
  * The name of the human.
  */
 String name;

 /**
  * The age of the human.
  */
 int age;

 /**
  * A constructor for the Human12 class that throws an Exception.
  *
  * @param name The name of the human.
  * @param age The age of the human.
  * @throws Exception If the age is less than 0.
  */
 public Human12(String name, int age) throws Exception {
   if (age < 0) {
     throw new Exception("Wrong age!");
   }
   this.name = name;
   this.age = age;
 }
}
