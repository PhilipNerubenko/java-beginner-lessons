package lesson26;

import java.io.*;

public class ExceptionInheritanceDemo {
  public static void main(String[] args) {
    // Animal12 a = new Mouse12();
    // try {
    // a.run();
    // } catch (IOException e) {
    //     System.out.println("IOException");
    // }
  }
}

class Animal12 {
  Animal12() throws FileNotFoundException {}
  // void run() throws IOException{
  //     System.out.println("Animal run");
  // }
  // void run(int a) throws Exception{
  //     System.out.println("Animal run " + a);
  // }
}

class Mouse12 extends Animal12 {
  Mouse12() throws Exception, IOException {
    super();
  }
  // @Override
  // void run() throws Exception{ // This is not possible - Exception must either be equal to or
  // inherit from IOException for checked exceptions
  //     System.out.println("Mouse run");
  // }
}

class Human12 {
  String name;
  int age;

  public Human12(String name, int age) throws Exception {
    if (age < 0) {
      throw new Exception("Wrong age!");
    }
    this.name = name;
    this.age = age;
  }
}