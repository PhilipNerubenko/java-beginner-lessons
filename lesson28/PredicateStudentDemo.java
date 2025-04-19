package lesson28;

import java.util.ArrayList;
import java.util.function.*;
/**
 * A class that demonstrates the predicate student in Java.
 */
public class PredicateStudentDemo {}

/**
 * A class that represents a student.
 */
class Student {
  /**
   * The name of the student.
   */
  String name;

  /**
   * The sex of the student.
   */
  char sex;

  /**
   * The age of the student.
   */
  int age;

  /**
   * The course of the student.
   */
  int course;

  /**
   * The average grade of the student.
   */
  double avgGrade;

  /**
   * A constructor for the Student class that takes in the name, sex, age, course, and average
   * grade.
   *
   * @param name The name of the student.
   * @param sex The sex of the student.
   * @param age The age of the student.
   * @param course The course of the student.
   * @param avgGrade The average grade of the student.
   */
  Student(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;
  }
}

/**
 * A class that represents student information.
 */
class StudentInfo {
  /**
   * A method that prints the student information.
   *
   * @param st The student.
   */
  void printStudent(Student st) {
    System.out.println("Name: " + st.name);
    System.out.println("Sex: " + st.sex);
    System.out.println("Age: " + st.age);
    System.out.println("Course: " + st.course);
    System.out.println("Avg Grade: " + st.avgGrade);
  }

  /**
   * A method that checks the student.
   *
   * @param students The list of students.
   * @param sc The predicate.
   */
  void checkStudent(ArrayList<Student> students, Predicate<Student> sc) {
    for (Student s : students) {
      if (sc.test(s)) {
        printStudent(s);
      }
    }
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
    Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
    Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
    Student st4 = new Student("Petr", 'm', 35, 4, 7);
    Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
    students.add(st1);
    students.add(st2);
    students.add(st3);
    students.add(st4);
    students.add(st5);
    StudentInfo info = new StudentInfo();

    for (Student s : students) {
      System.out.println(s.name);
    }
    System.out.println();
    students.removeIf(student -> student.name.endsWith("a"));
    for (Student s : students) {
      System.out.println(s.name);
    }

    // allowed only interface have one method, lambda expressions
    // info.checkStudent(students, (Student st) -> {return st.avgGrade > 8.5;});
    // System.out.println();
    // info.checkStudent(students, st -> st.avgGrade < 9);
    // System.out.println();
    // info.checkStudent(students, (Student st) -> st.age > 25);
    // System.out.println();
    // info.checkStudent(students, st -> {
    //     int z = 27;
    //     return st.age < z;
    // });
    // System.out.println();
    // info.checkStudent(students, (Student st) -> {return st.sex == 'm';});
    // System.out.println();
    // info.checkStudent(students, (Student st) -> {return st.avgGrade > 7.2 && st.age < 23 &&
    // st.sex == 'f';});
  }
}
