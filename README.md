# java_beginner_lessons

## Урок 1: Вывод в консоль

В этом уроке мы изучаем два основных метода вывода в консоль:

- **`System.out.println()`** — вывод с переводом строки.
- **`System.out.print()`** — вывод без перевода строки.

Код урока находится в файле: [HelloWorld.java](./lesson1/HelloWorld.java).

![Пример работы методов вывода](./images/exampleUsePrintlnAndPrintLesson1.png)
*Рис. 1.1 – Пример вывода*

---

## Урок 2: Примитивные типы данных и литералы

В этом уроке рассматриваются:

- Примитивные типы данных:
  - Целочисленные: `byte`, `short`, `int`, `long`
  - С плавающей точкой: `float`, `double`
  - Символьный: `char`
  - Логический: `boolean`
- Представление чисел в двоичном, восьмеричном и шестнадцатиричном форматах.
- Использование литерала с подчеркиванием (начиная с Java 7).

Код урока доступен в файле: [PrimitiveDataTypes.java](./lesson2/PrimitiveDataTypes.java).

## Урок 3: Арифметические, логические, операции присваивания и сравнения

В этом уроке рассматриваются основные типы операций в Java:

1. **Арифметические:** `+`, `-`, `*`, `/`, `%`
2. **Операции сравнения:** `==`, `!=`, `>`, `<`, `>=`, `<=`
3. **Логические операции:** `&&`, `||`, `!`
4. **Операции присваивания:** `=`, `+=`, `-=`, `*=`, `/=`

Код урока доступен в файле: [ArithmeticAndLogicaAndAssignmentAndRelationalOperations.java](./lesson3/ArithmeticAndLogicaAndAssignmentAndRelationalOperations.java).

---

## Урок 4: Основы ООП — Классы, объекты и ссылочные типы

### Основные концепции

- **Класс** — шаблон/чертеж для создания объектов.
- **Объект** — экземпляр класса в памяти.
- **Ссылочный тип** — тип данных, хранящий ссылку на объект.

### Отличия от примитивных типов

| Характеристика      | Примитивные типы       | Ссылочные типы         |
|---------------------|------------------------|------------------------|
| Хранение            | Значение напрямую      | Ссылка на объект       |
| Размер              | Фиксированный          | Зависит от объекта     |
| Инициализация       | Обязательна            | По умолчанию `null`    |
| Примеры             | `int`, `boolean` и т.д. | `String`, массивы, классы |

### Пример классов

```java
public class Car {
    // Поля класса
    String color = "red";
    String engine = "v6";
}
```

```java
public class BankAccount {
    // Поля класса
    int id;
    String name;
    double balance;
}
```

Код урока доступен в файлах: [Car.java](./lesson4/Car.java), [BankAccount.java](./lesson4/BankAccount.java).

---

## Урок 5: Создание объектов, конструкторы и вызов методов

В этом уроке рассматриваются:

- Процесс создания объектов.
- Концепция конструктора.
- Объявление и вызов методов.

Код урока доступен в файлах: [Car.java](./lesson5/Car.java), [Car2.java](./lesson5/Car2.java), [ConceptAndMethodCall.java](./lesson5/ConceptAndMethodCall.java), [Human.java](./lesson5/Human.java).

---

## Урок 6: Перегрузка методов и конструкторов (Overloading). Ключевое слово `this`

В этом уроке рассматриваются:

- Перегрузка (overloading) методов и конструкторов.
- Использование ключевого слова `this`.

### Перегрузка методов

Перегрузка позволяет объявлять несколько методов с одинаковым именем, но разными параметрами.  

Пример:

```java
public class MathUtils {
    // Метод с одним параметром
    int sum(int a) {
        return a;
    }
    
    // Перегруженный метод с двумя параметрами
    int sum(int a, int b) {
        return a + b;
    }
}
```

### Перегрузка конструкторов

Перегрузка конструкторов позволяет создавать объекты разными способами.

Пример:

```java
public class Car {
    String model;
    int year;

    // Конструктор без параметров
    public Car() {
        this("Unknown", 2000);
    }

    // Конструктор с параметрами
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
```

Код урока доступен в файлах: [MethodOverloading.java](./lesson6/MethodOverloading.java), [MethodOverloading2.java](./lesson6/MethodOverloading2.java), [EmployeeConstructorOverloading.java](./lesson6/EmployeeConstructorOverloading.java).

---

## Урок 7: Понятие `package`. Модификаторы видимости (Access Modifiers)

В этом уроке рассматриваются:

- Понятие `package` и его использование.  
- Модификаторы доступа (`private`, `default`, `protected`, `public`).  

### Пакеты (`package`)

Пакеты используются для организации классов и предотвращения конфликтов имен.  
Пример объявления пакета:  

```java
package lesson7;

public class Example {
    public void showMessage() {
        System.out.println("Hello from package lesson7!");
    }
}
```

Использование класса из другого пакета:

```java
import lesson7.Example;

public class Main {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.showMessage();
    }
}
```

### Модификаторы доступа

Определяют область видимости классов, полей и методов.

| Модификатор      | Видимость внутри класса      | Видимость внутри пакета      | Видимость в подклассах      | Видимость в других пакетах      |
|---------------------|------------------------|------------------------|------------------------|------------------------|
| private      | ✅      | ❌      | ❌      | ❌      |
| (dafault)      | ✅      | ✅      | ❌      | ❌      |
| protected      | ✅      | ✅      | ✅      | ❌      |
| public      | ✅      | ✅      | ✅      | ✅      |

Пример модификаторов доступа

```java
package lesson7;

public class AccessExample {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;
}
```

Использование в другом классе в том же пакете:

```java
package lesson7;

public class TestAccess {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        // example.privateVar; // Ошибка: private-поле недоступно
        System.out.println(example.defaultVar);  // Доступно
        System.out.println(example.protectedVar); // Доступно
        System.out.println(example.publicVar);    // Доступно
    }
}
```

Код урока доступен в файлах: [A.java](./lesson7/A.java), [B.java](./lesson7/B.java), [Employee.java](./lesson7/Employee.java), [OtherClass.java](./lesson7/OtherClass.java), [ThirdClass.java](./lesson7_1/ThirdClass.java).