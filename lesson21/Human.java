package lesson21;

public class Human {
  protected String name;
  protected static int salary = 150;

  public Human(String name) {
    super(); // default конструктор класса родителя, если не указан явно (все классы наследуются от
             // класса Object)
    this.name = name;
  }

  public void work() {
    System.out.println("I am working");
  }
  public static void rest() {
    System.out.println("relax");
  }
}

class Student extends Human {
  public Student(String string) {
    // super(); // default конструктор класса родителя, если не указан явно
    super(string);
  }

  public static void main(String[] args) {
    Student st = new Student("Ivan");
    System.out.println(st.name);
    System.out.println(Student.salary);
    st.work();
    Student.rest();
  }
}