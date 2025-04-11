package lesson23;

public class JumpableInterfaceDemo {
  Jumpable j1 = new Human();
  Jumpable j2 = new Animal();
}

class Human implements Jumpable {
  @Override
  public void jump() {
    System.out.println("Human jumping");
  }
}

class Animal implements Jumpable {
  @Override
  public void jump() {
    System.out.println("Animal jumping");
  }
}

interface Jumpable {
  void jump();
}

interface A2 {
  void abc();
}

interface B2 extends A2, Jumpable {
  void def();
}

abstract class D implements B2 {}