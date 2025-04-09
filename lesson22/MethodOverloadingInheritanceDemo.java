package lesson22;

public class MethodOverloadingInheritanceDemo {
    public static void main(String[] args) {
        A c = new C();
        c.abc(new B()); // a, call only A's abc method 
    }
}

class A{
    void abc(A a){
        System.out.println("a");
    }
}

class B extends A{
    // @Override
    // void abc(A a){
    //     System.out.println("bbb");
    // }
    void abc(B b){
        System.out.println("b");
    }
}

class C extends B{
    void abc(B b2){
        System.out.println("c");
    }
}