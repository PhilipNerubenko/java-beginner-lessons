package lesson5;

public class Car2 {
  String color;
  String engine;
  int speed;

  int go(int a) {
    speed += a;
    return speed;
  }

  int stop(int a) {
    speed -= a;
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
    car1.go(20);
    car1.showInfo();
    car1.stop(80);
    car1.showInfo();
  }
}