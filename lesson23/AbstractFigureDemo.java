package lesson23;

public class AbstractFigureDemo {
    public static void main(String[] args) {
        Figure f1 = new Square();
        // compile time building so we can't access to countOfSides of Square class
        System.out.println(f1.countOfSides);
        
        // run time building so we can access to countOfSides of Square class
        f1.square();
    }
}

abstract class Figure {
    int countOfSides = 0;
    abstract void perimeter();
    abstract void square();
    void showInfo() {
        System.out.println("Figure");
    }
}

class Square extends Figure {
    int countOfSides = 4;
    int side = 10;

    @Override
    public void perimeter() {
        System.out.println("Perimeter square: " + side * 4);
    }
    // abstract public void perimeter(); // allowed to use only in abstract class

    @Override
    public void square() {
        System.out.println("Square: " + side * side);
    }
}

class Rectangle extends Figure {
    int countOfSides = 4;
    int side = 8;
    int side2 = 5;

    @Override
    public void perimeter() {
        System.out.println("Perimeter rectangle: " + 2 * (side + side2));
    }

    @Override
    public void square() {
        System.out.println("Square rectangle: " + side * side2);
    }
}

class Circle extends Figure {
    int countOfSides = 0;
    int radius = 3;

    @Override
    public void perimeter() {
        System.out.println("Perimeter circle: " + 2 * Math.PI * radius);
    }

    @Override
    public void square() {
        System.out.println("Square circle: " + Math.PI * radius * radius);
    }
}

abstract class Quadrilateral extends Figure {
    void def() {
        System.out.println("Quadrilateral");
    }
}