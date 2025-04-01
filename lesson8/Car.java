package lesson8;

public class Car {
  String color = "blue";
  String engine = "v6";
}

class Human {
  String name = "Ivan";
  Car c = new Car();

  // modify not allowed
  // final Car c = new Car();
  public static void main(String[] args) {
    Human h1 = new Human();
    h1.c = new Car();
    h1.c = new Car();
    h1.c.engine = "v8";
  }
}
