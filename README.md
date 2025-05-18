# Java Beginner Lessons

## Prerequisites

To successfully complete the course, you will need:

### Software Requirements

- Java Development Kit (JDK) 8 or higher
- Integrated Development Environment (IDE):
  - IntelliJ IDEA (recommended)
  - Eclipse
  - Visual Studio Code with Java extensions
- Git for repository management

### Basic Knowledge

- Familiarity with basic computer operations
- Understanding of fundamental programming concepts
- Basic English proficiency for reading technical documentation

### System Requirements

- Minimum 4 GB of RAM
- 2 GB of free disk space
- Operating System:
  - Windows 7/8/10
  - macOS 10.14 or higher
  - Linux (any modern distribution)

## Contents

1. [Lesson 1: Console Output](#lesson-1-console-output)  
2. [Lesson 2: Primitive Data Types and Literals](#lesson-2-primitive-data-types-and-literals)  
3. [Lesson 3: Arithmetic, Logical, Assignment, and Comparison Operations](#lesson-3-arithmetic-logical-assignment-and-comparison-operations)  
4. [Lesson 4: Basics of OOP — Classes, Objects, and Reference Types](#lesson-4-basics-of-oop--classes-objects-and-reference-types)  
5. [Lesson 5: Creating Objects, Constructors, and Method Calls](#lesson-5-creating-objects-constructors-and-method-calls)  
6. [Lesson 6: Method and Constructor Overloading (overloading). The `this` Keyword](#lesson-6-method-and-constructor-overloading-overloading-the-this-keyword)  
7. [Lesson 7: The Concept of `package`. Access Modifiers](#lesson-7-the-concept-of-package-access-modifiers)  
8. [Lesson 8: The Concept of `Constant`. Modifiers `final` and `static`](#lesson-8-the-concept-of-constant-modifiers-final-and-static)  
9. [Lesson 9: Types of Variables and Their Scope](#lesson-9-types-of-variables-and-their-scope)  
10. [Lesson 10: Concepts of `import` and `import static`. Using Comments](#lesson-10-concepts-of-import-and-import-static-using-comments)  
11. [Lesson 11: Using Primitive and Reference Data Types in Method Calls](#lesson-11-using-primitive-and-reference-data-types-in-method-calls)  
12. [Lesson 12: `if` and `if else` Constructs. Ternary Operator](#lesson-12-if-and-if-else-constructs-ternary-operator)  
13. [Lesson 13: The `switch` Statement](#lesson-13-the-switch-statement)  
14. [Lesson 14: The Classic `for` Loop. `break` and `continue` Statements](#lesson-14-the-classic-for-loop-break-and-continue-statements)  
15. [Lesson 15: `while` and `do while` Loops](#lesson-15-while-and-do-while-loops)  
16. [Lesson 16: All About the `String` Class](#lesson-16-all-about-the-string-class)  
17. [Lesson 17: All About the `StringBuilder` Class](#lesson-17-all-about-the-stringbuilder-class)  
18. [Lesson 18: Arrays and Working with Arrays](#lesson-18-arrays-and-working-with-arrays)  
19. [Lesson 19: Method Parameters of Type `varargs`, Command Line Arguments, and `foreach` Loop](#lesson-19-method-parameters-of-type-varargs-command-line-arguments-and-foreach-loop)  
20. [Lesson 20: All About the `ArrayList` Class](#lesson-20-all-about-the-arraylist-class)  
21. [Lesson 21: Encapsulation, Inheritance, and the `protected` Modifier](#lesson-21-encapsulation-inheritance-and-the-protected-modifier)  
22. [Lesson 22: Overridden and Hidden Methods. Runtime Binding and Compile Time Binding](#lesson-22-overridden-and-hidden-methods-runtime-binding-and-compile-time-binding)  
23. [Lesson 23: Abstract Classes, Abstract Methods, and Interfaces](#lesson-23-abstract-classes-abstract-methods-and-interfaces)  
24. [Lesson 24: The Concept of Polymorphism. `instanceof` Operator and Type Casting](#lesson-24-the-concept-of-polymorphism-instanceof-operator-and-type-casting)  
25. [Lesson 25: Methods `equals()` and `toString()`. Wrapper Classes. Method Overloading and Initialization Order](#lesson-25-methods-equals-and-tostring-wrapper-classes-method-overloading-and-initialization-order)  
26. [Lesson 26: Exceptions and Their Handling. Try-catch Blocks](#lesson-26-exceptions-and-their-handling-try-catch-blocks)  
27. [Lesson 27: Classes `LocalDate`, `LocalTime`, `LocalDateTime`. Date-Time API](#lesson-27-classes-localdate-localtime-localdatetime-date-time-api)  
28. [Lesson 28: Lambda Expressions and the Predicate Interface](#lesson-28-lambda-expressions-and-the-predicate-interface)  

## Lesson 1: Console Output

In this lesson, we study two main methods for console output:

- **`System.out.println()`** — outputs with a newline.  
- **`System.out.print()`** — outputs without a newline.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // With a newline
        System.out.print("Hello "); // Without a newline
        System.out.print("World!"); // Continues on the same line
    }
}
```

![Example of output methods](./images/exampleUsePrintlnAndPrintLesson1.png)  
*Fig. 1.1 – Example of output*

The lesson code is available in the file:

- [HelloWorld.java](./lesson1/HelloWorld.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 2: Primitive Data Types and Literals

This lesson covers:

- Primitive data types:
  - Integer types: `byte`, `short`, `int`, `long`
  - Floating-point types: `float`, `double`
  - Character type: `char`
  - Boolean type: `boolean`
- Representing numbers in binary, octal, and hexadecimal formats
- Using underscores in numeric literals (introduced in Java 7)

### Primitive Data Types

| Type    | Size    | Range                     | Example            |
|---------|---------|---------------------------|--------------------|
| byte    | 8 bits  | -128 to 127               | `byte b = 100;`    |
| short   | 16 bits | -32,768 to 32,767         | `short s = 1000;`  |
| int     | 32 bits | -2^31 to 2^31-1           | `int i = 10000;`   |
| long    | 64 bits | -2^63 to 2^63-1           | `long l = 100000L;`|
| float   | 32 bits | ~3.4e-038 to ~3.4e+038    | `float f = 123.45f;`|
| double  | 64 bits | ~1.7e-308 to ~1.7e+308    | `double d = 123.45;`|
| char    | 16 bits | 0 to 65,535               | `char c = 'A';`    |
| boolean | -       | true or false             | `boolean b = true;`|

### Number Formats

```java
// Decimal
int decimal = 123;

// Binary (0b prefix)
int binary = 0b1111011;

// Octal (0 prefix)
int octal = 0173;

// Hexadecimal (0x prefix)
int hex = 0x7B;

// Using underscores
int million = 1_000_000;
```

The lesson code is available in the file:

- [PrimitiveDataTypes.java](./lesson2/PrimitiveDataTypes.java)

<div align="right">
    <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 3: Arithmetic, Logical, Assignment, and Comparison Operations

This lesson covers the main types of operations in Java:

1. **Arithmetic Operations:** `+`, `-`, `*`, `/`, `%`
2. **Comparison Operations:** `==`, `!=`, `>`, `<`, `>=`, `<=`
3. **Logical Operations:** `&&`, `||`, `!`
4. **Assignment Operations:** `=`, `+=`, `-=`, `*=`, `/=`

### Examples

#### Arithmetic Operations

```java
int a = 10, b = 3;
System.out.println("Addition: " + (a + b)); // 13
System.out.println("Subtraction: " + (a - b)); // 7
System.out.println("Multiplication: " + (a * b)); // 30
System.out.println("Division: " + (a / b)); // 3
System.out.println("Modulus: " + (a % b)); // 1
```

#### Comparison Operations

```java
int x = 5, y = 10;
System.out.println("Equal: " + (x == y)); // false
System.out.println("Not Equal: " + (x != y)); // true
System.out.println("Greater Than: " + (x > y)); // false
System.out.println("Less Than: " + (x < y)); // true
System.out.println("Greater or Equal: " + (x >= y)); // false
System.out.println("Less or Equal: " + (x <= y)); // true
```

#### Logical Operations

```java
boolean p = true, q = false;
System.out.println("AND: " + (p && q)); // false
System.out.println("OR: " + (p || q)); // true
System.out.println("NOT: " + (!p)); // false
```

#### Assignment Operations

```java
int num = 5;
num += 3; // num = num + 3
System.out.println("After += : " + num); // 8
num *= 2; // num = num * 2
System.out.println("After *= : " + num); // 16
num -= 4; // num = num - 4
System.out.println("After -= : " + num); // 12
num /= 3; // num = num / 3
System.out.println("After /= : " + num); // 4
```

The lesson code is available in the file: [ArithmeticAndLogicalAndAssignmentAndRelationalOperations.java](./lesson3/ArithmeticAndLogicalAndAssignmentAndRelationalOperations.java).

<div align="right">
    <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 4: Basics of OOP — Classes, Objects, and Reference Types

### Key Concepts

- **Class** — A blueprint/template for creating objects.
- **Object** — An instance of a class in memory.
- **Reference Type** — A data type that stores a reference to an object.

### Differences from Primitive Types

| Characteristic      | Primitive Types         | Reference Types       |
|---------------------|-------------------------|-----------------------|
| Storage             | Directly stores value  | Stores reference to object |
| Size                | Fixed                  | Depends on the object |
| Initialization      | Mandatory              | Defaults to `null`    |
| Examples            | `int`, `boolean`, etc. | `String`, arrays, classes |

### Example Classes

```java
public class Car {
    // Class fields
    String color = "red";
    String engine = "v6";
}
```

```java
public class BankAccount {
    // Class fields
    int id;
    String name;
    double balance;
}
```

Lesson code is available in the files:

- [Car.java](./lesson4/Car.java)
- [BankAccount.java](./lesson4/BankAccount.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 5: Creating Objects, Constructors, and Method Calls

This lesson covers:

- The process of creating objects
- The concept of constructors
- Declaring and calling methods

### Creating Objects

```java
public class Car {
    String color;
    String engine;
    
    // Constructor
    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

// Creating an object
Car myCar = new Car("red", "V6");
```

### Constructors

```java
public class Human {
    String name;
    Car car;
    BankAccount account;
    
    // Constructor without parameters
    Human() {
        this("Default", null, null);
    }
    
    // Constructor with parameters
    Human(String name, Car car, BankAccount account) {
        this.name = name;
        this.car = car;
        this.account = account;
    }
}
```

### Methods

```java
public class Car2 {
    String color;
    String engine;
    int speed;
    
    // Method to increase speed
    int accelerate(int acceleration) {
        speed += acceleration;
        return speed;
    }
    
    // Method to decrease speed
    int brake(int deceleration) {
        speed -= deceleration;
        return speed;
    }
}
```

### Calling Methods

```java
class Car2Test {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.speed = 60;

        // Calling methods
        car.accelerate(20);  // speed = 80
        car.brake(80);       // speed = 0
    }
}
```

### Example of Method Usage: Creation and Invocation

```java
public class ConceptAndMethodCall {
  int sum(int a, int b, int c) {
    return a + b + c;
  }

  int average(int a, int b, int c) {
    return sum(a, b, c) / 3;
  }
}

class Test {
  public static void main(String[] args) {
    ConceptAndMethodCall obj = new ConceptAndMethodCall();
    System.out.println("Sum: " + obj.sum(10, 20, 30));
    System.out.println("Average: " + obj.average(20, 40, 60));
  }
}
```

Lesson code is available in the files:

- [Car.java](./lesson5/Car.java)
- [Car2.java](./lesson5/Car2.java)
- [ConceptAndMethodCall.java](./lesson5/ConceptAndMethodCall.java)
- [Human.java](./lesson5/Human.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 6: Method and Constructor Overloading (`overloading`). The `this` Keyword

This lesson covers:

- Overloading methods and constructors
- Using the `this` keyword

### Method Overloading

Overloading allows defining multiple methods with the same name but different parameters.

```java
public class MathUtils {
    // Method with one parameter
    int sum(int a) {
        return a;
    }
    
    // Overloaded method with two parameters
    int sum(int a, int b) {
        return a + b;
    }
}
```

### Constructor Overloading

Constructor overloading allows creating objects in different ways.

```java
public class Car {
    String model;
    int year;

    // Constructor without parameters
    public Car() {
        this("Unknown", 2000);
    }

    // Constructor with parameters
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
```

### Using the `this` Keyword

- To refer to class fields
- To call other constructors
- To pass the current object

```java
public class Employee {
    String name;
    int age;
    
    // Using `this` for fields
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Using `this()` to call another constructor
    public Employee() {
        this("Unknown", 0);
    }
}
```

Lesson code is available in the files:

- [MethodOverloading.java](./lesson6/MethodOverloading.java)
- [MethodOverloading2.java](./lesson6/MethodOverloading2.java)
- [EmployeeConstructorOverloading.java](./lesson6/EmployeeConstructorOverloading.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 7: The Concept of `package`. Access Modifiers

This lesson covers:

- The concept of `package` and its usage
- Access modifiers (`private`, `default`, `protected`, `public`)

### Packages (`package`)

Packages are used to organize classes and prevent name conflicts.  
Example of declaring a package:

```java
package lesson7;

public class Example {
    public void showMessage() {
        System.out.println("Hello from package lesson7!");
    }
}
```

Using a class from another package:

```java
import lesson7.Example;

public class Main {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.showMessage();
    }
}
```

### Access Modifiers

Access modifiers define the visibility of classes, fields, and methods.

| Modifier    | Visible in Class | Visible in Package | Visible in Subclasses | Visible in Other Packages |
|-------------|------------------|--------------------|-----------------------|---------------------------|
| `private`   | ✅               | ❌                | ❌                   | ❌                        |
| (default)   | ✅               | ✅                | ❌                   | ❌                        |
| `protected` | ✅               | ✅                | ✅                   | ❌                        |
| `public`    | ✅               | ✅                | ✅                   | ✅                        |

### Example of Access Modifiers

```java
package lesson7;

public class AccessExample {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;
}
```

Usage in another class within the same package:

```java
package lesson7;

public class TestAccess {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        // example.privateVar; // Error: private field is not accessible
        System.out.println(example.defaultVar);  // Accessible
        System.out.println(example.protectedVar); // Accessible
        System.out.println(example.publicVar);    // Accessible
    }
}
```

Lesson code is available in the files:

- [A.java](./lesson7/A.java)
- [B.java](./lesson7/B.java)
- [Employee.java](./lesson7/Employee.java)
- [OtherClass.java](./lesson7/OtherClass.java)
- [ThirdClass.java](./lesson7_1/ThirdClass.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 8: The Concept of `Constant`. Modifiers `final` and `static`

This lesson covers:

- The concept of `constant` and its usage
- Modifiers (`final`, `static`)

### `final` — Immutability

The `final` modifier makes variables, methods, and classes immutable.

#### 1. `final` for Variables

A variable declared with `final` can only be assigned once.

```java
public class FinalExample {
    final int CONSTANT = 10;

    void changeValue() {
        // CONSTANT = 20; // Error: cannot modify a final variable
    }
}
```

#### 2. `final` for Methods

Methods declared with `final` cannot be overridden in derived classes.

```java
class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void show() { } // Error: cannot override a final method
}
```

#### 3. `final` for Classes

A class declared with `final` cannot be extended.

```java
final class UnmodifiableClass {
}

// class SubClass extends UnmodifiableClass {} // Error: cannot inherit from a final class
```

### `static` — Belonging to the Class

The `static` modifier makes variables and methods belong to the class rather than to instances.

#### 1. `static` Variables

Shared among all instances of the class.

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count); // Output: 2
    }
}
```

#### 2. `static` Methods

Can be called without creating an object.

```java
class StaticMethodExample {
    static void greet() {
        System.out.println("Hello, world!");
    }
}

public class Main {
    public static void main(String[] args) {
        StaticMethodExample.greet(); // Output: Hello, world!
    }
}
```

#### 3. `static` Block

Executed once when the class is loaded.

```java
class StaticBlockExample {
    static {
        System.out.println("Static block executed.");
    }
}

public class Main {
    public static void main(String[] args) {
        new StaticBlockExample();
        new StaticBlockExample();
    }
}
// Output: "Static block executed." only once
```

### Constants (`static final`)

Variables that cannot be modified and belong to the class.

```java
class MathConstants {
    static final double PI = 3.1415926535;
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathConstants.PI); // Output: 3.1415926535
    }
}
```

Lesson code is available in the files:

- [Car.java](./lesson8/Car.java)
- [Student.java](./lesson8/Student.java)
- [NonAccessModify.java](./lesson8/NonAccessModify.java)
- [StudentNonAccessStatic.java](./lesson8/StudentNonAccessStatic.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 9: Types of Variables and Their Scope

This lesson covers:

- Types of variables in Java
- Their scope and lifetime
- Differences between local, instance, and static variables

### Types of Variables

| Variable Type   | Declared In         | Accessibility          | Lifetime                  |
|------------------|---------------------|-------------------------|---------------------------|
| Local            | Inside a method    | Only within the method | While the method executes |
| Instance         | Inside a class (non-`static`) | Unique to each object | While the object exists   |
| Static           | Inside a class with `static` | Shared across all objects | While the program runs    |

### Local Variables

Local variables are created inside methods and are only accessible there.  
**Important:** Local variables **do not have default values** and **must be initialized**.

```java
public void changeColor(String color) {
    System.out.println("New car color: " + color);
    int price = 5000; // Local variable
    price += 5000;
}
```

- Local variables cannot have access modifiers (`public`, `private`, etc.).
- They are not accessible outside the method.

### Instance Variables (Class Fields)

Instance variables store object-specific data and can be used across methods.

```java
public class Car {
    String color; // Instance variable
    int a = 10;
}
```

- Automatically initialized (0 for numbers, `false` for `boolean`, `null` for objects).
- Each object has its own copy of instance variables.

Usage:

```java
public void showColor() {
    System.out.println("Car color: " + color);
    changeColor("red");
}
```

### Static Variables (Class Variables)

Static variables are shared across all instances of a class.

```java
public static int count; // Static variable
```

- Exist independently of objects.
- Changes affect all instances globally.

Example usage:

```java
public Car(String color, String engine) {
    this.color = color;
    this.engine = engine;
    count++; // Increment global counter
}
```

### Variable Naming Rules

Allowed names:

```java
int aTypeOfVariable = 10;
int ATypeOfVariable = 10;
int _TypeOfVariable = 10;
int $TypeOfVariable = 10;
int variable56 = 10;
```

Disallowed names:

```java
int 56variable = 10;  // Cannot start with a digit
int static = 10;      // Reserved keyword
int int = 10;
int boolean = 10;
int class = 10;
```

Allowed but not recommended:

```java
int String = 10;
int Class = 10;
```

Recommended practice for constants:

```java
final int MAX_SPEED = 120; // Constant
```

### Using `this`

The `this` keyword refers to the current object and is used to access instance variables within methods.

```java
public Car(String color, String engine) {
    this.color = color;
    this.engine = engine;
}
```

In methods, `this` is optional but can be used for clarity:

```java
public void showColor() {
    System.out.println("Car color: " + color);
    this.changeColor("black"); // Using `this`
}
```

Lesson code is available in the files:

- [Car.java](./lesson9/TypesOfVariablesAndLimitsOfTheirVisibilityCar.java)
- [Student.java](./lesson9/Student.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 10: Concepts of `import` and `import static`. Using Comments

This lesson covers:

- The concepts of `import` and `import static`
- The usage and types of comments

### `import` and `import static`

In Java, classes from other packages can be imported using `import`, while static methods and variables can be imported using `import static`.

### Regular Import

```java
import lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar;
import lesson9.Student;
```

- Allows using classes without specifying the full path.
- **Does not increase file size.**
- **Cannot import two classes with the same name from different packages.**

```java
// Error! Cannot import two versions of the Student class
import lesson9.Student;
import lesson8.Student;
```

If classes have the same name, **use the full path**:

```java
lesson9.Student student1 = new lesson9.Student();
lesson8.Student student2 = new lesson8.Student();
```

### Importing All Classes in a Package

```java
import lesson9.*;
import lesson8.*;
```

- Allows importing **all classes** from a package.
- **Does not import classes from sub-packages.**

```java
// Error! lesson9.subpackage.* is not automatically imported
import lesson9.*;
import lesson9.subpackage.*;
```

### `import static`

Allows using **static** methods and variables **without specifying the class name**.

```java
import static lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar.count;
```

Equivalent to:

```java
System.out.println(lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar.count);
```

With **`import static`**, you can simply write:

```java
System.out.println(count);
```

Importing all static members:

```java
import static lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar.*;
```

### Comments in Java

| Type            | Syntax       | Description                          |
|------------------|-------------|--------------------------------------|
| Single-line      | `//`        | Comment until the end of the line    |
| Multi-line       | `/* ... */` | Comment spanning multiple lines      |
| Javadoc          | `/** ... */`| Documentation for classes and methods|

Examples:

```java
// Single-line comment
int a = 5; // Can also be after a statement

/* 
    Multi-line comment 
    Used for larger blocks of text 
*/

/**
 * Javadoc comment
 * @author Author
 * @version 1.0
 */
public class Example { }
```

The Javadoc generator creates HTML documentation based on `/** ... */` comments.

The lesson code is available in the file:

- [ConceptOfImportAndStaticImportAndViewComments.java](./lesson10/ConceptOfImportAndStaticImportAndViewComments.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 11: Using Primitive and Reference Data Types in Method Calls

This lesson covers:

- Passing **primitive** data types to methods
- Passing **reference** data types to methods
- The effect of changes in the method on the original variables

### Passing Primitive Types

Primitive types (e.g., `int`, `double`) are passed **by value** — a copy of the value is passed, not the variable itself.

```java
public double doubling(double a) {
    a = a * 2;
    return a;
}
```

Method call:

```java
ArgumentsMethodEmployee employee1 = new ArgumentsMethodEmployee("Max", 500);
double result = employee1.doubling(employee1.salary);
System.out.println("Value a, not salary = " + result);
System.out.println("Salary = " + employee1.salary);
```

Output:

```java
Value a, not salary = 1000.0
Salary = 500.0
```

- The **original variable** `salary` **remains unchanged** because the method works with a copy of the value.

### Passing Reference Types

Reference types (objects) are passed by the value of the reference, but the object itself can be modified.

```java
public static void changeName(ArgumentsMethodStudent student) {
    student.name = "Kolya";
}
```

Method call:

```java
ArgumentsMethodStudent st1 = new ArgumentsMethodStudent("Ivan", 3, 9.5);
changeName(st1);
System.out.println(st1.name);
```

Output:

```bash
Kolya
```

- The **object is modified** because the method changes its `name` field.

### Attempt to Swap Objects (Does Not Work)

```java
public static void swap(ArgumentsMethodStudent student1, ArgumentsMethodStudent student2) {
    ArgumentsMethodStudent temp = student1;
    student1 = student2;
    student2 = temp;
}
```

Method call:

```java
ArgumentsMethodStudent st1 = new ArgumentsMethodStudent("Ivan", 3, 9.5);
ArgumentsMethodStudent st2 = new ArgumentsMethodStudent("Petr", 1, 5.3);
swap(st1, st2);
System.out.println(st1.name);
System.out.println(st2.name);
```

Output:

```bash
Ivan
Petr
```

- The **variables** `st1` **and** `st2` **do not swap places** because the method receives copies of the references.

Lesson code is available in the files:

- [ArgumentsMethodEmployee.java](./lesson11/ArgumentsMethodEmployee.java)
- [ArgumentsMethodStudent.java](./lesson11/ArgumentsMethodStudent.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 12: `if` and `if else` Constructs. Ternary Operator

This lesson covers:

- Using conditional operators `if` and `if else`
- Applying the ternary operator `? :` for value selection

### `if` Construct

Executes code if the condition is true (`true`).

```java
if (a > b) {
    System.out.println("a is greater than b");
}
```

- If `a > b`, the message will be printed.

### `if else` Construct

Used when different actions are needed depending on the condition.

```java
if (a > b) {
    System.out.println("a is greater than b");
} else {
    System.out.println("b is greater than or equal to a");
}
```

- If `a > b`, the first block is executed.
- If `a <= b`, the `else` block is executed.

### `if else if` (Multiple Conditions)

Used when there are multiple alternatives.

```java
void max(int a, int b, int c) {
    if (a > b && a > c) {
        System.out.println("a is maximum");
    } else if (b > a && b > c) {
        System.out.println("b is maximum");
    } else {
        System.out.println("c is maximum");
    }
}
```

### Ternary Operator `? :`

Replaces `if else` for assigning values.

Format:

```java
variable = (condition) ? value_if_true : value_if_false;
```

Example:

```java
int a = 10;
int b = 15;
int max = (a > b) ? a : b;
System.out.println("Max: " + max);
```

Output:

```bash
Max: 15
```

### Comparison Table of Conditional Constructs

| Construct       | Usage                     | Features                          |
|------------------|---------------------------|------------------------------------|
| `if`            | Simple condition check    | Only one block of code            |
| `if else`       | Choose between two options| Always executes one of the blocks |
| `if else if`    | Multiple conditions       | Checks several conditions         |
| Ternary Operator| Assign value by condition | Compact for simple conditions     |

Lesson code is available in the file:

- [FlowControlIfAndIfElseAndTernaryOperator.java](./lesson12/FlowControlIfAndIfElseAndTernaryOperator.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 13: The `switch` Statement

This lesson covers:

- Using `switch` to select one of several options
- Rules and supported data types in `switch`
- Features and limitations of `switch`

### `switch` — An Alternative to `if-else`

The `switch` statement can replace multiple `if-else` blocks when comparing a single value.

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no match
}
```

### Supported Data Types

`switch` supports:
✅ `byte`, `short`, `char`, `int`  
✅ `String` (since Java 7)  
✅ `enum`

❌ **Not Supported**:

- `double`, `float`, `long`
- Objects (`Object`, `List`, etc.)

### Example of `switch`

```java
class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student = new Student(2);

        switch (student.grade) {
            case 2:
                System.out.println("Unsatisfactory");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Unknown grade");
        }
    }
}
```

### `case` and `final` Variables

✅ **You can use `final` variables** if they are compile-time constants:

```java
final int C = 1;
switch (C) {
    case 1:
        System.out.println("Case 1");
        break;
}
```

❌ **You cannot use variables evaluated at runtime**:

```java
int a = 2;
switch (a) {  
    case a * 2:  // Error! `a * 2` is evaluated at runtime
        System.out.println("Error!");
        break;
}
```

### `default` in `switch`

- Executes if no `case` matches
- Similar to `else` in `if-else`

```java
switch (value) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    default:
        System.out.println("Unknown value");
}
```

### Comparison Table: `switch` vs `if-else`

| Feature           | `switch`               | `if-else`            |
|--------------------|------------------------|----------------------|
| Readability        | Better for many cases | Better for 2-3 conditions |
| Performance        | Higher (jump table)   | Lower (sequential checks) |
| Condition Flexibility | Equality only       | Any boolean expression |
| Supported Data Types | Limited              | Any boolean expression |

The lesson code is available in the file:

- [SwitchStatement.java](./lesson13/SwitchStatement.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 14: The Classic `for` Loop. `break` and `continue` Statements

This lesson covers:

- Structure of the `for` loop
- Nested loops
- `break` and `continue` statements
- Labeled loops
- `unreachable statement` errors

### Basic Syntax of `for`

The `for` loop is used when the number of iterations is known.

```java
for (initialization; condition; update) {
    // loop body
}
```

Example: Print a message 10 times:

```java
for (int i = 0; i < 10; i++) {
    System.out.println("Lesson #14");
}
```

Explanation:

- `int i = 0;` – initialize the counter
- `i < 10;` – loop condition
- `i++` – increment `i` after each iteration

### Nested Loops

Example: Print hours and minutes:

```java
for (int hour = 0; hour < 24; hour++) {
    for (int minute = 0; minute < 60; minute++) {
        System.out.println(hour + ":" + minute);
    }
}
```

### `break` and `continue`

- `break` - exits the loop
- `continue` - skips the current iteration

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) continue; // Skip 5
    if (i == 7) break;    // Exit at 7
    System.out.println(i);
}
```

Output:

```bash
1  
2  
3  
4  
6  
```

### Labeled Loops

Labeled loops allow control over specific loops in nested structures.

```java
OUTER:
for (int hour = 0; hour < 24; hour++) {
    for (int minute = 0; minute < 60; minute++) {
        if (minute == 20) continue OUTER; // Skip to the next hour
        if (minute == 30) break OUTER;    // Exit the outer loop
        System.out.println(hour + ":" + minute);
    }
}
```

### `Unreachable Statement`

A compilation error occurs if code is never executed.

```java
// Error: condition is always false
for (int i = 0; false; i++) { 
    System.out.println(i);
}

// Will never execute
if (10 < 3) { 
    System.out.println("Unreachable code");
}
```

### Comparison Table of Loop Control Statements

| Statement       | Action                  | Use Case                     |
|------------------|-------------------------|------------------------------|
| `break`         | Exits the loop          | Exit the loop prematurely    |
| `continue`      | Skips the current iteration | Skip specific values         |
| `break LABEL`   | Exits the labeled loop  | Exit nested loops            |
| `continue LABEL`| Skips to the next iteration of the labeled loop | Control nested loops |

The lesson code is available in the files:

- [ClassicalCycleFor.java](./lesson14/ClassicalCycleFor.java)
- [ClassicalCycleForNestedLoop.java](./lesson14/ClassicalCycleForNestedLoop.java)
- [ClassicalCycleForUnreachableStatement.java](./lesson14/ClassicalCycleForUnreachableStatement.java)
- [StatementBreakAndContinue.java](./lesson14/StatementBreakAndContinue.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 15: `while` and `do while` Loops

This lesson covers:

- The `while` loop
- The `do while` loop
- Using `break` and `continue`
- Labeled loops

### `while` Loop

Used when the number of iterations is unknown but there is a condition.

```java
public class CycleWhileAndDoWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
```

How it works:

1. The condition `i <= 10` is checked.
2. If `true`, the loop body is executed.
3. `i++` increments the counter.
4. Repeats until `i` becomes 11.

### `do while` Loop

Ensures at least one iteration, even if the condition is initially `false`.

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
```

Differences from `while`:

- `while` → checks **before** executing the code.
- `do while` → checks **after** executing the code.

### Breaking Loops: `break` and `continue`

```java
public class BreakContinueExample {
    public static void main(String[] args) {
        int a = 1;
        while (true) { 
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                break; // Exits the loop
            }
            a++;
        }
    }
}
```

### Using Labeled Loops

```java
public class LabeledLoopExample {
    public static void main(String[] args) {
        OUTER: 
        do {
            int min = 0;
            INNER:
            while (min < 60) {
                if (min == 20) {
                    continue OUTER; // Skips to the next iteration of the outer loop
                }
                System.out.println(min);
                min++;
            }
        } while (false);
    }
}
```

### Comparison of `while` and `do while`

| Characteristic      | `while`         | `do while`      |
|---------------------|-----------------|-----------------|
| Condition Check     | At the start    | At the end      |
| Minimum Iterations  | 0               | 1               |
| Use Case            | Unknown repetitions | At least one iteration |

### Key Features of Loops

1. `break` - completely exits the loop.
2. `continue` - skips the current iteration.
3. Labels allow control over nested loops.
4. Infinite loops are created using `while(true)`.

The lesson code is available in the file:

- [CycleWhileAndDoWhile.java](./lesson15/CycleWhileAndDoWhile.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 16: All About the `String` Class

This lesson covers:

- Creating strings and memory differences
- Comparing strings
- String manipulation methods
- String Pool and memory allocation

### Creating Strings

Strings in Java can be created in two ways:

```java
// Using literals (String Pool)
String str4 = "Good morning";  // Stored in the String Pool
String str5 = "Good morning";  // Refers to the same object

// Using the constructor (Heap)
String str1 = new String("Good morning");  // Creates a new object
String str2 = new String("Bad day");       // Creates a new object
```

### Comparing Strings

```java
// Comparing references (not recommended for values)
System.out.println(str1 == str2);        // false
System.out.println(str4 == str5);        // true (same object in the pool)

// Correct value comparison
System.out.println(str1.equals(str2));   // false
System.out.println(str4.equals(str5));   // true
```

### Key String Methods

```java
// Accessing characters
char first = str1.charAt(0);         // 'G'
char fifth = str1.charAt(5);         // 'm'

// String length
int length = str1.length();          // 12

// Case conversion
String upper = str1.toUpperCase();   // "GOOD MORNING"
String lower = str1.toLowerCase();   // "good morning"

// Searching
int index = str1.indexOf('m');       // 5
int lastIndex = str1.lastIndexOf('g'); // 10

// Substrings
String sub1 = str1.substring(0, 4);  // "Good"
String sub2 = str1.substring(5);     // "morning"

// Replacing characters
String replaced = str1.replace(' ', '-');  // "Good-morning"

// Trimming spaces
String trimmed = "  Hello  ".trim();  // "Hello"

// Checking content
boolean starts = str1.startsWith("Good");  // true
boolean ends = str1.endsWith("ing");       // true
boolean contains = str1.contains("mor");   // true
```

### Comparison Table of String Methods

| Method          | Description                  | Example                  |
|------------------|------------------------------|--------------------------|
| `charAt()`       | Get character by index       | `str.charAt(0)`          |
| `length()`       | Get string length            | `str.length()`           |
| `substring()`    | Extract substring            | `str.substring(0, 4)`    |
| `toLowerCase()`  | Convert to lowercase         | `str.toLowerCase()`      |
| `toUpperCase()`  | Convert to uppercase         | `str.toUpperCase()`      |
| `trim()`         | Remove leading/trailing spaces | `str.trim()`           |
| `replace()`      | Replace characters/substrings | `str.replace('a', 'b')` |
| `contains()`     | Check for substring presence | `str.contains("abc")`   |

### String Features in Java

1. Strings are immutable.
2. Literals use the String Pool for memory efficiency.
3. Concatenation creates a new object.
4. Use `equals()` for value comparison instead of `==`.
5. Indexing starts at 0.

### Optimizing String Operations

```java
// Inefficient
String result = "";
for (int i = 0; i < 100; i++) {
    result += i;  // Creates a new object each time
}

// Efficient
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 100; i++) {
    sb.append(i);  // Modifies the existing object
}
String result = sb.toString();
```

The lesson code is available in the file:

- [AllAboutClassString.java](./lesson16/AllAboutClassString.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 17: All About the `StringBuilder` Class

This lesson covers:

- Creating `StringBuilder` objects
- Key methods of the class
- Performance comparison with `String`
- Working with the character buffer

### Creating `StringBuilder` Objects

```java
// Different ways to create a StringBuilder
StringBuilder sb = new StringBuilder();           // Empty (capacity 16)
StringBuilder sb1 = new StringBuilder("Hello");   // With initial string
StringBuilder sb2 = new StringBuilder(50);        // With initial capacity
StringBuilder sb3 = new StringBuilder(sb1);       // Copy of another StringBuilder
```

### Key Methods

#### Information About `StringBuilder`

```java
// Length and capacity
int length = sb.length();          // Current length
int capacity = sb.capacity();      // Current capacity
boolean isEmpty = sb.isEmpty();    // Check if empty
```

#### Modifying Content

```java
// Adding content
sb.append("Hello");               // Append to the end
sb.insert(0, "Start ");           // Insert at index
sb.append(22).append(true);       // Chained calls

// Removing content
sb.delete(1, 3);                  // Remove range
sb.deleteCharAt(0);               // Remove single character

// Replacing and reversing
sb.replace(0, 5, "Hi");           // Replace part of the string
sb.reverse();                     // Reverse the string
```

#### Retrieving Information

```java
// Accessing characters
char ch = sb.charAt(0);           // Get character at index
int idx = sb.indexOf("Hello");    // Find substring
String sub = sb.substring(0, 5);  // Get substring
```

### Comparison Table: `String` vs `StringBuilder`

| Feature            | `String`         | `StringBuilder` |
|---------------------|------------------|-----------------|
| Mutability         | Immutable        | Mutable         |
| Thread-safety      | Yes              | No              |
| Concatenation Performance | Lower         | Higher          |
| Memory Usage       | Higher           | Lower           |
| Synchronization    | Not required     | None            |

### Key Usage Scenarios

1. Frequent string modifications
2. Building strings in loops
3. Concatenating a large number of strings
4. Creating strings based on templates

### Example of Efficient Usage

```java
StringBuilder result = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    result.append(i)
          .append(": ")
          .append("item")
          .append("\n");
}
String finalString = result.toString();
```

The lesson code is available in the file:

- [AllAboutClassStringBuilder.java](./lesson17/AllAboutClassStringBuilder.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 18: Arrays and Working with Arrays

This lesson covers:

- Basics of working with arrays
- Dynamic initialization
- Static initialization
- Methods of the `Arrays` class

### Dynamic Array Initialization

The size of the array is defined at runtime.

```java
public class ArrayDynamicInitialization {
    public static void main(String[] args) {
        String[] array1;
        int[][] array2;
        
        // Initializing arrays
        array1 = new String[3];
        array2 = new int[3][];
        
        // Filling a one-dimensional array
        for (int i = 0; i < array1.length; i++) {
            array1[i] = "Hello " + i;
            System.out.println(array1[i]);
        }
        
        // Initializing a two-dimensional array
        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];
        
        // Filling a two-dimensional array
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + j;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Static Array Initialization

The size and values of the array are defined at declaration.

```java
public class ArrayStaticInitialization {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = {"Hello", "World"};
        
        // Multidimensional arrays
        int[][] array3 = {
            {1, 2},
            {3, 4, 5},
            {6}
        };
        
        // Array references
        double[] array5 = {2.5, 3.5};
        double[] array7 = array5;  // Copying reference
    }
}
```

### Working with the `Arrays` Class

The `Arrays` class provides utility methods for working with arrays.

```java
public class ConsiderationOfTheArraysClassIsMinimal {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        
        // Sorting the array
        Arrays.sort(array1);
        
        // Binary search
        int index = Arrays.binarySearch(array1, -8);
        
        // Printing the array
        System.out.println(Arrays.toString(array1));
    }
}
```

### Comparison Table of `Arrays` Methods

| Method            | Description               | Example                  |
|--------------------|---------------------------|--------------------------|
| `sort()`          | Sorts the array           | `Arrays.sort(array)`     |
| `binarySearch()`  | Searches for an element   | `Arrays.binarySearch(array, key)` |
| `equals()`        | Compares two arrays       | `Arrays.equals(array1, array2)` |
| `fill()`          | Fills the array with a value | `Arrays.fill(array, value)` |
| `toString()`      | Converts array to string  | `Arrays.toString(array)` |

### Key Features of Arrays

1. Indexing starts at 0
2. Array length is fixed after creation
3. Arrays are objects
4. Primitive type elements are initialized to default values
5. Accessing out-of-bounds indices throws `ArrayIndexOutOfBoundsException`

The lesson code is available in the files:

- [ArrayDynamicInitialization.java](./lesson18/ArrayDynamicInitialization.java)
- [ArrayStaticInitialization.java](./lesson18/ArrayStaticInitialization.java)
- [ConsiderationOfTheArraysClassIsMinimal.java](./lesson18/ConsiderationOfTheArraysClassIsMinimal.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 19: Method Parameters of Type `varargs`, Command Line Arguments, and `foreach` Loop

This lesson covers:

- Variable-length parameters (`varargs`)
- Working with command line arguments
- Using the `foreach` loop
- Compiling and running Java programs

### Variable-Length Parameters (`varargs`)

`varargs` allows passing a variable number of arguments to a method. It must be the last parameter in the method signature.

```java
public class VariableArgumentsVarArgs {
    // Overloaded methods
    static void sum(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }
    
    static void sum(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }

    // Method with varargs
    static void sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of variable arguments: " + sum);
    }
}
```

### Command Line Arguments

Program parameters are passed through the `String[] args` array in the `main` method.

```java
public class CommandLineArguments {
    public static void main(String[] args) {
        // Print the first argument
        System.out.println("First argument: " + args[0]);
        // Print the number of arguments
        System.out.println("Number of arguments: " + args.length);
    }
}
```

### `foreach` Loop

A simplified way to iterate over elements of an array or collection.

```java
public void abc(int[]... arrays) {
    for (int[] array : arrays) {        // Outer foreach
        for (int number : array) {      // Inner foreach
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
```

### Compiling and Running Java Programs

| Command | Description |
|---------|-------------|
| `javac ClassName.java` | Compiles the source code |
| `java ClassName` | Runs the program |
| `java ClassName arg1 arg2` | Runs the program with arguments |

### Features of `varargs`

| Feature       | Description                     | Example                          |
|---------------|---------------------------------|----------------------------------|
| Position      | Must be the last parameter      | `void method(String s, int... nums)` |
| Type          | Treated as an array            | `int... nums` becomes `int[] nums` |
| Count         | From 0 to many arguments       | `sum()` or `sum(1,2,3,4,5)`     |

### Examples of Using `foreach`

```java
// With a single-dimensional array
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.print(num + " ");
}

// With a two-dimensional array
int[][] matrix = {{1,2}, {3,4}, {5,6}};
for (int[] row : matrix) {
    for (int num : row) {
        System.out.print(num + " ");
    }
}
```

### Examples of Running with Arguments

```bash
# Compile
javac CommandLineArguments.java

# Run with arguments
java CommandLineArguments 25 67 hello goodbye
```

The lesson code is available in the files:

- [CommandLineArguments.java](./lesson19/CommandLineArguments.java)
- [VariableArgumentsVarArgs.java](./lesson19/VariableArgumentsVarArgs.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 20: All About the `ArrayList` Class

This lesson covers:

- Basics of working with `ArrayList`
- Methods for data manipulation
- Working with iterators
- Comparison with regular arrays

### Creating an ArrayList

`ArrayList` is a dynamic data structure that automatically expands as elements are added.

```java
// Different ways to create an ArrayList
ArrayList<String> list1 = new ArrayList<>();           // Empty list
ArrayList<String> list2 = new ArrayList<>(50);         // With initial capacity
ArrayList<String> list3 = new ArrayList<>(otherList);  // Copy of an existing list
```

### Key Methods of `ArrayList`

#### Adding Elements

```java
ArrayList<String> list = new ArrayList<>();
list.add("Java");                 // Add to the end of the list
list.add(1, "Python");            // Add at a specific index
list.addAll(anotherList);         // Add a collection
list.addAll(1, anotherList);      // Add a collection at a specific index
```

#### Accessing and Modifying Elements

```java
String element = list.get(0);     // Get an element
list.set(1, "C++");               // Replace an element
```

#### Removing Elements

```java
list.remove(0);                   // By index
list.remove("Java");              // By value
list.clear();                     // Remove all elements
```

### Informational Methods

```java
int size = list.size();           // Get the size of the list
boolean isEmpty = list.isEmpty(); // Check if the list is empty
boolean contains = list.contains("Java"); // Check if an element exists
int index = list.indexOf("Java"); // Find the first occurrence of an element
```

### Working with Iterators

#### Using `Iterator`

```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}
```

#### Using `ListIterator`

```java
ListIterator<String> listIterator = list.listIterator();
while (listIterator.hasNext()) {
    listIterator.next();
    listIterator.remove();
}
```

### Converting `ArrayList`

```java
// To an Object array
Object[] array = list.toArray();

// To a typed array
String[] strArray = list.toArray(new String[0]);

// From an array to a List
String[] array = {"A", "B", "C"};
List<String> list = Arrays.asList(array);
```

### Comparison Table: Array vs ArrayList

| Feature            | Array          | ArrayList       |
|---------------------|----------------|-----------------|
| Size               | Fixed          | Dynamic         |
| Performance        | Higher         | Lower           |
| Primitive Types    | Supported      | Not supported (only wrappers) |
| Multidimensional   | Supported      | Not directly (requires nesting) |
| Generics           | Not supported  | Supported       |

### Key Features of `ArrayList`

1. Automatically expands when elements are added.
2. Default initial capacity is 10 elements.
3. When full, a new array with increased capacity is created.
4. Supports only reference data types.

The lesson code is available in the files:

- [AllAboutArrayList.java](./lesson20/AllAboutArrayList.java)
- [AllAboutMethodsArrayList.java](./lesson20/AllAboutMethodsArrayList.java)
- [AllAboutMethodsArrayList2.java](./lesson20/AllAboutMethodsArrayList2.java)
- [AllAboutMethodsArrayList3.java](./lesson20/AllAboutMethodsArrayList3.java)
- [AllAboutMethodsArrayList4.java](./lesson20/AllAboutMethodsArrayList4.java)
- [ReplaceElementsArrayListWithoutMethods.java](./lesson20/ReplaceElementsArrayListWithoutMethods.java)
- [IteratorAndListIterator.java](./lesson20/IteratorAndListIterator.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 21: Encapsulation, Inheritance, and the `protected` Modifier

This lesson covers:

- The concept of encapsulation
- Class inheritance
- The `protected` modifier
- The `super` keyword

### Encapsulation

Encapsulation is a mechanism that combines data and methods that manipulate that data, while protecting it from external interference.

```java
public class EncapsulationHuman {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }
}
```

### Inheritance

Inheritance allows creating a new class based on an existing one.

```java
class Employee {
    double salary = 100;
    String name;
    void eat() {
        System.out.println("eating");
    }
}

class Doctor extends Employee {
    String specialty;
    void treat() {
        System.out.println("treating");
    }
}
```

### The `protected` Modifier

`protected` makes class members accessible within the package and in subclasses.

```java
public class Human {
    protected String name;
    protected static int salary = 150;
    
    protected Human(String name) {
        this.name = name;
    }
}
```

### The `super` Keyword

`super` is used to call the constructor or methods of the parent class.

```java
class Student extends Human {
    public Student(String name) {
        super(name); // Call the parent class constructor
    }
}
```

### Inheritance Hierarchy

| Level   | Class       | Inherits From |
|---------|-------------|---------------|
| 1       | `Employee`  | `Object`      |
| 2       | `Doctor`, `Teacher`, `Driver` | `Employee` |
| 3       | `Surgeon`, `Dentist` | `Doctor` |

The lesson code is available in the files:

- [Inheritance.java](./lesson21/Inheritance.java)
- [EncapsulationHuman.java](./lesson21/EncapsulationHuman.java)
- [Human.java](./lesson21/Human.java)
- [Test1.java](./lesson21/p1/Test1.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 22: Overridden and Hidden Methods. Runtime Binding and Compile Time Binding

This lesson covers:

- Overridden methods (Method Overriding)
- Hidden methods (Method Hiding)
- Runtime binding (dynamic binding)
- Compile time binding (static binding)

### Method Overriding

Overriding allows a subclass to provide a specific implementation of a method defined in its parent class.

```java
class Employee {
    Food eat() {
        System.out.println("eating employee");
        return new Food();
    }
}

class Teacher extends Employee {
    @Override
    protected Food eat() {
        System.out.println("eating teacher");
        return new Fruit();
    }
}
```

### Method Hiding

Method hiding occurs when a static method in a subclass has the same name as one in its parent class.

```java
class Animal {
    static String showName() {
        return "some animal";
    }
}

class Mouse extends Animal {
    static String showName() {
        return "Jerry";
    }
}
```

### Runtime Binding (Dynamic Binding)

The method to be called is determined at runtime.

```java
Employee e1 = new Teacher(); // Runtime binding
e1.eat(); // Calls the eat() method of the Teacher class
```

### Compile Time Binding (Static Binding)

The method to be called is determined at compile time.

```java
void abc(Animal a) { System.out.println("a"); }
void abc(Mouse m) { System.out.println("m"); }

Animal a = new Mouse();
abc(a); // Calls the abc(Animal a) method
```

### Rules for Method Overriding

1. The method in the subclass must have the same signature as in the parent class.
2. The return type can be covariant.
3. The access level can be widened.
4. Exceptions can be narrowed or removed.

### Using `super`

```java
class B8 extends SuperKeywordDemo {
    String s2 = super.s1 + " world";
    
    int summa(int... i) {
        int res = super.summa(i);
        System.out.println("Super summa: " + res);
        return res;
    }
}
```

### Class Hierarchy for Demonstration

| Base Class | Subclasses       |
|------------|------------------|
| `Employee` | `Teacher`, `Doctor`, `Driver` |
| `Animal`   | `Mouse`          |
| `Food`     | `Fruit`          |

The lesson code is available in the files:

- [CharacterOperations.java](./lesson22/CharacterOperations.java)
- [EmployeeHierarchyDemo.java](./lesson22/EmployeeHierarchyDemo.java)
- [DynamicBindingDemo.java](./lesson22/DynamicBindingDemo.java)
- [BindingDifferenceDemo.java](./lesson22/BindingDifferenceDemo.java)
- [InheritanceOverridingDemo.java](./lesson22/InheritanceOverridingDemo.java)
- [SuperKeywordDemo.java](./lesson22/SuperKeywordDemo.java)
- [StaticMethodHiding.java](./lesson22/StaticMethodHiding.java)
- [MethodOverloadingInheritanceDemo.java](./lesson22/MethodOverloadingInheritanceDemo.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 23: Abstract Classes, Abstract Methods, and Interfaces

This lesson covers:

- Abstract classes and methods
- Interfaces and their implementation
- Multiple inheritance through interfaces
- Default methods in interfaces (Java 8+)

### Abstract Classes

Abstract classes provide shared functionality for a group of related classes.

```java
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
        System.out.println("Perimeter of square: " + side * 4);
    }
    
    @Override
    public void square() {
        System.out.println("Area of square: " + side * side);
    }
}
```

### Interfaces

Interfaces define a contract that implementing classes must fulfill.

```java
interface HelpAble {
    void help();
    void putOutTheFire();
    int a = 10; // public static final by default
}

class Teacher extends Employee implements HelpAble {
    @Override
    public void help() {
        System.out.println("Teacher helping");
    }
    
    @Override
    public void putOutTheFire() {
        System.out.println("Teacher putting out fire");
    }
}
```

### Multiple Interface Implementation

```java
class Driver extends Employee implements HelpAble, SwimAble {
    @Override
    public void help() {
        System.out.println("Driver helping");
    }
    
    @Override
    public void putOutTheFire() {
        System.out.println("Driver putting out fire");
    }
    
    @Override
    public void swim() {
        System.out.println("Driver swimming");
    }
}
```

### Default Methods in Interfaces (Java 8+)

```java
interface I1 {
    void abc();
    
    default void def() {
        System.out.println("Default method in interface");
    }
    
    static void xyz() {
        System.out.println("Static method in interface");
    }
}
```

### Key Differences

| Feature                  | Abstract Class       | Interface            |
|--------------------------|----------------------|----------------------|
| Multiple Inheritance     | No                  | Yes                  |
| Fields                   | Any                 | Only constants       |
| Constructor              | Allowed             | Not allowed          |
| Default Methods          | Any                 | Only since Java 8+   |
| Access Modifiers          | Any                 | Only public          |

### Inheritance and Implementation Hierarchy

```bash
Employee (class)
  ↑
  |
Teacher (implements HelpAble)
  
Driver (implements HelpAble, SwimAble)
```

The lesson code is available in the files:

- [AbstractFigureDemo.java](./lesson23/AbstractFigureDemo.java)
- [InterfaceImplementationDemo.java](./lesson23/InterfaceImplementationDemo.java)
- [JumpableInterfaceDemo.java](./lesson23/JumpableInterfaceDemo.java)
- [InterfaceDefaultMethodDemo.java](./lesson23/InterfaceDefaultMethodDemo.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 24: The Concept of Polymorphism. `instanceof` Operator and Type Casting

This lesson covers:

- The concept of polymorphism
- Upcasting and downcasting
- The `instanceof` operator
- Types of polymorphism in Java

### Polymorphism

Polymorphism allows working with objects of different types through a common interface.

```java
// Upcasting
EmployeePolymorphism employee = new TeacherPolymorphism();
EmployeePolymorphism employee1 = new DriverPolymorphism();
EmployeePolymorphism employee2 = new DoctorPolymorphism();

// Array of different employee types
EmployeePolymorphism[] employees = {employee, employee1, employee2};
```

### Type Casting

#### Upcasting

```java
// Implicit casting - automatic
EmployeePolymorphism employee = new TeacherPolymorphism();
HelpAble2 helpAble = new DoctorPolymorphism();
```

#### Downcasting

```java
// Explicit casting - requires type specification
DoctorPolymorphism doctorCasting = (DoctorPolymorphism) employee2;
System.out.println(((DoctorPolymorphism) helpAble).speciality);
```

### `instanceof` Operator

Checks if an object is an instance of a specific class.

```java
System.out.println(employee instanceof TeacherPolymorphism);  // true
System.out.println(employee instanceof DriverPolymorphism);   // false
```

### Class Hierarchy

```java
abstract class EmployeePolymorphism implements HelpAble2 {
    abstract void work();
    void sleep() {
        System.out.println("Employee: I'm sleeping");
    }
}

class TeacherPolymorphism extends EmployeePolymorphism {
    @Override
    void work() {
        System.out.println("Teacher: I'm teaching");
    }
    
    @Override
    public void help() {
        System.out.println("Teacher: I'm helping");
    }
}
```

### Key Features of Polymorphism

| Type of Polymorphism | Example                          | Binding Time |
|-----------------------|----------------------------------|--------------|
| Method Overloading    | `void work()` vs `void work(String task)` | Compile-time |
| Method Overriding     | Implementation of `work()` in subclasses | Runtime      |
| Interface-based       | Implementation of `HelpAble2` interface | Runtime      |

### Rules for Type Casting

1. Upcasting is always safe.
2. Downcasting requires an `instanceof` check.
3. Casting between unrelated types is prohibited.

The lesson code is available in the file:

- [PolymorphismCastingDemo.java](./lesson24/PolymorphismCastingDemo.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 25: Methods `equals()` and `toString()`. Wrapper Classes. Method Overloading and Initialization Order

This lesson covers:

- The `equals()` and `toString()` methods
- Wrapper classes
- Method overloading priorities
- Class initialization order

### `equals()` and `toString()` Methods

Overriding these methods for proper object comparison and string representation.

```java
class CarMethodsEqualAndToString {
    String color;
    String engine;
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CarMethodsEqualAndToString) {
            CarMethodsEqualAndToString c2 = (CarMethodsEqualAndToString) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Color is " + color + ", engine is " + engine;
    }
}
```

### Wrapper Classes

Wrapper classes for primitive types and their usage:

```java
// Autoboxing & Unboxing
ArrayList<Integer> list = new ArrayList<>();
list.add(1);                // autoboxing
int i = list.get(0);       // unboxing

// Parsing methods
String s1 = "50";
int i1 = Integer.parseInt(s1);
boolean b = Boolean.parseBoolean("true");

// valueOf methods
Integer i3 = Integer.valueOf(10);
Double d1 = Double.valueOf("5.5");
```

### Method Overloading Priorities

Order of method selection:

1. Exact match
2. Primitive widening
3. Autoboxing
4. Varargs

```java
void abc(int i) { System.out.println("int"); }
void abc(long i) { System.out.println("long"); }
void abc(Integer i) { System.out.println("Integer"); }
void abc(int... i) { System.out.println("varargs"); }

// Calling abc(5) will select the method with int
```

### Initialization Order

1. Static blocks and fields (in declaration order)
2. Instance blocks and fields (in declaration order)
3. Constructor

```java
public class InitializationOrderDemo {
    static { System.out.println("Static block"); }
    { System.out.println("Instance block"); }
    String s = "field";
    
    public InitializationOrderDemo() {
        System.out.println("Constructor");
    }
}
```

### Comparison Table of Wrapper Class Methods

| Method         | Description                     | Example                     |
|----------------|---------------------------------|-----------------------------|
| `parseInt()`   | Converts string to primitive    | `Integer.parseInt("123")`   |
| `valueOf()`    | Creates a wrapper class object  | `Integer.valueOf("123")`    |
| `toString()`   | Converts to string              | `myInteger.toString()`      |

The lesson code is available in the files:

- [EqualsAndToStringDemo.java](./lesson25/EqualsAndToStringDemo.java)
- [WrapperClassDemo.java](./lesson25/WrapperClassDemo.java)
- [MethodOverloadingPriorityDemo.java](./lesson25/MethodOverloadingPriorityDemo.java)
- [MethodOverloadingResolutionDemo.java](./lesson25/MethodOverloadingResolutionDemo.java)
- [InitializationOrderDemo.java](./lesson25/InitializationOrderDemo.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 26: Exceptions and Their Handling. Try-catch Blocks

This lesson covers:

- Basics of exceptions in Java
- Try-catch-finally blocks
- Exception hierarchy
- Custom exceptions
- Exception propagation (`throws`)

### Basic Exceptions

```java
public class ExceptionBasicDemo {
    public static void main(String[] args) {
        int array[] = {1, 4, 0};
        String s = null;
        
        System.out.println(s.length());     // NullPointerException
        System.out.println(array[5]);       // ArrayIndexOutOfBoundsException
    }
}
```

### Try-catch-finally Blocks

```java
public class TryFinallyExceptionDemo {
    public static void main(String[] args) {
        File f = new File("test9.txt");
        
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Hello, everyone!");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println("Goodbye, everyone!");
        }
    }
}
```

### Custom Exceptions

```java
class TwistYourLegException extends Exception {
    TwistYourLegException(String message) {
        super(message);
    }
    TwistYourLegException() {}
}

class CrampedMuscleException extends RuntimeException {
    CrampedMuscleException(String message) {
        super(message);
    }
    CrampedMuscleException() {}
}
```

### Exception Hierarchy

```
Throwable
├── Error (unchecked)
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── LinkageError
└── Exception
    ├── RuntimeException (unchecked)
    │   ├── NullPointerException
    │   ├── ArithmeticException
    │   ├── IllegalArgumentException
    │   ├── IndexOutOfBoundsException
    │   └── ClassCastException
    └── Checked Exceptions
        ├── IOException
        │   ├── FileNotFoundException
        │   └── EOFException
        ├── SQLException
        └── ClassNotFoundException
```

| Type       | Example                  | Handling Requirement | Characteristics |
|------------|--------------------------|---------------------|-----------------|
| Checked    | `FileNotFoundException`  | Mandatory           | Must be caught or declared |
| Unchecked  | `NullPointerException`  | Optional            | Runtime errors, typically programming mistakes |
| Error      | `StackOverflowError`    | Not recommended     | Serious problems, usually irrecoverable |

Key Points:

- All exceptions inherit from `Throwable`
- `RuntimeException` and its subclasses are unchecked
- Non-RuntimeException subclasses of `Exception` are checked
- `Error` and its subclasses represent serious system problems

### Order of Catch Blocks

```java
try {
    // Code that may throw exceptions
}
catch (NullPointerException e) { /* More specific exception */ }
catch (RuntimeException e) { /* Less specific exception */ }
catch (Exception e) { /* Most general exception */ }
```

### Features of the `finally` Block

- Always executes (even with `return` in try/catch)
- Used for resource cleanup
- Can modify the return value (for reference types)

### Exception Propagation

```java
void abc() throws FileNotFoundException {
    File f = new File("test.txt");
    FileInputStream fis = new FileInputStream(f);
}

void def() throws FileNotFoundException {
    abc();
}
```

The lesson code is available in the files:

- [ExceptionBasicDemo.java](./lesson26/ExceptionBasicDemo.java)
- [FileIOExceptionDemo.java](./lesson26/FileIOExceptionDemo.java)
- [TryFinallyExceptionDemo.java](./lesson26/TryFinallyExceptionDemo.java)
- [ExceptionPropagationDemo.java](./lesson26/ExceptionPropagationDemo.java)
- [ExceptionHierarchyDemo.java](./lesson26/ExceptionHierarchyDemo.java)
- [ExceptionInCatchDemo.java](./lesson26/ExceptionInCatchDemo.java)
- [ExceptionFlowDemo.java](./lesson26/ExceptionFlowDemo.java)
- [ExceptionRethrowDemo.java](./lesson26/ExceptionRethrowDemo.java)
- [ExceptionInheritanceDemo.java](./lesson26/ExceptionInheritanceDemo.java)
- [FinallyReturnValueDemo.java](./lesson26/FinallyReturnValueDemo.java)
- [FinallyWithErrorDemo.java](./lesson26/FinallyWithErrorDemo.java)
- [FileStreamClosureDemo.java](./lesson26/FileStreamClosureDemo.java)
- [InitializerErrorDemo.java](./lesson26/InitializerErrorDemo.java)
- [MarathonExceptionDemo.java](./lesson26/MarathonExceptionDemo.java)
- [NestedStreamExceptionDemo.java](./lesson26/NestedStreamExceptionDemo.java)
- [NestedTryResourceDemo.java](./lesson26/NestedTryResourceDemo.java)
- [NullExceptionThrowDemo.java](./lesson26/NullExceptionThrowDemo.java)
- [CommonExceptionsDemo.java](./lesson26/CommonExceptionsDemo.java)
- [UnreachableCatchDemo.java](./lesson26/UnreachableCatchDemo.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 27: Classes `LocalDate`, `LocalTime`, `LocalDateTime`. Date-Time API

This lesson covers:

- Working with date and time in Java 8+ (Date-Time API)
- Classes `LocalDate`, `LocalTime`, `LocalDateTime`
- Formatting dates and times
- Using `Period` and `Duration`
- Factory Method pattern

### Working with LocalDate, LocalTime, and LocalDateTime

```java
public class DateTimeManipulationDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 1, 25);
        LocalTime time = LocalTime.of(23, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
        // Manipulating dates
        date = date.plusDays(5)
                  .minusMonths(3)
                  .plusYears(1);
        
        // Manipulating times
        time = time.plusHours(2)
                  .minusMinutes(30)
                  .plusSeconds(15);
    }
}
```

### Comparing Dates and Times

```java
LocalDate date1 = LocalDate.of(2016, 1, 20);
LocalDate date2 = LocalDate.of(2014, Month.JANUARY, 18);

System.out.println(date1.isAfter(date2));    // true
System.out.println(date1.isBefore(date2));   // false
System.out.println(date1.equals(date2));     // false
```

### Formatting Dates

```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd,MMMM,yyyy HH:mm");
LocalDateTime now = LocalDateTime.now();
String formatted = now.format(formatter);

// Parsing a string into a date
LocalDate parseDate = LocalDate.parse("04,April,2019", formatter);
```

### Period and Duration

```java
// Period for working with dates
Period period = Period.ofMonths(3);
LocalDate future = LocalDate.now().plus(period);

// Duration for working with times
Duration duration = Duration.ofHours(3);
LocalTime laterTime = LocalTime.now().plus(duration);
```

### Factory Method Pattern

```java
class Car {
    private Car() {}
    
    public static Car createCar() {
        return new Car();
    }
}

// Usage
Car car = Car.createCar();
```

### Scheduling with Period

```java
static void changeOfDutyOfficer(LocalDate start, LocalDate end, Period p) {
    LocalDate date = start;
    while (date.isBefore(end)) {
        System.out.println("Change officer: " + date);
        date = date.plus(p);
    }
}
```

### Comparison Table: Period vs Duration

| Characteristic    | Period                | Duration                     |
|-------------------|-----------------------|------------------------------|
| Units of Measure  | Years, months, days   | Hours, minutes, seconds, nanoseconds |
| Compatibility     | LocalDate             | LocalTime, LocalDateTime     |
| Precision         | Calendar-based        | Machine-based                |

### Date and Time Formats

| Format           | Example         | Description                     |
|-------------------|-----------------|---------------------------------|
| ISO_LOCAL_DATE    | "2024-04-14"    | Standard date format            |
| SHORT             | "14.04.24"      | Short format                    |
| MEDIUM            | "14 Apr 2024"   | Medium format                   |
| LONG              | "14 April 2024" | Full format                     |

The lesson code is available in the files:

- [DateTimeManipulationDemo.java](./lesson27/DateTimeManipulationDemo.java)
- [DateTimeComparisonDemo.java](./lesson27/DateTimeComparisonDemo.java)
- [PeriodSchedulingDemo.java](./lesson27/PeriodSchedulingDemo.java)
- [DurationPeriodDemo.java](./lesson27/DurationPeriodDemo.java)
- [DateTimeFormattingDemo.java](./lesson27/DateTimeFormattingDemo.java)
- [FactoryMethodDemo.java](./lesson27/FactoryMethodDemo.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>

---

## Lesson 28: Lambda Expressions and the Predicate Interface

This lesson covers:

- Functional interfaces
- Lambda expressions
- The `Predicate` interface
- Various ways to filter data

### Basic Student Filtering

```java
class StudentInfo {
    void printStudentsOverGrade(ArrayList<Student> al, double avg) {
        for (Student st : al) {
            if (st.avgGrade > avg) {
                printStudent(st);
            }
        }
    }
    
    void printStudent(Student st) {
        System.out.println("Name: " + st.name);
        System.out.println("Sex: " + st.sex);
        System.out.println("Age: " + st.age);
        System.out.println("Course: " + st.course);
        System.out.println("Avg Grade: " + st.avgGrade);
    }
}
```

### Using Interfaces for Filtering

```java
interface StudentsChecks {
    boolean check(Student st);
}

class FindStudentsOverGrade implements StudentsChecks {
    @Override
    public boolean check(Student st) {
        return st.avgGrade > 8.5;
    }
}
```

### Lambda Expressions

```java
// Different ways to write lambda expressions
info.checkStudent(students, (Student st) -> {return st.avgGrade > 8.5;});
info.checkStudent(students, st -> st.avgGrade < 9);
info.checkStudent(students, st -> { 
    int z = 27; 
    return st.age < z;
});
```

### Using the Predicate Interface

```java
void checkStudent(ArrayList<Student> students, Predicate<Student> sc) {
    for (Student s : students) {
        if (sc.test(s)) {
            printStudent(s);
        }
    }
}

// Using removeIf with Predicate
students.removeIf(student -> student.name.endsWith("a"));
```

### Parameters in Lambda Expressions

```java
interface StringCalculator {
    int abc(String s1, String s2);
}

static void def(StringCalculator t) {
    System.out.println(t.abc("hello", "bye"));
}

// Usage
def((x, y) -> x.length() + y.length());
```

### Comparison of Filtering Approaches

| Approach          | Advantages         | Disadvantages       |
|--------------------|--------------------|---------------------|
| Separate Methods   | Easy to understand | Code duplication    |
| Interfaces         | Reusability        | Too many classes    |
| Lambda             | Concise            | Harder to debug     |
| Predicate          | Standard interface | Limited to one method |

### Rules for Using Lambda Expressions

1. Only for functional interfaces (one abstract method).
2. Parameters can be specified with or without types.
3. Parentheses are optional for a single parameter.
4. Curly braces and `return` are optional for single expressions.

Lesson code is available in the files:

- [StudentFilterDemo.java](./lesson28/StudentFilterDemo.java)
- [StudentCheckerInterfaceDemo.java](./lesson28/StudentCheckerInterfaceDemo.java)
- [StudentLambdaDemo.java](./lesson28/StudentLambdaDemo.java)
- [PredicateStudentDemo.java](./lesson28/PredicateStudentDemo.java)
- [LambdaParametersDemo.java](./lesson28/LambdaParametersDemo.java)

<div align="right">
  <b><a href="#contents">↥ Back to Contents</a></b>
</div>
