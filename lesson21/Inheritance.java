package lesson21;

/**
 * A class that demonstrates inheritance in Java.
 */
public class Inheritance {
  // extansability
  /**
   * A method that increases the salary of an employee.
   *
   * @param employee The employee whose salary is to be increased.
   */
  void increaseInEmployeeSalary(Employee employee) {
    employee.salary += 100;
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Doctor doctor = new Doctor(); // создание объекта класса Doctor
    doctor.name = "Ivan";
    doctor.age = 25;
    doctor.experience = 5;
    doctor.speciality = "surgeon";

    doctor.treat();
    doctor.sleep();
    doctor.eat();
  }
}

/**
 * A class that represents an employee.
 */
class Employee extends java.lang.Object { // родительский класс
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
   * A method that prints "eating".
   */
  void eat() {
    System.out.println("eating");
  }

  /**
   * A method that prints "sleeping".
   */
  void sleep() {
    System.out.println("sleeping");
  }
}

/**
 * A class that represents a doctor.
 */
class Doctor extends Employee { // наследование класса Employee
  /**
   * The speciality of the doctor.
   */
  String speciality;

  // void eat(){
  //     System.out.println("eating");
  // }
  // void sleep(){
  //     System.out.println("sleeping");
  // }
  /**
   * A method that prints "treating".
   */
  void treat() {
    System.out.println("treating");
  }
}

/**
 * A class that represents a speciality.
 */
class Speciality extends Doctor {
  /**
   * The scalper of the speciality.
   */
  String scalper;

  /**
   * A method that prints "operating".
   */
  void operate() {
    System.out.println("operating");
  }
}

/**
 * A class that represents a dantist.
 */
class Dantist extends Doctor {}

/**
 * A class that represents a teacher.
 */
class Teacher extends Employee {
  /**
   * The count of students of the teacher.
   */
  int countStudent;

  // void eat(){
  //     System.out.println("eating");
  // }
  // void sleep(){
  //     System.out.println("sleeping");
  // }
  /**
   * A method that prints "teaching".
   */
  void teach() {
    System.out.println("teaching");
  }
}

/**
 * A class that represents a driver.
 */
class Driver extends Employee {
  /**
   * The name of the car of the driver.
   */
  String nameCar;

  // void eat(){
  //     System.out.println("eating");
  // }
  // void sleep(){
  //     System.out.println("sleeping");
  // }
  /**
   * A method that prints "driving".
   */
  void drive() {
    System.out.println("driving");
  }
}
