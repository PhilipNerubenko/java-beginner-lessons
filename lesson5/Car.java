package lesson5;

/**
* A class that represents a car.
*/
public class Car {
 /**
  * The color of the car.
  */
 String color;

 /**
  * The type of engine in the car.
  */
 String engine;

 /**
  * The default constructor for the Car class.
  */
 Car() {
   System.out.println("Car is created!");
 }

 /**
  * A constructor for the Car class that takes in the color and engine type.
  *
  * @param color The color of the car.
  * @param engine The type of engine in the car.
  */
 Car(String color, String engine) {
   this.color = color;
   this.engine = engine;
 }
}


/**
* A class that tests the Car class.
*/
class CarTest {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   Car car1 = new Car("Blue", "V6");
   @SuppressWarnings("unused") Car car2 = new Car();

   System.out.println("Color: " + car1.color);
   System.out.println("Engine: " + car1.engine);
 }
}
