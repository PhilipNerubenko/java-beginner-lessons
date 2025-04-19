package lesson26;

import java.util.ArrayList;

/**
 * A class that demonstrates common exceptions in Java.
 */
public class CommonExceptionsDemo {
  static ArrayList<String> list2;

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // ArrayList<String> list1 = new ArrayList<>();
    // list1.add("1");
    // list1.add("2");
    // System.out.println(list1.get(3)); // IndexOutOfBoundsException

    // System.out.println(5 / 0); // ArithmeticException

    DoctorException d1 = new DoctorException();
    TeacherException t1 = new TeacherException();
    TeacherException t2 = new TeacherException();

    TeacherException[] array2 = {t1, t2};
    EmployeeException[] employees = {d1, t1};

    // TeacherException t3 = (TeacherException)employees[0]; // ClassCastException
    // DoctorException d2 = (DoctorException)array2[0]; // not allowed
    createPsd("qwerty123");

    // list2.add("null"); // NullPointerException
    // System.out.println(list2.get(0)); // NullPointerException
    Integer.parseInt("123qwerty"); // NumberFormatException
  }

  /**
   * A method that creates a password.
   *
   * @param pwd The password.
   */
  public static void createPsd(String pwd) {
    if (pwd.length() < 8) {
      throw new IllegalArgumentException("Password length is less than 8 characters");
    }
    if (pwd.length() > 16) {
      throw new IllegalArgumentException("Password length is greater than 16 characters");
    }
    System.out.println("Password set successfully");
  }
}

/**
 * A class that represents an employee.
 */
class EmployeeException {}

/**
 * A class that represents a doctor.
 */
class DoctorException extends EmployeeException {}

/**
 * A class that represents a teacher.
 */
class TeacherException extends EmployeeException {}

// class Airplane {
//     String[] state = {"waiting",  "in the air", "flight canceled"};

//     public void waiting() {
//         String state = this.state[1];
//         if (state.equals("in the air")) { throw new IllegalStateException("the plane is already
//         in the air");}

//         System.out.println(state);
//     }

//     public void flight() {
//         String state = this.state[1];
//         System.out.println(state);
//     }

//     public void cancelFlight() {
//         String state = this.state[1];
//         if (state.equals("in the air")) { throw new IllegalStateException("the plane is already
//         in the air");} System.out.println(state);
//     }

//     public static void main(String[] args) {
//         Airplane a = new Airplane();
//         a.flight();
//         a.cancelFlight();
//         a.waiting();
//     }
// }
