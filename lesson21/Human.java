package lesson21;

/**
 * A class that represents a human.
 */
public class Human {
  /**
   * The name of the human.
   */
  protected String name;

  /**
   * The salary of the human.
   */
  protected static int salary = 150;

  /**
   * A constructor for the Human class that takes in the name.
   *
   * @param name The name of the human.
   */
  public Human(String name) {
    super(); // default constructor класса родителя, если не указан явно (все классы наследуются от
             // класса Object)
    this.name = name;
  }

  /**
   * A method that prints "I am working".
   */
  public void work() {
    System.out.println("I am working");
  }

  /**
   * A static method that prints "relax".
   */
  public static void rest() {
    System.out.println("relax");
  }
}

/**
 * A class that represents a student.
 */
class Student extends Human {
  /**
   * A constructor for the Student class that takes in the name.
   *
   * @param string The name of the student.
   */
  public Student(String string) {
    // super(); // default constructor класса родителя, если не указан явно
    super(string);
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Student st = new Student("Ivan");
    System.out.println(st.name);
    System.out.println(Student.salary);
    st.work();
    Student.rest();
  }
}
