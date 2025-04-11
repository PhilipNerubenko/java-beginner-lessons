package lesson27;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Car car1 = Car.createCar();
    }
}

class Car {
    private Car() {}
    public static Car createCar() {
        return new Car();
    }
}