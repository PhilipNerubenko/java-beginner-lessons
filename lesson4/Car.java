package lesson4;

/**
 * A class that represents a car.
 */
public class Car {
  /**
   * The color of the car.
   */
  String color = "red";

  /**
   * The type of engine in the car.
   */
  String engine = "v6";
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
    Car car1 = new Car();
    car1.color = "green";
    car1.engine = "v8";

    System.out.println("Color: " + car1.color);
    System.out.println("Engine: " + car1.engine);
  }
}
