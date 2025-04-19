package lesson22;

/**
 * A class that demonstrates dynamic binding in Java.
 */
public class DynamicBindingDemo {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Employee e1 = new Teacher(); // Run time binding (dynamic binding)
    e1.eat();
  }
}

/**
 * A class that represents food.
 */
class Food {}

/**
 * A class that represents a fruit.
 */
class Fruit extends Food {}

/**
 * A class that represents an employee.
 */
class Employee {
  /**
   * The salary of the employee.
   */
  double salary = 100;

  /**
   * The name of the employee.
   */
  String name;

  /**
   * The age of the employee.
   */
  int age;

  /**
   * The experience of the employee.
   */
  int experience;

  /**
   * A method that prints "eating employee" and returns a new Food object.
   *
   * @return A new Food object.
   */
  Food eat() {
    System.out.println("eating employee");
    return new Food();
  }

  /**
   * A method that prints "sleeping".
   */
  void sleep() {
    System.out.println("sleeping");
  }
}

/**
 * A class that represents a teacher.
 */
class Teacher extends Employee {
  /**
   * The count of students of the teacher.
   */
  int countStudent;

  /**
   * A method that prints "eating teacher" and returns a new Fruit object.
   *
   * @return A new Fruit object.
   */
  @Override
  protected Food eat() {
    // Food eat(){
    // public Food eat(){
    System.out.println("eating teacher");
    return new Fruit();
  }

  /**
   * A method that prints "teaching".
   */
  void teach() {
    System.out.println("teaching");
  }
}
