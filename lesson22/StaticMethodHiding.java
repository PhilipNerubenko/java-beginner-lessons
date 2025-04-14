package lesson22;

/**
* A class that demonstrates static method hiding in Java.
*/
public class StaticMethodHiding {}

/**
* A class that represents an animal.
*/
class Animal {
 /**
  * A static method that returns "some animal".
  *
  * @return "some animal"
  */
 static String showName() {
   return "some animal";
 }

 /**
  * A method that prints the name of the animal.
  */
 void showInfoAboutAnimal() {
   System.out.println("Name of animal: " + showName());
 }
}

/**
* A class that represents a mouse.
*/
class Mouse extends Animal {
 /**
  * A static method that returns "Jerry".
  *
  * @return "Jerry"
  */
 static String showName() {
   return "Jerry";
 }

 /**
  * A method that prints the name of the mouse.
  */
 void showInfoAboutMouse() {
   System.out.println("Name of mouse: " + showName());
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   Mouse a = new Mouse();
   // compile time building
   a.showInfoAboutAnimal();
   a.showInfoAboutMouse();
 }
}
