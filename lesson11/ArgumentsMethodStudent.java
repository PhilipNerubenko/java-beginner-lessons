package lesson11;

public class ArgumentsMethodStudent {
  String name;
  int course;
  double grade;

  ArgumentsMethodStudent(String name, int course, double grade) {
    this.name = name;
    this.course = course;
    this.grade = grade;
  }

  public static void swap(ArgumentsMethodStudent student1, ArgumentsMethodStudent student2) {
    // temp reference on st1*
    ArgumentsMethodStudent temp = student1;
    // st1* -> st2*
    student1 = student2;
    // st2* -> temp*
    student2 = temp;
    // Everything is fine here
    System.out.println(student1.name);
  }

  public static void changeName(ArgumentsMethodStudent newName) {
    // no link changes so name change on Kolya
    newName.name = "Kolya";
  }

  public static void main(String[] args) {
    ArgumentsMethodStudent st1 = new ArgumentsMethodStudent("Ivan", 3, 9.5);
    ArgumentsMethodStudent st2 = new ArgumentsMethodStudent("Petr", 1, 5.3);
    // // st1*, st2* dublicate, not original
    // swap(st1, st2);
    // // the old st1 and st2 still remain
    // System.out.println(st1.name);
    // System.out.println(st2.name);
    // st2* dublicate, not original
    changeName(st2);
    System.out.println(st2.name);
  }
}
