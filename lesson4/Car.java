package lesson4;

public class Car {
  String color = "red";
  String engine = "v6";
}

class CarTest {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.color = "green";
    car1.engine = "v8";

    System.out.println("Color: " + car1.color);
    System.out.println("Engine: " + car1.engine);
  }
}