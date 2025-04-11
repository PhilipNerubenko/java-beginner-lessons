package lesson25;

import java.util.ArrayList;

public class EqualsAndToStringDemo {
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
    System.out.println(cars);
  }
}

class CarMethodsEqualAndToString {
  String color;
  String engine;

  CarMethodsEqualAndToString(String color, String engine) {
    this.color = color;
    this.engine = engine;
  }

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

  @Override
  public String toString() {
    return "Color is " + color + ", engine is " + engine;
  }
}

// equals так он выглядит в классе Object
// public boolean equals(Object obj) {
//     return (this == obg);
// }