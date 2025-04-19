package lesson5;

/**
 * A class that represents a human.
 */
public class Human {
  /**
   * The name of the human.
   */
  String name;

  /**
   * The car owned by the human.
   */
  Car3 car;

  /**
   * The bank account owned by the human.
   */
  BankAccount bankAccount;

  /**
   * A method that prints the information of the human.
   */
  void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("Car color: " + car.color + " Engine: " + car.engine);
    System.out.println("Bank Account: " + bankAccount.id + " Balance:" + bankAccount.balance);
  }
}

/**
 * A class that tests the Human class.
 */
class HumanTest {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
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

/**
 * A class that represents a car.
 */
class Car3 {
  /**
   * The color of the car.
   */
  String color;

  /**
   * The type of engine in the car.
   */
  String engine;

  /**
   * A constructor for the Car3 class that takes in the color and engine type.
   *
   * @param color The color of the car.
   * @param engine The type of engine in the car.
   */
  Car3(String color, String engine) {
    this.color = color;
    this.engine = engine;
  }
}

/**
 * A class that represents a bank account.
 */
class BankAccount {
  /**
   * The unique identifier for the bank account.
   */
  int id;

  /**
   * The current balance of the bank account.
   */
  double balance;

  /**
   * A constructor for the BankAccount class that takes in the id and balance.
   *
   * @param id The unique identifier for the bank account.
   * @param balance The current balance of the bank account.
   */
  BankAccount(int id, double balance) {
    this.id = id;
    this.balance = balance;
  }
}
