package lesson23;

public class InterfaceImplementationDemo {
    public static void main(String[] args) {
        HelpAble h = new Driver();
        SwimAble s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.help();
        h.putOutTheFire();
        s.swim();
    }
}

class Employee{
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("eating");
    }
    void sleep(){
        System.out.println("sleeping");
    }
}

class Teacher extends Employee implements HelpAble{
    int countStudent;
    void teach(){
        System.out.println("teaching");
    }

    @Override
    public void help(){
        System.out.println("Teacher helping");
    }

    @Override
    public void putOutTheFire(){
        System.out.println("Teacher putting out the fire");
    }
}

class Driver extends Employee implements HelpAble, SwimAble{
    String nameCar;
    void drive(){
        System.out.println("driving");
    }

    @Override
    public void help(){
        System.out.println("Driver helping");
    }

    @Override
    public void putOutTheFire(){
        System.out.println("Driver putting out the fire");
    }

    @Override
    public void swim(){
        System.out.println("Driver is swimming");
    }
}

interface HelpAble{
    // public abstract may be not written because it's default
    public abstract void help();
    void putOutTheFire();
    // public static final int a = 10;
    // public static final is default may be not written
    int a = 10;
}

interface SwimAble{
    // public abstract may be not written because it's default
    void swim();
}

abstract class Y implements SwimAble{}
abstract class X extends Y{}
class Z extends X{
    @Override
    public void swim(){
        System.out.println("Z is swimming");
    }
}