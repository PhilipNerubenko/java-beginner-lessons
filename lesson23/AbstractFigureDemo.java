package lesson23;

/**
* A class that demonstrates abstract classes and methods in Java.
*/
public class AbstractFigureDemo {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   Figure f1 = new Square();
   // compile time building so we can't access to countOfSides of Square class
   System.out.println(f1.countOfSides);

   // run time building so we can access to countOfSides of Square class
   f1.square();
 }
}

/**
* An abstract class that represents a figure.
*/
abstract class Figure {
 /**
  * The count of sides of the figure.
  */
 int countOfSides = 0;

 /**
  * An abstract method that calculates the perimeter of the figure.
  */
 abstract void perimeter();

 /**
  * An abstract method that calculates the square of the figure.
  */
 abstract void square();

 /**
  * A method that prints "Figure".
  */
 void showInfo() {
   System.out.println("Figure");
 }
}

/**
* A class that represents a square.
*/
class Square extends Figure {
 /**
  * The count of sides of the square.
  */
 int countOfSides = 4;

 /**
  * The side of the square.
  */
 int side = 10;

 /**
  * A method that calculates the perimeter of the square.
  */
 @Override
 public void perimeter() {
   System.out.println("Perimeter square: " + side * 4);
 }
 // abstract public void perimeter(); // allowed to use only in abstract class

 /**
  * A method that calculates the square of the square.
  */
 @Override
 public void square() {
   System.out.println("Square: " + side * side);
 }
}

/**
* A class that represents a rectangle.
*/
class Rectangle extends Figure {
 /**
  * The count of sides of the rectangle.
  */
 int countOfSides = 4;

 /**
  * The side of the rectangle.
  */
 int side = 8;

 /**
  * The second side of the rectangle.
  */
 int side2 = 5;

 /**
  * A method that calculates the perimeter of the rectangle.
  */
 @Override
 public void perimeter() {
   System.out.println("Perimeter rectangle: " + 2 * (side + side2));
 }

 /**
  * A method that calculates the square of the rectangle.
  */
 @Override
 public void square() {
   System.out.println("Square rectangle: " + side * side2);
 }
}

/**
* A class that represents a circle.
*/
class Circle extends Figure {
 /**
  * The count of sides of the circle.
  */
 int countOfSides = 0;

 /**
  * The radius of the circle.
  */
 int radius = 3;

 /**
  * A method that calculates the perimeter of the circle.
  */
 @Override
 public void perimeter() {
   System.out.println("Perimeter circle: " + 2 * Math.PI * radius);
 }

 /**
  * A method that calculates the square of the circle.
  */
 @Override
 public void square() {
   System.out.println("Square circle: " + Math.PI * radius * radius);
 }
}

/**
* An abstract class that represents a quadrilateral.
*/
abstract class Quadrilateral extends Figure {
 /**
  * A method that prints "Quadrilateral".
  */
 void def() {
   System.out.println("Quadrilateral");
 }
}
