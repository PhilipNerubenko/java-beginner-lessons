package lesson22;

public class StaticMethodHiding {}

class Animal {
  static String showName() {
    return "some animal";
  }
  void showInfoAboutAnimal() {
    System.out.println("Name of animal: " + showName());
  }
}

class Mouse extends Animal {
  static String showName() {
    return "Jerry";
  }
  void showInfoAboutMouse() {
    System.out.println("Name of mouse: " + showName());
  }
  public static void main(String[] args) {
    Mouse a = new Mouse();
    // compile time building
    a.showInfoAboutAnimal();
    a.showInfoAboutMouse();
  }
}