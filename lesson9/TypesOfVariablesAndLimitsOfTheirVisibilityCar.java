package lesson9;

/**
 * A class that represents a car.
 */
public class TypesOfVariablesAndLimitsOfTheirVisibilityCar {
  // any size of a variable name
  int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 5;

  // Type of writing a variable
  int aTypeOfWritingAvariable = 10;
  int ATypeOfWritingAvariable = 10;
  int _TypeOfWritingAvariable = 10;
  int $TypeOfWritingAvariable = 10;
  int atypeOfWritingAvariable56 = 10;
  // illegal writing of a variable
  // int 56atype0fWritingAvariable = 10;
  // int static = 10;
  // int int = 10;
  // int boolean = 10;
  // int class = 10;

  // allowed but not recommended
  int String = 10;
  int Class = 10;

  // recommended way
  final int NOT_ALLOWED_TO_CHANGE_THIS_VALUE = 10;

  /*  instance variables = object variables
   * instance variables are created within a class but outside of any method
   */
  String color;
  int a = 10;
  String engine;
  // this.a - not allowed because it is instance variable
  // static int count1 = this.a;

  // static variables are created outside of any method, but inside of a class
  public static int count;

  /**
   * A constructor for the TypesOfVariablesAndLimitsOfTheirVisibilityCar class that takes in the
   * color and engine.
   *
   * @param color The color of the car.
   * @param engine The engine of the car.
   */
  public TypesOfVariablesAndLimitsOfTheirVisibilityCar(String color, String engine) {
    // local variables are allowed in the constructor, but a local variable does not have a default
    // value int x = 5; int y = x + 10;

    // instance variables are initialized with constructor
    this.color = color;
    this.engine = engine;

    // priority for instance variable is lower than for parameters
    // color = color;
    // engine = engine;

    count++;
    // not recommended to use for static variables
    // this.count++;
  }

  /**
   * A static method that changes the value of a.
   *
   * @param b The new value of a.
   */
  public static void changeA(int b) {
    // this.a - not allowed, since calling without creating an object is impossible
    // this.a = b;
    // allowed calling from a object to a static variable
    TypesOfVariablesAndLimitsOfTheirVisibilityCar car =
        new TypesOfVariablesAndLimitsOfTheirVisibilityCar("red", "V8");
    car.a = b;
  }

  /**
   * A method that prints the color of the car.
   */
  public void showColor() {
    System.out.println("Цвет автомобиля: " + color);
    changeColor("red");

    // default this is not required, but it is possible to use it
    // this.changeColor("black");
  }

  /**
   * A method that prints the engine of the car.
   */
  public void showEngine() {
    System.out.println("Двигатель автомобиля: " + engine);
  }

  // parameter variable that is created in a method is available only within the method
  public void changeColor(String color) {
    System.out.println("Новый цвет автомобиля: " + color);
    // local variable available only within the method
    @SuppressWarnings("unused") int price = 5000;
    // access modifier is only for instance variables
    // public int notAllowed = 500;
    // private int notAllowed = 500;
    this.color = color;
    price += 5000;
  }

  void abc(int a, int b) {
    // not allowed to use a and b again
    // boolean a = true;
    // boolean b = true;
  }
}
