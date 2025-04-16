package lesson8;

/**
* A class that represents a car.
*/
public class Car {
 /**
  * The color of the car.
  */
 String color = "blue";

 /**
  * The type of engine in the car.
  */
 String engine = "v6";
}


/**
* A class that represents a human.
*/
class Human {
 /**
  * The name of the human.
  */
 String name = "Ivan";

 /**
  * The car owned by the human.
  */
 Car c = new Car();

 // modify not allowed
 // final Car c = new Car();
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   Human h1 = new Human();
   h1.c = new Car();
   h1.c = new Car();
   h1.c.engine = "v8";
 }
}

