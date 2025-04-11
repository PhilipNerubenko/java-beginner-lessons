package lesson21;

public class Inheritance {
  // extansability
  void increaseInEmployeeSalary(Employee employee) {
    employee.salary += 100;
  }
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

class Employee extends java.lang.Object { // родительский класс
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

class Doctor extends Employee { // наследование класса Employee
  // String name;
  // int age;
  // int experience;
  String speciality;

  // void eat(){
  //     System.out.println("eating");
  // }
  // void sleep(){
  //     System.out.println("sleeping");
  // }
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

class Dantist extends Doctor {}

class Teacher extends Employee {
  // String name;
  // int age;
  // int experience;
  int countStudent;

  // void eat(){
  //     System.out.println("eating");
  // }
  // void sleep(){
  //     System.out.println("sleeping");
  // }
  void teach() {
    System.out.println("teaching");
  }
}

class Driver extends Employee {
  // String name;
  // int age;
  // int experience;
  String nameCar;

  // void eat(){
  //     System.out.println("eating");
  // }
  // void sleep(){
  //     System.out.println("sleeping");
  // }
  void drive() {
    System.out.println("driving");
  }
}