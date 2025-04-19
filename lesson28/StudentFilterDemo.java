package lesson28;

import java.util.ArrayList;

/**
 * A class that demonstrates the student filter in Java.
 */
public class StudentFilterDemo {}

// class Student {
//     String name;
//     char sex;
//     int age;
//     int course;
//     double avgGrade;

//     Student(String name, char sex, int age, int course, double avgGrade) {
//         this.name = name;
//         this.sex = sex;
//         this.age = age;
//         this.course = course;
//         this.avgGrade = avgGrade;
//     }

// }

// class StudentInfo {
//     void printStudent(Student st) {
//         System.out.println("Name: " + st.name);
//         System.out.println("Sex: " + st.sex);
//         System.out.println("Age: " + st.age);
//         System.out.println("Course: " + st.course);
//         System.out.println("Avg Grade: " + st.avgGrade);
//     }

//     void printStudentsOverGrade(ArrayList<Student> al, double avg) {
//         for (Student st : al) {
//             if (st.avgGrade > avg) {
//                 printStudent(st);
//             }
//         }
//     }

//     void printStudentsUnderGrade(ArrayList<Student> al, double avg) {
//         for (Student st : al) {
//             if (st.avgGrade < avg) {
//                 printStudent(st);
//             }
//         }
//     }

//     void printStudentsOverAge(ArrayList<Student> al, int age) {
//         for (Student st : al) {
//             if (st.age > age) {
//                 printStudent(st);
//             }
//         }
//     }

//     void printStudentsUnderAge(ArrayList<Student> al, int age) {
//         for (Student st : al) {
//             if (st.age < age) {
//                 printStudent(st);
//             }
//         }
//     }

//     void printStudentsBySex(ArrayList<Student> al, char sex) {
//         for (Student st : al) {
//             if (st.sex == sex) {
//                 printStudent(st);
//             }
//         }
//     }

//     void printStudentsMixCondition(ArrayList<Student> al, char sex, int age, double avgGrade) {
//         for (Student st : al) {
//             if (st.sex == sex && st.age < age && st.avgGrade > avgGrade) {
//                 printStudent(st);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         ArrayList<Student> students = new ArrayList<>();
//         Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
//         Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
//         Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
//         Student st4 = new Student("Petr", 'm', 35, 4, 7);
//         Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
//         students.add(st1);
//         students.add(st2);
//         students.add(st3);
//         students.add(st4);
//         students.add(st5);
//         StudentInfo info = new StudentInfo();
//         info.printStudentsOverGrade(students, 8.5);
//         System.out.println();
//         info.printStudentsUnderGrade(students, 9.0);
//         System.out.println();
//         info.printStudentsOverAge(students, 25);
//         System.out.println();
//         info.printStudentsUnderAge(students, 27);
//         System.out.println();
//         info.printStudentsBySex(students, 'm');
//         System.out.println();
//         info.printStudentsMixCondition(students, 'f', 23, 7.2);
//     }
// }
