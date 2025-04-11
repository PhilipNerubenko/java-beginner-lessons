package lesson7;

public class A {
  public static void main(String[] args) {
    @SuppressWarnings("unused") B object = new B();
    // package full name for call class
    @SuppressWarnings("unused")
    lesson6.EmployeeConstructorOverloading emp =
        new lesson6.EmployeeConstructorOverloading("Ivanov", 21);
  }
}
