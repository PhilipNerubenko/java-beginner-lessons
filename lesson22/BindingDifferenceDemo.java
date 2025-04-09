package lesson22;

public class BindingDifferenceDemo {
    void abc(Animal a) {System.out.println("a");} // overloading
    void abc(Mouse m) {System.out.println("m");} // overloading
    public static void main(String[] args) {
        BindingDifferenceDemo t = new BindingDifferenceDemo();
        Animal a = new Mouse();
        // compile time binding
        t.abc(a); // animal not mouse, so it calls abc(Animal a)
        // run time binding
        a.getName(); // mouse, so it calls mouse.getName()
    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    @Override
    void getName() {
        System.out.println("Mouse");
    }
}
