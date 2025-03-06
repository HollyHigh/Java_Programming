# Java Programming Guide

## Course Outline
1. Identifiers, Data Types, Variables and Constants
2. Operators and Expressions
3. Flow of Control
4. Classes, Objects
5. Defining a Class, Using a Class
6. Getters, Setters and Constructors
7. Static Attributes and Methods
8. Standard Methods in Java
9. Array Initialization and Assignment
10. Strings
11. Introducing Java Packages, Information Hiding
12. Delegation through Association
13. Wrapper Classes
14. Input Output
15. Interfaces
16. Representing a Class in UML
17. Collections and Maps
18. Type Parameters, Bounded Type Parameters
19. Design Patterns
20. Exception Handling, Chaining Exceptions
21. Enumerated Types, Variadic Parameters, Functional Interfaces, Lambda Expressions, Method References, Streams

---

## 1. Identifiers, Data Types, Variables and Constants

### Identifiers
- Names given to classes, variables, and methods.
- Must begin with a letter, dollar sign `$`, or underscore `_`.
- Cannot use Java reserved words.

### Data Types
- Primitive: `int`, `char`, `double`, `boolean`, etc.
- Non-primitive (Reference): `String`, `Arrays`, `Classes`, etc.

### Variables
- Containers for storing data values.
- Example:
```java
int age = 25;
double salary = 50000.75;
char grade = 'A';
boolean isEmployed = true;
```

### Constants
- Immutable variables declared using `final`.
- Example:
```java
final int DAYS_IN_WEEK = 7;
```

---

## 2. Operators and Expressions

### Types of Operators
- Arithmetic Operators: `+`, `-`, `*`, `/`, `%`
- Relational Operators: `==`, `!=`, `>`, `<`, `>=`, `<=`
- Logical Operators: `&&`, `||`, `!`
- Assignment Operators: `=`, `+=`, `-=`, etc.

### Expressions
- Combination of operators and operands.
```java
int result = (10 + 5) * 2;
boolean isEqual = (5 == 3);
```

---

## 3. Flow of Control

### If-Else Statement
```java
int num = 10;
if (num > 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Negative number");
}
```

### Switch Statement
```java
int day = 2;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

### Loops
#### For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

#### While Loop
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### Do-While Loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 4. Classes, Objects

### Class
- Blueprint for objects.
- Define properties (fields) and methods (functions).

### Object
- Instance of a class.
- Example:
```java
class Dog {
    String name;
    int age;
    void bark() {
        System.out.println("Woof!");
    }
}

Dog myDog = new Dog();
myDog.name = "Buddy";
myDog.age = 3;
myDog.bark();  // Output: Woof!
```

---

## 5. Defining a Class, Using a Class

### Defining a Class
```java
public class Person {
    String name;
    int age;
}
```

### Using a Class
```java
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        person.age = 30;
        System.out.println(person.name + " is " + person.age + " years old.");
    }
}
```

---

## 6. Getters, Setters and Constructors

### Getters and Setters
```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

### Constructors
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 7. Static Attributes and Methods

### Static Attributes
```java
public class Person {
    public static int personCount = 0;
    public String name;

    public Person(String name) {
        this.name = name;
        personCount++;
    }
}
```

### Static Methods
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Person count: " + Person.personCount);
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");
        System.out.println("Person count: " + Person.personCount);
    }
}
```

---

## 8. Standard Methods in Java

### toString Method
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
```

### equals Method
```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Person person = (Person) obj;
    return age == person.age && Objects.equals(name, person.name);
}
```

### hashCode Method
```java
@Override
public int hashCode() {
    return Objects.hash(name, age);
}
```

---

## 9. Array Initialization and Assignment

### Initializing Arrays
```java
int[] numbers = new int[5];
int[] primes = {2, 3, 5, 7, 11};
```

### Accessing Array Elements
```java
numbers[0] = 1;
int firstPrime = primes[0];
```

---

## 10. Strings

### String Declaration
```java
String message = "Hello, World!";
System.out.println(message);
```

### Common String Methods
```java
String str = "Hello, World!";
System.out.println(str.length());
System.out.println(str.charAt(0));
System.out.println(str.substring(7));
System.out.println(str.toUpperCase());
```

---

## 11. Introducing Java Packages, Information Hiding

### Packages
- Group related classes and interfaces.
```java
package com.example;

public class Person {
    private String name;
    private int age;
}
```

### Information Hiding
- Use private access to restrict access to class members.

---

## 12. Delegation through Association

### Association Example
```java
class Address {
    String city;
    String state;
}

class Employee {
    String name;
    Address address;

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
```

---

## 13. Wrapper Classes

### Common Wrapper Classes
- Integer, Double, Character, Boolean
```java
int num = 5;
Integer numWrapper = Integer.valueOf(num);
int unwrappedNum = numWrapper.intValue();
```

---

## 14. Input Output

### Reading Console Input
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("You entered: " + num);
    }
}
```

### Writing to a File
```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, File!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## 15. Interfaces

### Defining an Interface
```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}
```

---

## 16. Representing a Class in UML

### UML Class Diagram
```
+-----------------+
|     Person      |
+-----------------+
| - name: String  |
| - age: int      |
+-----------------+
| + getName(): String |
| + setName(name: String) |
| + getAge(): int |
| + setAge(age: int)  |
+-----------------+
```

---

## 17. Collections and Maps

### List Example
```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

### Map Example
```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

---

## 18. Type Parameters, Bounded Type Parameters

### Generic Class
```java
class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
```

### Bounded Type Parameters
```java
class Box<T extends Number> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
```

---

## 19. Design Patterns

### Singleton Pattern
```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

## 20. Exception Handling, Chaining Exceptions

### Try-Catch Block
```java
try {
    int data = 50 / 0;  // This will cause an ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

### Chaining Exceptions
```java
class CustomException extends Exception {
    CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

try {
    // Some code that throws an exception
} catch (IOException e) {
    throw new CustomException("Custom Exception occurred", e);
}
```

---

## 21. Enumerated Types, Variadic Parameters, Functional Interfaces, Lambda Expressions, Method References, Streams

### Enumerated Types
```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

### Variadic Parameters
```java
public void printNumbers(int... numbers) {
    for (int num : numbers) {
        System.out.println(num);
    }
}
```

### Functional Interfaces
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
}
```

### Lambda Expressions
```java
MyFunctionalInterface func = () -> System.out.println("Hello, Lambda!");
func.execute();
```

### Method References
```java
public class MethodReferenceExample {
    public static void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface func = MethodReferenceExample::greet;
        func.execute();
    }
}
```

### Streams
```java
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().forEach(System.out::println);
    }
}
```
