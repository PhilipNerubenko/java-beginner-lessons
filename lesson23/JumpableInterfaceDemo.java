package lesson23;

/**
* A class that demonstrates the jumpable interface in Java.
*/
public class JumpableInterfaceDemo {
 /**
  * A Jumpable object.
  */
 Jumpable j1 = new Human();

 /**
  * A Jumpable object.
  */
 Jumpable j2 = new Animal();
}

/**
* A class that represents a human.
*/
class Human implements Jumpable {
 /**
  * A method that prints "Human jumping".
  */
 @Override
 public void jump() {
   System.out.println("Human jumping");
 }
}

/**
* A class that represents an animal.
*/
class Animal implements Jumpable {
 /**
  * A method that prints "Animal jumping".
  */
 @Override
 public void jump() {
   System.out.println("Animal jumping");
 }
}

/**
* An interface that represents Jumpable.
*/
interface Jumpable {
 /**
  * A method that jumps.
  */
 void jump();
}

/**
* An interface that represents A2.
*/
interface A2 {
 /**
  * A method that does something.
  */
 void abc();
}

/**
* An interface that represents B2.
*/
interface B2 extends A2, Jumpable {
 /**
  * A method that does something.
  */
 void def();
}

/**
* An abstract class that implements B2.
*/
abstract class D implements B2 {}
