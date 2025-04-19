package lesson22;

/**
 * A class that demonstrates inheritance and overriding in Java.
 */
public class InheritanceOverridingDemo {
  Employee e = new Employee();
  Teacher t = new Teacher();
  Employee e2 = new Teacher();
  // e.sleep();
  // t.sleep();
  // e2.sleep();
}

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
   * A method that prints "eating employee" and returns a new Food object.
   *
   * @return A new Food object.
   */
  Food eat() {
    System.out.println("eating employee");
    return new Food();
  }

  // private void sleep(){
  //     System.out.println("sleeping employee");
  // }

  /**
   * A static method that prints "sleeping employee".
   */
  static void sleep() {
    System.out.println("sleeping employee");
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

  // this new method will hide the parent's method
  // public void sleep(){
  //     System.out.println("sleeping teacher");
  // }

  /**
   * A static method that prints "sleeping teacher".
   */
  static void sleep() {
    System.out.println("sleeping teacher");
  }
}
