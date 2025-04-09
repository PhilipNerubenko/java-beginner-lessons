package lesson22;

public class InheritanceOverridingDemo {
    Employee e = new Employee();
    Teacher t = new Teacher();
    Employee e2 = new Teacher();
    // e.sleep();
    // t.sleep();
    // e2.sleep();
}

class Employee{
    double salary = 100;
    String name;

    Food eat(){
        System.out.println("eating employee");
        return new Food();
    }

    // private void sleep(){
    //     System.out.println("sleeping employee");
    // }
    
    static void sleep(){
        System.out.println("sleeping employee");
    }
}

class Teacher extends Employee{
    // String double = "500"; // this will hide the parent's property
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

    // this new method will hide the parent's method
    // public void sleep(){
    //     System.out.println("sleeping teacher");
    // }

    // this method hiding the parent's method
    static void sleep(){
        System.out.println("sleeping teacher");
    }
}