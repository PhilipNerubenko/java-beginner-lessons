package lesson21.p1;

import lesson21.IncapsulationHuman;

public class Test1 {
    public static void main(String[] args) {
        IncapsulationHuman ih = new IncapsulationHuman("Male");
        ih.setName("Jack");
        ih.setAge(10);
        ih.setWeight(50);
        System.out.println(ih.getName());
        System.out.println(ih.getAge());
        System.out.println(ih.getWeight());
    }

}
