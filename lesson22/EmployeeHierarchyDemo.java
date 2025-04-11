package lesson22;

public class EmployeeHierarchyDemo {
  // public Doctor abc(){return new Speciality();}
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

class Employee {
  double salary = 100;
  String name;
  int age;
  int experience;
  void eat() {
    System.out.println("eating");
  }
  void sleep() {
    System.out.println("sleeping");
  }
}

class Doctor extends Employee {
  String speciality;

  void treat() {
    System.out.println("treating");
  }
}

class Speciality extends Doctor {
  String scalper;
  void operate() {
    System.out.println("operating");
  }
}

class Teacher extends Employee {
  int countStudent;

  void teach() {
    System.out.println("teaching");
  }
}

class Driver extends Employee {
  String nameCar;

  void drive() {
    System.out.println("driving");
  }
}