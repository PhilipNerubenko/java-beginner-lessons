package lesson5;

public class Human {
  String name;
  Car3 car;
  BankAccount bankAccount;

  void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("Car color: " + car.color + " Engine: " + car.engine);
    System.out.println("Bank Account: " + bankAccount.id + " Balance:" + bankAccount.balance);
  }
}

class HumanTest {
  public static void main(String[] args) {
    Human human = new Human();
    human.name = "John";

    Car3 car = new Car3("Red", "V8");
    human.car = car;

    BankAccount bankAccount = new BankAccount(12345, 1000);
    human.bankAccount = bankAccount;
    human.printInfo();
  }
}

class Car3 {
  String color;
  String engine;

  Car3(String color, String engine) {
    this.color = color;
    this.engine = engine;
  }
}

class BankAccount {
  int id;
  double balance;

  BankAccount(int id, double balance) {
    this.id = id;
    this.balance = balance;
  }
}