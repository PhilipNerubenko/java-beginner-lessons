package lesson22;

/**
 * A class that demonstrates the employee hierarchy in Java.
 */
public class EmployeeHierarchyDemo {
  // public Doctor abc(){return new Speciality();}
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // Doctor d = new Doctor();
    // Teacher t = new Teacher();
    // Driver dr = new Driver();
    // Employee e = new Employee();
    // Speciality sp = new Speciality();

    Employee e1 = new Doctor();
    System.out.println(e1.salary);
    System.out.println(e1.name);
    System.out.println(e1.age);
    System.out.println(e1.experience);
    e1.eat();
    e1.sleep();
    // e1.treat(); // так нельзя, потому что метод не объявлен в классе Employee
    Employee e2 = new Teacher();
    Employee e3 = new Driver();

    // Driver dr2 = new Employee(); // нельзя так создать экземпляр, так как класс Employee не
    // является сабклассом Driver

    Doctor d1 = new Speciality();
    System.out.println(d1.age);
    System.out.println(d1.salary);
    System.out.println(d1.name);
    System.out.println(d1.speciality);
    System.out.println(d1.experience);
    d1.eat();
    d1.sleep();
    d1.treat();
    // System.out.println(d1.scalper); // так нельзя, потому что поле не объявлено в классе Doctor
    // d1.operate(); // так нельзя, потому что метод не объявлен в классе Doctor
    Employee e4 = new Speciality();
    System.out.println(e4.age);
    System.out.println(e4.salary);
    System.out.println(e4.name);
    System.out.println(e4.experience);
    e4.eat();
    e4.sleep();
    // e4.operate(); // так нельзя, потому что метод не объявлен в классе Employee
  }
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
class Doctor extends Employee {
  /**
   * The speciality of the doctor.
   */
  String speciality;

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
 * A class that represents a teacher.
 */
class Teacher extends Employee {
  /**
   * The count of students of the teacher.
   */
  int countStudent;

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

  /**
   * A method that prints "driving".
   */
  void drive() {
    System.out.println("driving");
  }
}
