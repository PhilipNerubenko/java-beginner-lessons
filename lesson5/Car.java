package lesson5;

public class Car {
  String color;
  String engine;

  Car() {
    System.out.println("Car is created!");
  }

  Car(String color, String engine) {
    this.color = color;
    this.engine = engine;
  }
}

class CarTest {
  public static void main(String[] args) {
    Car car1 = new Car("Blue", "V6");
    @SuppressWarnings("unused") Car car2 = new Car();

    System.out.println("Color: " + car1.color);
    System.out.println("Engine: " + car1.engine);
  }
}