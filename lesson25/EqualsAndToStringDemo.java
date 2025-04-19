package lesson25;

import java.util.ArrayList;

/**
 * A class that demonstrates the equals and toString methods in Java.
 */
public class EqualsAndToStringDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    CarMethodsEqualAndToString car1 = new CarMethodsEqualAndToString("red", "v4");
    CarMethodsEqualAndToString car2 = new CarMethodsEqualAndToString("red", "v4");
    CarMethodsEqualAndToString car3 = new CarMethodsEqualAndToString("black", "v8");
    ArrayList<CarMethodsEqualAndToString> cars = new ArrayList<>();
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    CarMethodsEqualAndToString car4 = new CarMethodsEqualAndToString("black", "v8");
    CarMethodsEqualAndToString car5 = null;
    System.out.println(cars.contains(car4));
    System.out.println(car1.equals(null));
    // System.out.println(car5.equals(null)); // NullPointerException
    System.out.println(car1 == car2);
    System.out.println(car1.equals(car2));
    System.out.println(car3); // default calling toString() from class Object, full name of object
                              // class + "@" + hashcode in hex
                              // System.out.println(cars);
  }
}

/**
 * A class that represents a car.
 */
class CarMethodsEqualAndToString {
  /**
   * The color of the car.
   */
  String color;

  /**
   * The engine of the car.
   */
  String engine;

  /**
   * A constructor for the CarMethodsEqualAndToString class that takes in the color and engine.
   *
   * @param color The color of the car.
   * @param engine The engine of the car.
   */
  CarMethodsEqualAndToString(String color, String engine) {
    this.color = color;
    this.engine = engine;
  }

  /**
   * A method that checks if two cars are equal.
   *
   * @param obj The object to compare.
   * @return True if the cars are equal, false otherwise.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof CarMethodsEqualAndToString) {
      CarMethodsEqualAndToString c2 = (CarMethodsEqualAndToString) obj;
      return (color.equals(c2.color) && engine.equals(c2.engine));
    } else {
      return false;
    }
  }

  // overloaded method not recommended
  // public boolean equals(CarMethodsEqualAndToString c){
  //         return (color.equals(c.color) && engine.equals(c.engine));
  // }

  /**
   * A method that returns a string representation of the car.
   *
   * @return A string representation of the car.
   */
  @Override
  public String toString() {
    return "Color is " + color + ", engine is " + engine;
  }
}

// This is how the equals method looks in the Object class
// public boolean equals(Object obj) {
//     return (this == obj);
// }
