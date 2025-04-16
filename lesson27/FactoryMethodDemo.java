package lesson27;

/**
* A class that demonstrates the factory method in Java.
*/
public class FactoryMethodDemo {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   Car car1 = Car.createCar();
 }
}

/**
* A class that represents a car.
*/
class Car {
 /**
  * A private constructor for the Car class.
  */
 private Car() {}

 /**
  * A method that creates a new car.
  *
  * @return A new car.
  */
 public static Car createCar() {
   return new Car();
 }
}
