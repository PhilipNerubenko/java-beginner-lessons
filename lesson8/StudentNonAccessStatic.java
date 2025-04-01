package lesson8;

public class StudentNonAccessStatic {
  String name;
  int course;

  // belongs to an object
  // int count;

  // belongs to the class
  static int count;

  // constant belongs to the class
  static final int constant = 10;

  int a;

  public StudentNonAccessStatic(String name, int course) {
    count++;
    this.name = name;
    this.course = course;
    System.out.println("Student № " + count + " created");
  }

  public static void showCount() {
    System.out.println("All created students " + count);
  }

  public void showInfo() {
    System.out.println("Welcome to the Student class!");
  }

  void abc() {
    a++;
    count++;
  }

  static void abcd() {
    // variable belongs to an object, not to the class
    // a++;
    count++;
  }

  public static void main(String[] args) {
    abcd();
    // call without creating an object
    // abc();
  }
}

class StudentTest {
  public static void main(String[] args) {
    StudentNonAccessStatic st1 = new StudentNonAccessStatic("Mike", 1);
    StudentNonAccessStatic st2 = new StudentNonAccessStatic("Anna", 3);
    StudentNonAccessStatic st3 = new StudentNonAccessStatic("Kate", 2);
    StudentNonAccessStatic st4 = new StudentNonAccessStatic("Alex", 1);

    System.out.println(StudentNonAccessStatic.count);
    StudentNonAccessStatic.showCount();

    // Is bad practice
    System.out.println(st1.count);
    System.out.println(st2.count);
    System.out.println(st3.count);
    System.out.println(st4.count);
    st1.showCount();
  }
}