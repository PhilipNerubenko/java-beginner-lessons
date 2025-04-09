package lesson22;

public class DynamicBindingDemo {
    public static void main(String[] args) {
      Employee e1 = new Teacher(); // Run time binding (dynamic binding)
      e1.eat();
    }
}

class Food{}
class Fruit extends Food{}

class Employee{
    double salary = 100;
    String name;
    int age;
    int experience;
    Food eat(){
        System.out.println("eating employee");
        return new Food();
    }
    void sleep(){
        System.out.println("sleeping");
    }
}

class Teacher extends Employee{
    int countStudent;

    @Override
    protected Food eat(){
    // Food eat(){
    // public Food eat(){
        System.out.println("eating teacher");
        return new Fruit();
    }

    void teach(){
        System.out.println("teaching");
    }
}