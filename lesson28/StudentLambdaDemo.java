package lesson28;

import java.util.ArrayList;

public class StudentLambdaDemo {
    
}

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

//     void checkStudent(ArrayList<Student> students, StudentsChecks sc) {
//         for (Student s : students) {
//             if (sc.check(s)) {
//                 printStudent(s);
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

//         // allowed only interface have one method, lambda expressions
//         info.checkStudent(students, (Student st) -> {return st.avgGrade > 8.5;});
//         System.out.println();
//         info.checkStudent(students, st -> st.avgGrade < 9);
//         System.out.println();
//         info.checkStudent(students, (Student st) -> st.age > 25);
//         System.out.println();
//         info.checkStudent(students, st -> { 
//             int z = 27; 
//             return st.age < z;
//         });
//         System.out.println();
//         info.checkStudent(students, (Student st) -> {return st.sex == 'm';});
//         System.out.println();
//         info.checkStudent(students, (Student st) -> {return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f';});
//     }
// }

// // this is functional interface
// interface StudentsChecks {
//     boolean check(Student st);
// }