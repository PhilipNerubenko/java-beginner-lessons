package lesson5;

public class Car2 {
  String color;
  String engine;
  int speed;

  int accelerate(int acceleration) {
    speed += acceleration;
    return speed;
  }

  int brake(int deceleration) {
    speed -= deceleration;
    return speed;
  }

  void showInfo() {
    System.out.println("Color: " + color + " Engine: " + engine + " Speed: " + speed);
  }
}

class Car2Test {
  public static void main(String[] args) {
    Car2 car1 = new Car2();
    car1.color = "white";
    car1.engine = "V6";
    car1.speed = 60;

    car1.showInfo();
    car1.accelerate(20);
    car1.showInfo();
    car1.brake(80);
    car1.showInfo();
  }
}