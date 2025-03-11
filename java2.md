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
14. Input/Output
15. Interfaces
16. Representing a Class in UML
17. Collections and Maps
18. Type Parameters, Bounded Type Parameters
19. Design Patterns
20. Exception Handling, Chaining Exceptions
21. Enumerated Types, Variadic Parameters, Functional Interfaces, Lambda Expressions, Method References, Streams

---

## 1. Identifiers, Data Types, Variables and Constants

### **Java Identifiers**
An **identifier** is the name assigned to program elements such as classes, objects, variables, and methods.

#### **Rules for Java Identifiers**
- Must **not** start with a digit.
- Can only contain **letters, digits, and the underscore (`_`) symbol**.
- Can theoretically be of **any length**.
- Are **case-sensitive** (e.g., `Rate`, `rate`, and `RATE` are different identifiers).

#### **Java Identifier Conventions**
- **Variables, methods, and objects**:  
  - Start with a **lowercase letter**.  
  - Use **camelCase** for multiple words (e.g., `topSpeed`, `bankRate`, `timeOfArrival`).
- **Classes**:  
  - Start with an **uppercase letter**.  
  - Follow camel case (e.g., `PrintDemo`, `HelloWorld`).

#### **Restricted Identifiers**
- **Keywords and reserved words**:  
  - Cannot be used as identifiers (e.g., `public`, `class`, `void`, `static`).
- **Predefined identifiers from Java libraries**:  
  - Can be redefined, but doing so is discouraged as it can cause confusion or unintended behavior (e.g., `System`, `String`, `println`).

### Data Types
### **Floating-Point Numbers in Java**
Java provides two floating-point types:

- **`float`** → **Single-precision** (32-bit)
- **`double`** → **Double-precision** (64-bit, more precise and preferred by default)

#### **Key Points**
- By default, floating-point numbers in Java are treated as **double**.
- To explicitly define a **float**, append **`f`** or **`F`** to the number.

#### **Examples**
```java
float a = 2.3F;  // Single-precision (requires 'F' suffix)
double b = 6.7;  // Double-precision (default)
```

### Variables
### **Java Variables**
- Variables **must be declared and initialized** before use.
- The **assignment operator (`=`)** is used to assign or update values.

#### **Syntax for Declaration & Initialization**
```java
<type> <variableName> = <initialValue>;
```

#### **Examples**
```java
int count = 1;
float length = 2.3F;
double height = 6.7;
boolean status = true;
```

### **Variable Assignment**
- The **assignment operator (`=`)** assigns a new value to a variable.
- Values can be:
  - Another variable
  - A direct value (literal)
  - A mathematical expression

#### **Syntax**
```java
<variableName> = <otherVariable> OR <value> OR <expression>;
```

#### **Examples**
```java
int countX = 1, countY = 2;
countX = countY;       // Assign countY's value to countX
countX = countY + 3;   // Assign result of expression to countX
countX += 3;           // Shorthand for countX = countX + 3
```

### **Type Compatibility in Assignments**
- **Type mismatch is not allowed** (e.g., assigning `double` to `int` directly).
- **Implicit conversion** (widening) is allowed where safe.

#### **Examples**
```java
int intVariable = 2.99;  // ❌ Not valid (double to int without casting)
double doubleVariable = 2;  // ✅ Valid (int to double, implicit conversion)
```

### **Type Conversion in Java**  

Java allows **implicit** (widening) and **explicit** (narrowing) type conversions between primitive data types.  

#### **Implicit (Widening) Conversion**  
A value of any type can be **automatically** assigned to a variable of a type **to the right** in the list:  
```
byte → short → int → long → float → double  
char → int  
```
- This is **safe** because there is no loss of precision (except for `float` and `double` due to rounding errors).  

#### **Explicit (Narrowing) Conversion (Casting)**  
A value of a **larger type** cannot be directly assigned to a **smaller type** without an explicit **type cast**.  
```java
int x = 2.99;        // ❌ Not valid (double to int without casting)
int y = (int) 2.99;  // ✅ Valid (explicit cast), y will be 2 (truncation, not rounding)
```
- **Casting truncates decimals** (does **not** round).  

#### **Boolean Type Restrictions**  
- `boolean` **cannot** be converted to or from any numeric type.  
```java
int num = true;   // ❌ Not valid
boolean flag = 1; // ❌ Not valid
```

### **Java Variable Categories**  

Java variables are classified into three main types:  

1️⃣ **Instance Variables**  
   - Defined **inside a class but outside any method**.  
   - Each **object (instance) has its own copy** of these variables.  
   - **No `static` keyword** is used.  
   - **Default values** are assigned if not initialized.  

   **Example:**  
   ```java
   class Car {
       int speed;  // Instance variable
   }
   ```

2️⃣ **Static (Class) Variables**  
   - Defined **inside a class but outside any method**, with the `static` keyword.  
   - **Shared among all instances** of the class.  
   - Belong to the **class, not individual objects**.  
   - **Default values** are assigned if not initialized.  

   **Example:**  
   ```java
   class Car {
       static int totalCars;  // Static variable (shared across all objects)
   }
   ```

3️⃣ **Local Variables**  
   - **Declared inside a method** and **only exist within that method**.  
   - **Must be initialized before use** (no default values).  
   - Cannot be accessed outside the method.  

   **Example:**  
   ```java
   class Car {
       void drive() {
           int distance = 10;  // Local variable
       }
   }
   ```

### Constants
A **constant** is a value that **does not change** during program execution. In Java, constants are declared using the `final` keyword.  

#### **Key Characteristics:**  
✅ **Immutable**: Once assigned, a constant **cannot** be modified.  
✅ **Declared using `final`**: The `final` keyword ensures the value remains **unchanged**.  
✅ **Explicit Data Type**: Unlike C, Java **requires** an explicit data type.  
✅ **Naming Convention**: Constants are written in **UPPERCASE** with words separated by underscores.  

### **Declaring Constants**  

```java
final int MAX_LENGTH = 420;       // Integer constant  
final char CHAR_CONSTANT = 'Z';   // Character constant  
final boolean BOOL_CONSTANT = true; // Boolean constant  
final String STRING_CONSTANT = "Welcome to Java"; // String constant  
```

### **Why Use Constants?**  
🔹 Improves **code readability** (e.g., `MAX_SPEED` vs. `100`).  
🔹 Prevents **accidental modification** of values.  
🔹 Makes it **easier to update** values in large programs.  

## 2. Operators and Expressions

## Arithmetic Operators

| Operator | Meaning                  |
|----------|--------------------------|
| `+`      | Addition and unary plus  |
| `-`      | Subtraction or unary minus |
| `*`      | Multiplication            |
| `/`      | Division                  |
| `%`      | Modulo division           |

**Note:** When one of the operands is real and the other is an integer, the expression is called a mixed-mode arithmetic expression. If either operand is of real type, then the other operand is also converted to real, and real arithmetic is performed.

### Arithmetic Operators - Example

```java
// ArithmeticExample.java - Using arithmetic operators
public class ArithmeticExample {
    public static void main(String args[]) {
        float a = 20.5F, b = 6.4F;
        int c = 11, d = 5;
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("c % d = " + (c % d));
    }
}
```

**Program Output:**
```
a + b = 26.9
a - b = 14.1
a * b = 131.2
a / b = 3.203125
c % d = 1
```

---

## Relational Operators

| Operator | Meaning                  |
|----------|--------------------------|
| `<`      | Is less than             |
| `<=`     | Is less than or equal to |
| `>`      | Is greater than          |
| `>=`     | Is greater than or equal to |
| `==`     | Is equal to              |
| `!=`     | Is not equal to          |

**Note:** The result of a relational operator is of type `boolean`.

### Relational Operators - Example

```java
// RelationalExample.java - Using relational operators
public class RelationalExample {
    public static void main(String args[]) {
        int a = 3, b = 5;
        
        System.out.println("a < b = " + (a < b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
    }
}
```

**Program Output:**
```
a < b = true
a > b = false
a <= b = true
a >= b = false
a == b = false
a != b = true
```

---

## Logical Operators

| Operator | Meaning        |
|----------|---------------|
| `&&`     | Logical AND   |
| `\|\|`     | Logical OR    |
| `!`      | Logical NOT   |

---

## Bitwise Operators

| Operator | Meaning                 |
|----------|-------------------------|
| `&`      | Bitwise AND             |
| `\|`      | Bitwise OR              |
| `^`      | Bitwise exclusive OR    |
| `~`      | One’s complement        |
| `<<`     | Shift left              |
| `>>`     | Shift right             |
| `>>>`    | Shift right with zero fill |

---

## Other Operators

### Increment and Decrement Operators
```java
++x; x++;
--x; x--;
```

### Conditional Operator
```java
x = (a > b) ? a : b;
```
**Equivalent to:**
```java
if (a > b)
    x = a;
else
    x = b;
```

---

## Mathematical Functions

Java supports mathematical functions such as `cos`, `sin`, and `log` using the `Math` class, defined in the `java.lang` package.

**Usage Example:**
```java
double y, z;
y = Math.sqrt(x);
z = Math.cos(y);
```

**Note:** Refer to Java documentation for a complete list of methods supported.

### Mathematical Functions - Example

```java
// MathSqrtExample.java - Compute the square root of a number
class MathSqrtExample {
    public static void main(String args[]) {
        double x = 4;
        double y;
        
        y = Math.sqrt(x);
        System.out.println("The square root of " + x + " is " + y);
    }
}
```

**Program Output:**
```
The square root of 4.0 is 2.0
```

## 3. Flow of Control
### Branching
Branching in Java allows the program to choose different paths of execution depending on certain conditions. The main branching statements are:

- **if-else statement**: Executes one block of code if a condition is true and another block if it's false.
- **multi-way if-else statement**: Allows multiple conditions to be checked sequentially, with an `else if` clause for each alternative condition.
- **switch statement**: Evaluates a variable and compares it against a series of constant values, executing the code corresponding to the first match.

### Loops
Loops allow you to repeat a block of code multiple times. Java supports several looping constructs:

- **while loop**: Repeats a block of code as long as the condition is true.
- **do-while loop**: Executes the block of code once and then repeats it as long as the condition is true.
- **for loop**: Used when the number of iterations is known beforehand. It includes initialization, condition checking, and increment/decrement all in one line.

#### Example: The `for` loop
```java
public class ForExample {
    public static void main(String[] args) {
        for (int n = 0; n < 5; n++) {
            System.out.println("n = " + n);
        }
    }
}
```
**Output:**
```
n = 0
n = 1
n = 2
n = 3
n = 4
```

### `break` Statement
The `break` statement is used to exit a loop prematurely. This can be useful when you no longer need to continue looping, or you want to exit multiple nested loops at once using a labeled `break`.

#### Example: Using `break` to exit a loop
```java
public class BreakExample {
    public static void main(String[] args) {
        loop1: for (int i = 0; i < 3; i++) {
            loop2: for (int j = 0; j < 3; j++) {
                System.out.println("i=" + i + " j=" + j);
                if (j == 1)
                    break loop1;  // Breaks out of the outer loop
            }
        }
    }
}
```
**Output:**
```
i=0 j=0
i=0 j=1
```

### `continue` Statement
The `continue` statement skips the current iteration of the loop and moves to the next one. It doesn't exit the loop but instead moves directly to the next iteration of the loop.

#### Example: Using `continue`
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;  // Skips the rest of the loop when i equals 2
            }
            System.out.println("i = " + i);
        }
    }
}
```
**Output:**
```
i = 0
i = 1
i = 3
i = 4
```

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
### Basic Concepts in Programming:
1. **Calculation**: 
   - **Constants**: Fixed values that don’t change during program execution.
   - **Variables**: Storage locations that can hold data and may change over time.
   - **Operators**: Symbols used to perform operations on variables and constants (e.g., `+`, `-`, `*`, `/`).
   - **Expressions**: Combinations of variables, constants, and operators that produce a value.

2. **Selection**:
   - **if-else**: Used to execute one block of code if a condition is true and another block if it is false.
   - **switch**: A multi-way branching statement that tests a variable against different possible values.
   - **Ternary operator (`? :`)**: A shorthand for an `if-else` statement. It’s typically written as `condition ? value_if_true : value_if_false`.

3. **Iteration**:
   - **while**: Repeats a block of code while a given condition is true.
   - **do-while**: Similar to `while`, but guarantees at least one iteration since the condition is checked after the loop body.
   - **for**: Typically used when the number of iterations is known beforehand, with initialization, condition, and increment/decrement all in one line.

4. **Abstraction**:
   - Abstraction is the process of hiding the complex implementation details and exposing only the essential features of an entity.
   - It allows you to create **general solutions** that can be reused in different contexts, making the program more flexible and easier to manage.

### Abstraction in Different Programming Paradigms:
- **Procedural Programming (e.g., C)**: 
  - Abstraction is achieved using **functions** or **procedures**. A function encapsulates logic that can be reused, reducing code duplication and enhancing maintainability.
  - A function can take **parameters** to make it more general and flexible.

- **Object-Oriented Programming (OOP) (e.g., Java, C++)**: 
  - Abstraction is achieved through **Abstract Data Types (ADTs)**, which combine both **data** and **functions** that operate on that data into a **class**.
  - A **class** defines a blueprint for creating objects. It can contain:
    - **Attributes (or fields)**: Represent the state or properties of an object.
    - **Methods (or functions)**: Define behaviors or operations that an object can perform.

### Key Concepts in OOP: **Classes** and **Objects**
- **Class**:
  - A class is a **template** or **blueprint** for creating objects that share common properties and behaviors.
  - It can represent a real-world entity (e.g., `Student`, `Car`) or abstract concepts (e.g., `List`, `String`).
  - It contains **attributes** (fields) and **methods** (functions).
  - **Example**: A `Car` class might have attributes like `make`, `model`, and `year`, and methods like `start()` and `stop()`.

- **Object**:
  - An object is an **instance** of a class. It represents a specific realization of a class and contains actual data.
  - Each object has its own **state**, which can vary from one instance to another.
  - The term **instance** refers to an object created from a class.

### Example in Java:
```java
// Defining a class
public class Car {
    // Attributes
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method
    public void start() {
        System.out.println("The car is starting...");
    }

    public void stop() {
        System.out.println("The car is stopping...");
    }
}

// Creating objects (instances) of the class
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020); // Object 1
        Car car2 = new Car("Honda", "Civic", 2021);   // Object 2

        car1.start();  // Calling method on object 1
        car2.stop();   // Calling method on object 2
    }
}
```

**Explanation**:
- `Car` is a class with attributes `make`, `model`, and `year`, and methods `start()` and `stop()`.
- `car1` and `car2` are objects (instances) of the `Car` class. Each object has its own values for the attributes and can call the methods.

This abstraction makes it easier to work with complex systems by focusing on high-level interactions (via methods) rather than the detailed implementation. By creating classes that encapsulate data and operations, the code becomes more modular, reusable, and easier to maintain.

## 6. Getters, Setters and Constructors

### Getters and Setters
**Getters** and **setters** are essential in Java for controlling the access and modification of an object's instance variables. These methods ensure that your class maintains **encapsulation** by providing a controlled interface to its internal state.

### **Accessor (Getter)** and **Mutator (Setter)** Methods

1. **Getter (Accessor)**: 
   - Retrieves or returns the value of a private field.
   - Conventionally starts with `get` followed by the field name, capitalized.
   
2. **Setter (Mutator)**: 
   - Sets or updates the value of a private field.
   - Conventionally starts with `set` followed by the field name, capitalized.

### Example

If you have a class `Circle` with a `radius` field, you can create getter and setter methods as follows:

```java
public class Circle {
    // Private field
    private double radius;

    // Getter (Accessor) method for radius
    public double getRadius() {
        return radius;
    }

    // Setter (Mutator) method for radius
    public void setRadius(double radius) {
        if (radius > 0) { // Optional validation
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }
}
```

### How to Use Getter and Setter

To access or modify the `radius` of a `Circle` object, you'd use the getter and setter methods:

```java
public class Main {
    public static void main(String[] args) {
        // Instantiate Circle object
        Circle aCircle = new Circle();

        // Set radius using the setter method
        aCircle.setRadius(5.0);

        // Get radius using the getter method
        double currentRadius = aCircle.getRadius();

        // Output the current radius
        System.out.println("Radius of the circle: " + currentRadius);
    }
}
```

### IDE Support for Getters and Setters

- **IDEs like IntelliJ IDEA** and **Eclipse** provide **automatic generation** of getter and setter methods. This feature saves a lot of time and ensures that the method signatures follow the correct conventions.
  
  **For example in IntelliJ IDEA**:
  - Right-click in your class where you want the methods.
  - Select **Generate** → **Getter and Setter**.
  - Choose the fields for which you want to generate the methods.

### Why Use Getters and Setters?

1. **Encapsulation**: By using getters and setters, you can keep your class's fields private and expose them through public methods. This prevents direct access to the fields and allows for more control over their values.

2. **Validation and Logic**: You can add logic inside setter methods to validate or process data before setting a field, ensuring the object's state remains consistent.

3. **Maintainability**: If you later decide to change how data is represented or handled internally, you can modify the getter/setter without affecting the rest of the code that uses the class.

### Summary

- **Getters and setters** are used to access and modify instance variables.
- They provide **controlled access** to the fields of an object, ensuring **encapsulation** and **data integrity**.
- **IDEs** like IntelliJ IDEA and Eclipse help generate these methods quickly and correctly.

### Constructors
### **Constructors in Java**

A **constructor** is a special method used to **initialize objects** when they are created. Constructors have the following characteristics:

### Key Characteristics:
1. **Same Name as the Class**: The constructor name must match the class name.
2. **No Return Type**: Constructors do not have a return type.
3. **Object Initialization**: They are used to set the initial values of an object’s attributes.
4. **Overloading**: A class can have multiple constructors with different parameters (constructor overloading).

### Syntax:
```java
public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with parameters
    public Circle(double radius) {
        this.radius = radius;
    }
}
```

### Creating Objects:
- **Using the default constructor**:
```java
Circle aCircle = new Circle();
```
- **Using the parameterized constructor**:
```java
Circle bCircle = new Circle(5.0);
```

### Constructor Overloading:
A class can have multiple constructors, each with different parameters. This allows flexibility when creating objects.

```java
public Circle(double radius) {
    this(radius, 0.0); // Calls another constructor
}
```

### Constructor Chaining:
A constructor can call another constructor in the same class using `this()`.

```java
public Circle() {
    this(1.0); // Calls the constructor with one parameter
}
```

### **When Are Constructors Called?**
Constructors are automatically invoked when you create an object using the `new` keyword:

```java
Circle myCircle = new Circle(); // Constructor is called
```

### **Method Overloading in Java**

**Method overloading** occurs when multiple methods in a class have the **same name** but differ in their **method signature**, which can be based on:

- **Number of arguments**
- **Type of arguments**
- **Order of arguments**

### Key Points:
- **Polymorphism**: Overloading is a form of polymorphism, allowing methods to behave differently depending on the arguments passed.
- **Overloaded Methods**: Methods can have the same name but different signatures (argument types and/or counts).

### Example:

```java
class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}
```

### Explanation:
- **Method Overloading**: The `add()` method is overloaded with different argument types and numbers.
- **Polymorphism**: When you call `add()`, Java will select the appropriate method based on the number and type of arguments.

### Example Usage:
```java
MathOperations math = new MathOperations();
System.out.println(math.add(2, 3)); // Uses add(int, int)
System.out.println(math.add(2, 3, 4)); // Uses add(int, int, int)
System.out.println(math.add(2.5, 3.5)); // Uses add(double, double)
```

### **Method Overloading & Polymorphism**:
- **Polymorphism** allows Java to decide which method to call based on the arguments passed, making the code flexible and reusable.

## 7. Static Attributes and Methods

### **Static Variables and Methods in Java**

**Static Variables**:
- **Shared Among All Objects**: A static variable is **shared by all instances** of a class, meaning there is only one copy of it, regardless of how many objects are created.
- **Class-Level Data**: They belong to the **class** rather than any particular object.
- **Usage Example**: Tracking the number of objects created from a class.

#### Example of Static Variable:
```java
class Circle {
    public double centreX;
    public double centreY;
    public double radius;

    // Static variable to count the number of Circle objects created
    public static int numCircles = 0;

    public Circle(double centreX, double centreY, double radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
        numCircles++;  // Increment the static variable each time a Circle object is created
    }
}
```

#### Accessing Static Variables:
```java
Circle c1 = new Circle(0, 0, 5);
Circle c2 = new Circle(1, 1, 3);

System.out.println(Circle.numCircles);  // Output: 2 (number of Circle objects created)
```

### **Static Methods**:
- **Can Only Access Static Variables**: Static methods can **only access other static methods and static variables** within the class.
- **No `this` or `super`**: Static methods cannot use **`this`** or **`super`** because they are tied to **specific object instances**, while static methods belong to the class itself.
  
#### Example of Static Method:
```java
class Circle {
    public double centreX;
    public double centreY;
    public double radius;

    public static int numCircles = 0;

    public Circle(double centreX, double centreY, double radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
        numCircles++;
    }

    // Static method to return the number of created Circle objects
    public static int getNumCircles() {
        return numCircles;
    }
}
```

#### Accessing Static Methods:
```java
Circle c1 = new Circle(0, 0, 5);
Circle c2 = new Circle(1, 1, 3);

System.out.println(Circle.getNumCircles());  // Output: 2 (number of Circle objects created)
```

### **Important Notes**:
- **Instance Variables**: Each object gets its own copy (e.g., `centreX`, `centreY`, `radius` for each Circle).
- **Static Variables**: Only one copy for the entire class (e.g., `numCircles` for all Circle objects).
- **Static Methods**: They can only interact with static data (class-level data) and should not interact with instance-specific data.

### **Avoid Overuse of Static Members**:
- **Good OO Practices**: Avoid making everything static in your classes. Doing so could lead to procedural programming instead of using Object-Oriented principles.

## 8. Standard Methods in Java
### **Standard Methods in Java**

In Java, there are a few standard methods commonly used to manage objects. These include `equals`, `toString`, and the **copy constructor**. Let’s take a look at each.

---

### **1. `equals` Method**
- **Purpose**: The `equals` method is used to compare two objects for equality.
- **Note**: Using the `==` operator compares **object references** (whether both refer to the same memory address), whereas `equals` compares the **contents** of the objects.
  
#### Basic `equals` Method:
```java
public boolean equals(Circle other) {
    return this.centreX == other.centreX && 
           this.centreY == other.centreY && 
           this.radius == other.radius;
}
```
- **Explanation**: Here, we compare the attributes of two `Circle` objects (`this` and `other`). The method returns `true` if the attributes are equal.

---

### **2. `toString` Method**
- **Purpose**: This method provides a **string representation** of an object, which is useful when you want to print out the details of an object.
- **Automatic Call**: The `toString` method is **automatically called** when an object is printed using `System.out.println()`.
  
#### Example of `toString` Method:
```java
public String toString() {
    return "Circle: [Centre: (" + centreX + ", " + centreY + "), Radius: " + radius + "]";
}
```
- **Explanation**: This `toString` method returns a string describing the `Circle` object’s state. When `System.out.println(c_1)` is called, it will display the circle’s details.

---

### **3. Copy Constructor**
- **Purpose**: The copy constructor creates a **new object** as a **copy** of an existing object. This can be used for creating a **deep copy**, ensuring that the copied object is a new instance and not just a reference to the original.
- **Usage**: It’s useful when you want to clone an object and ensure that references to other objects (within the original object) are also copied.

#### Example of Copy Constructor:
```java
public Circle(Circle other) {
    this.centreX = other.centreX;
    this.centreY = other.centreY;
    this.radius = other.radius;
}
```
- **Explanation**: The copy constructor takes another `Circle` object as a parameter and copies its values to create a new `Circle` instance. 

#### Deep Copy (for objects with references):
If any instance variables are references to other objects, ensure a **deep copy** by calling the copy constructor on those referenced objects:

```java
public Circle(Circle other) {
    this.centreX = other.centreX;
    this.centreY = other.centreY;
    this.radius = other.radius;
    // Assuming there's a reference to another object
    this.anotherObject = new SomeClass(other.anotherObject);  // Deep copy
}
```
- **Explanation**: For non-primitive types (like `anotherObject`), you ensure that the referenced object is also copied, rather than just copying the reference.

---

### **Summary:**
- **`equals`**: Used to compare two objects based on their attributes.
- **`toString`**: Provides a string representation of an object, often used for easy printing.
- **Copy Constructor**: Creates a new object by copying the attributes of another, ensuring that both objects are independent (deep copy if necessary).

## 9. Array Initialization and Assignment
### **Array Declaration and Initialization**

- **Array Declaration**:
  - `basetype[] varName;` or `basetype varName[];`
  - This declares an array where each element is of type `basetype`.

#### Example:
```java
int[] intArray; // Declares an array of integers
```

- **Array Initialization**:
  - `int[] intArray_1 = {0, 1, 2, 3, 4};`
  - This initializes an array with values `{0, 1, 2, 3, 4}`.
  - The number of elements is 5, and the values are the ones specified.

#### Example:
```java
int[] intArray_1 = {0, 1, 2, 3, 4};  // 5 elements: 0, 1, 2, 3, 4
```

- **Array with a predefined size**:
  - `int[] intArray_2 = new int[100];`
  - This creates an array of 100 elements, all initialized to `0` (default value for integers).
  
#### Example:
```java
int[] intArray_2 = new int[100]; // 100 elements, all initialized to 0
```

- **Array Assignment**:
  - You can assign one array to another. The second array will point to the same object as the first.
  
#### Example:
```java
int[] intArray_1 = new int[n];
int[] intArray_2 = intArray_1;  // intArray_2 now points to the same array as intArray_1
```

---

### **Arrays for Objects**
- Arrays can store objects. For example, an array of `Circle` objects can be declared and allocated as follows:

#### Example:
```java
Circle[] circleArray;         // Declaration of an array of Circle objects
circleArray = new Circle[25]; // Allocation of storage for 25 Circle objects
```
- **Note**: The array can store **references** to `Circle` objects, but the objects themselves aren't created yet. You need to instantiate them individually.

#### Example of creating and storing objects:
```java
for (int i = 0; i < 25; i++) {
    circleArray[i] = new Circle(); // Creating and storing individual Circle objects
}
```

## 10. Strings

### **Strings in Java**

- **String Definition**:
  - `String` is a class in Java used to represent sequences of characters. It’s commonly used for messages, errors, and attributes like names.

#### Example:
```java
String greeting = "Hello, World!";
```

- **Escaping Special Characters**:
  - Special characters such as double quotes `"` or backslashes `\` are "escaped" using the backslash (`\`) character.

#### Example:
```java
System.out.println("Game of Thrones season 8 was \"good\".");
```

- **String Operations** ### **String Operations**:
  - You can concatenate strings using the `+` operator.

#### Example:
```java
String name = "Alice";
System.out.println("Hello " + name);  // Outputs: Hello Alice
```

- **Immutability of Strings**:
  - Strings are immutable in Java, meaning once created, their value cannot be changed. Every string operation creates a new string.

#### Example:
```java
String str = "Hello";
str = str + " World";  // A new string "Hello World" is created
```
---

### **Summary**:
- **Array Declaration**: Arrays are declared with the type followed by `[]`. They can be initialized either with specific values or a size.
- **Objects in Arrays**: Arrays can store references to objects (e.g., `Circle[]`), but objects must be created and stored in the array.
- **Strings**: Strings are sequences of characters in Java, and you can perform operations like concatenation using `+`. They are immutable, meaning any operation on a string creates a new one.

## 11. Introducing Java Packages, Information Hiding

### **Packages in Java**

#### **What is a Package?**
- **Package**: A mechanism for grouping classes and interfaces into bundles, making it easier to manage and organize code.
- It allows classes to be grouped based on their functionality and can be imported into other programs.
  
#### **Benefits of Using Packages:**
1. **Code Reusability**: You can reuse pre-built classes from packages rather than re-writing code.
2. **Preventing Naming Conflicts**: Classes with the same name can exist in different packages without conflict. By specifying the package, you uniquely identify the class.
3. **Organization**: Grouping related classes together, making code more manageable and understandable.

#### **Creating a Package**:
- To place a class in a specific package, you must include the `package` statement at the top of the Java file.

#### **Syntax**:
```java
package <directory_name_1>.<directory_name_2>;
```
- This defines the package structure where `directory_name_2` is a sub-directory of `directory_name_1`.

#### **Example**:
```java
package com.example.utils;

public class MyClass {
    // Class content here
}
```
- In this case, the class `MyClass` is placed in the package `com.example.utils`.

#### **Why Use Packages?**
- **Modularity**: Keep related classes together.
- **Access Control**: Packages help with organizing classes and controlling access.
- **Namespace Management**: Avoid naming conflicts by distinguishing classes with the package name.

### **Information Hiding**

**Information Hiding** (also known as **Visibility Control**) is a key principle in object-oriented design that limits the access to the internal workings of an object. This principle is closely tied to **Encapsulation**, which involves grouping related attributes and methods together in a class.

### **What is Information Hiding?**
- Information Hiding allows restricting access to some parts of a class (such as its attributes and methods) to ensure that only the necessary details are exposed to the user.
- Users interact with objects via **public interfaces** (methods), but they cannot directly manipulate the internal state or attributes of the object.

### **Visibility Modifiers in Java**
Visibility modifiers control the visibility of class members (attributes and methods) and determine where they can be accessed from. The common visibility modifiers are:

| Modifier    | Class | Package | Subclass | Outside |
|-------------|-------|---------|----------|---------|
| **public**  | Y     | Y       | Y        | Y       |
| **protected**| Y    | Y       | Y        | N       |
| **default** | Y     | Y       | N        | N       |
| **private** | Y     | N       | N        | N       |

### **Explanation of Modifiers:**
1. **public**: 
   - Accessible from anywhere: within the class, package, subclass, and from outside the package.
   
2. **protected**: 
   - Accessible within the class, package, and subclass (even outside the package if subclassed). Not accessible from outside if it's not subclassed.
   
3. **default** (no modifier):
   - Accessible only within the same package. Not accessible outside the package or in subclasses from other packages.
   
4. **private**: 
   - Accessible only within the class. It cannot be accessed from outside the class, even by subclasses.

### **Benefits of Information Hiding:**
- **Security**: Prevents unauthorized access or modification of critical data.
- **Maintainability**: Reduces complexity by hiding implementation details, allowing changes without affecting external code.
- **Modularity**: Enables better organization by restricting access to internal workings and providing a clear interface for interaction.

## 12. Delegation through Association

**Delegation** is a design pattern in object-oriented programming where a class hands off (or delegates) certain responsibilities or tasks to another class. Instead of performing a task itself, the class relies on another object to carry out the task.

### **Example of Delegation**:
```java
// Class A delegates the responsibility to Class B
class A {
    private B b;  // Object of class B is contained in A

    public A() {
        b = new B(); // Create the object of B
    }

    // Delegating the responsibility of action to class B
    public void performAction() {
        b.executeTask();  // Delegation of task to B's method
    }
}

class B {
    // This is the method that Class A delegates to
    public void executeTask() {
        System.out.println("Task executed by B");
    }
}
```

### **Benefits of Delegation**:
- **Composition over inheritance**: Delegation allows creating flexible systems without relying on complex inheritance structures.
- **Loose coupling**: Classes are not tightly coupled to one another, making the system easier to maintain and extend.
- **Reuse of code**: By delegating tasks to existing classes, you can reuse functionality without duplicating code.

### **Conclusion**:
Delegation is a powerful pattern that promotes flexibility, code reuse, and modularity. It allows objects to collaborate without becoming tightly dependent on one another.

## 13. Wrapper Classes
### **Wrapper Classes in Java**

Java provides **wrapper classes** for each of the primitive data types. These classes allow primitive data types to be treated as objects. They "wrap" the primitive value inside an object, giving it the ability to behave like an object and offering additional functionality.

### **Why Wrapper Classes Are Useful:**
1. **Object Behavior**: Primitives are not objects, so they cannot be used in certain situations where objects are required (e.g., working with collections like `ArrayList`, which can only store objects). Wrapper classes allow primitives to be used in such scenarios.
2. **Extra Functionality**: Wrapper classes provide useful methods for converting, comparing, or manipulating primitive data types as objects.
3. **Autoboxing and Unboxing**: Java automatically converts between primitives and their corresponding wrapper objects (autoboxing and unboxing), making it easier to work with collections and other APIs that require objects.

### **Primitive Types and Their Wrapper Classes**:

| Primitive Type | Wrapper Class |
|----------------|---------------|
| `boolean`      | `Boolean`     |
| `byte`         | `Byte`        |
| `char`         | `Character`   |
| `int`          | `Integer`     |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `long`         | `Long`        |
| `short`        | `Short`       |

### **Example**: Using Wrapper Classes
```java
// Using wrapper class Integer
Integer num = new Integer(10);

// Autoboxing: primitive int to Integer object
Integer num2 = 5;

// Unboxing: Integer object to primitive int
int value = num2;  // Automatically converts to int

// Using methods of wrapper class
int max = Integer.MAX_VALUE;
System.out.println("Maximum int value: " + max);
```

### **Key Methods Provided by Wrapper Classes**:
- **Parsing**: Convert string representations to primitive types.
  - `Integer.parseInt("123");`
  - `Double.parseDouble("3.14");`
- **Converting to Strings**: Convert primitive types or wrapper objects to strings.
  - `Integer.toString(123);`
  - `String.valueOf(true);`
- **Constants**: Many wrapper classes provide constants for maximum and minimum values, such as `Integer.MAX_VALUE` or `Double.MIN_VALUE`.

### **Autoboxing and Unboxing Example**:
```java
// Autoboxing: automatic conversion from primitive to object
Integer myInteger = 10;

// Unboxing: automatic conversion from object to primitive
int myInt = myInteger; // Integer to int
```

## 14. Input/Output

### **Console Input**
Reading input from the console involves using classes from the `java.util` package, such as `Scanner`.

#### Example:
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

### **File Writing**
Writing to a file involves using classes from the `java.io` package, such as `FileWriter` and `BufferedWriter`.

#### Example:
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
## 15. Inheritance

Inheritance allows one class (the **subclass** or **child class**) to inherit attributes and behaviors (methods) from another class (the **superclass** or **parent class**). It provides a way to avoid redundancy by reusing code and establishing a relationship between classes. 

Let's break down the key concepts in your example of chess pieces:

### **Parent Class (Superclass) - `Piece`**
The `Piece` class can be used to define common attributes and methods for all chess pieces. Attributes like `isAlive`, `isWhite`, `currentRow`, and `currentColumn` are common to all chess pieces, so they are placed in the `Piece` class.

### **Subclass (Child Classes) - `Pawn`, `Rook`, `Knight`, `Bishop`, `King`, `Queen`**
Each individual chess piece is a subclass of the `Piece` class, inheriting common properties and methods but also adding specific behaviors of its own.

### **Constructor Inheritance**
A constructor is used to initialize an object when it's created. Inheritance works with constructors as well, and the `super` keyword is used to invoke the parent class's constructor from the subclass.

- **The `super` Keyword**: 
  - Used to invoke a constructor from the parent class.
  - The `super` constructor must be the first statement in the subclass constructor (if used).
  - The parameter types to the `super` constructor call must match the constructor in the parent class.

For example, if the parent class `Piece` has a constructor that accepts `currentRow` and `currentColumn`, the subclass constructor will call `super(currentRow, currentColumn)` to initialize these values.

### **Method Inheritance and Overriding**
- **Method Inheritance**: A method defined in the parent class is inherited by the child class.
  - Example: A `move()` method can be common for all pieces, as the general logic of moving could be shared across all pieces. This method is inherited by all subclasses.
  
- **Method Overriding**: Sometimes, the method behavior needs to be different in the subclass. This is where method overriding comes into play.
  - Example: The method `isValidMove()` might be the same in the parent class but will be overridden in the child classes to define specific movement rules for each piece. A `Rook` moves in straight lines, while a `Knight` moves in an "L" shape. So, the `isValidMove()` method will be overridden in each subclass to implement its own movement rules.

#### **Method Overriding Example**
```java
class Piece {
    int currentRow, currentColumn;

    // Constructor
    public Piece(int currentRow, int currentColumn) {
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
    }

    // Common method inherited by all pieces
    public void move(int newRow, int newColumn) {
        // Move logic common for all pieces
        this.currentRow = newRow;
        this.currentColumn = newColumn;
    }

    // Method that will be overridden
    public boolean isValidMove(int newRow, int newColumn) {
        // General move validation (checking if the new position is within the board)
        return newRow >= 0 && newRow < 8 && newColumn >= 0 && newColumn < 8;
    }
}

class Rook extends Piece {
    public Rook(int currentRow, int currentColumn) {
        super(currentRow, currentColumn); // Calling the parent constructor
    }

    // Overriding the isValidMove method for Rook's specific movement
    @Override
    public boolean isValidMove(int newRow, int newColumn) {
        // Rook can move in straight lines horizontally or vertically
        return newRow == currentRow || newColumn == currentColumn;
    }
}

class Knight extends Piece {
    public Knight(int currentRow, int currentColumn) {
        super(currentRow, currentColumn); // Calling the parent constructor
    }

    // Overriding the isValidMove method for Knight's specific movement
    @Override
    public boolean isValidMove(int newRow, int newColumn) {
        // Knight moves in an "L" shape
        int rowDiff = Math.abs(newRow - currentRow);
        int colDiff = Math.abs(newColumn - currentColumn);
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
```

### **Why Override Methods?**

- **Customization**: Subclasses can customize or extend the functionality of a parent class method to suit their own behavior.
- **Polymorphism**: Method overriding allows a subclass to have its own specific implementation of a method, even if it shares the same name and signature as a method in the parent class. This enables polymorphism, which is the ability to call a method on an object, regardless of the actual object type, and have it execute the correct version of the method (the one in the subclass).

### **Benefits of Method Overriding**

1. **Specialized Behavior**: Subclasses can implement specialized logic while retaining the general behavior defined in the parent class.
2. **Code Reusability**: Common logic (like move logic) can be inherited, while specific details (like movement rules) are handled by the subclass.
3. **Polymorphism**: A reference to the parent class can hold an object of any subclass, and the appropriate overridden method will be invoked based on the actual object type.

### **Using `@Override` Annotation**
The `@Override` annotation is optional but highly recommended as it helps to ensure that a method is indeed overriding a method from the parent class. It also provides a compile-time check to avoid errors when the method signature does not match the parent class method.

```java
@Override
public boolean isValidMove(int newRow, int newColumn) {
    // Rook specific move logic
}
```

### **Conclusion**

- **Inheritance** allows code reuse, where common behaviors (like attributes and methods) are placed in a parent class, and specific behaviors are defined in the subclasses.
- **Constructors** in subclasses can invoke the parent class constructor using the `super` keyword.
- **Method Overriding** allows subclasses to modify or extend the behavior of inherited methods to suit their specific needs.

## 16. Interfaces
### **Interfaces in Java**

Interfaces are used in Java to define a contract of behavior that classes can agree to implement. They define methods that a class must provide, but they do not provide the implementation details. This allows for a more flexible and modular design.

#### **Key Concepts of Interfaces**

- **Abstract Methods**: Methods in an interface are abstract by default, meaning they do not have a body. The implementing class must provide the method's implementation.
- **Attributes**: All attributes in an interface are implicitly `public`, `static`, and `final` (i.e., constants).
- **Access Modifiers**: All methods in an interface are implicitly `public`. You cannot specify other access levels for methods or attributes in an interface.

#### **Syntax of an Interface**
```java
public interface Printable {
    // Constant attribute
    int MAXIMUM_PIXEL_DENSITY = 1000;

    // Abstract method
    void print();
}
```

Here, the `Printable` interface defines a constant `MAXIMUM_PIXEL_DENSITY` and an abstract method `print()`. Any class that implements the `Printable` interface must implement the `print()` method.

#### **Implementing Interfaces**
To implement an interface, a class must use the `implements` keyword and provide implementations for all methods defined in the interface.

##### Example of Implementing an Interface:

```java
// Interface
public interface Printable {
    int MAXIMUM_PIXEL_DENSITY = 1000;

    void print();
}

// Class Image implementing Printable interface
public class Image implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Image...");
    }
}

// Class Spreadsheet implementing Printable interface
public class Spreadsheet implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Spreadsheet...");
    }
}
```

In this example:
- Both `Image` and `Spreadsheet` classes implement the `Printable` interface.
- They both provide their own implementation of the `print()` method.

#### **Abstract Classes vs Interfaces**
While abstract classes are used to provide a common base with some implemented methods, interfaces are used to define a contract that multiple classes can implement. 

- **Abstract Class**: Can have both implemented and unimplemented methods.
- **Interface**: Can only declare abstract methods (though this has been relaxed slightly in newer versions of Java with default methods).

#### **Default Methods**
In Java 8 and later, interfaces can have **default methods**. These are methods with an implementation that can be optionally overridden by the implementing class.

This feature allows you to add functionality to an interface without breaking the implementing classes. If a class does not override the default method, it will use the default implementation.

##### Example of Default Method:

```java
public interface Printable {
    int MAXIMUM_PIXEL_DENSITY = 1000;

    default void print() {
        System.out.println("Printing by default: " + this.toString());
    }
}

// Class Image implements Printable and uses default print method
public class Image implements Printable {
    // No need to override print, it will use the default method
}

// Class CustomImage implements Printable and overrides the default print method
public class CustomImage implements Printable {
    @Override
    public void print() {
        System.out.println("Custom Printing Image...");
    }
}
```

In this example:
- The `Image` class does not override the `print()` method, so it uses the default implementation.
- The `CustomImage` class overrides the `print()` method, providing its custom behavior.

#### **Why Use Interfaces?**
1. **Multiple Inheritance**: In Java, a class can inherit from only one class, but it can implement multiple interfaces. This allows for multiple inheritance of behavior.
   
   ```java
   public class MultiPurposeDevice implements Printable, Scannable {
       // Implement methods from both Printable and Scannable interfaces
   }
   ```

2. **Loose Coupling**: Interfaces help in decoupling the code, making it easier to change and extend. You can change the implementation of a method without affecting the classes that use the interface.

3. **Polymorphism**: Interfaces allow for polymorphic behavior. Objects of different classes can implement the same interface and be treated interchangeably.
   
   ```java
   Printable p1 = new Image();
   Printable p2 = new Spreadsheet();
   
   p1.print(); // Calls print method from Image class
   p2.print(); // Calls print method from Spreadsheet class
   ```

4. **Design Patterns**: Interfaces are commonly used in design patterns like Strategy, Observer, and Command, where behavior is abstracted and can be changed dynamically.

#### **Summary**
- **Interface**: Defines a contract with abstract methods and constant attributes.
- **`implements` keyword**: Used by a class to promise to provide implementations for all methods declared in the interface.
- **`default` methods**: Provide default method implementations that can be optionally overridden.
- **Why Use Interfaces**: To define common behavior across different classes, allow for multiple inheritance, decouple code, and enable polymorphism.

## 16. Representing a Class in UML

### **Introduction to UML (Unified Modeling Language)**

Unified Modeling Language (UML) is a standardized graphical notation used to represent the design and structure of object-oriented systems. UML helps developers, designers, and analysts communicate and visualize the system architecture through various types of diagrams. **Class modeling** is a key aspect of UML, which is widely used for illustrating the structure and relationships of classes within a system.

### **Representing a Class in UML**

A **class** in UML is represented by a rectangle divided into three sections:
1. **Class Name**: The name of the class is placed at the top.
2. **Attributes**: The second section lists the attributes of the class.
3. **Methods**: The third section lists the methods of the class.

#### For example, for a `GameObject` class:

```plaintext
+------------------------+
|      GameObject        |
+------------------------+
| - xPos: int = 0        |
| - yPos: int = 0        |
+------------------------+
| + render(): void       |
| + move(): void         |
+------------------------+
```

- **Class Name**: `GameObject`
- **Attributes**: `xPos` and `yPos` are attributes with the data type `int` and an initial value of 0.
- **Methods**: `render()` and `move()` are methods of the class with a `void` return type.

### **Representing Class Attributes**

Attributes in UML classes are represented as follows:
- **Name**: The name of the attribute.
- **Data Type**: The data type of the attribute, e.g., `int`, `String`.
- **Initial Value**: The initial value of the attribute (if applicable).
- **Visibility**: Indicates whether the attribute is public, private, protected, or package-private.

#### For example, to represent attributes like `xPos` and `yPos`:

- **Public**: `+ xPos: int = 0`
- **Private**: `- xPos: int`
- **Package-private (default)**: `~ xPos: int`
- **Protected**: `# xPos: int`

### **Multiplicity in UML**

Multiplicity indicates how many instances of one class can be related to instances of another class. It is often shown next to the association line.

Common multiplicities:
- **1**: Exactly one.
- **0..1**: Zero or one.
- **0..***: Zero or many.
- **1..***: One or more.
- **n..m**: A bounded interval (e.g., 3..5).

#### For example, if one `GameObject` is associated with one `Position` object, you can represent the relationship as:

```plaintext
+------------------+      1      +-------------------+
|   GameObject     | ------------ |     Position      |
+------------------+             +-------------------+
```

This indicates that each `GameObject` has one `Position`.

### **Representing Class Methods**

Methods in UML are represented by:
- **Visibility**: Public (`+`), Private (`-`), Protected (`#`), or Package-private (`~`).
- **Method Name**: The name of the method.
- **Return Type**: The type of value the method returns (e.g., `void`, `String`, `int`).
- **Parameters**: A list of parameters and their data types.

#### Example method representation:

```plaintext
+ render(): void
+ move(distance: int): void
```

### **Class Relationships in UML**

Classes can relate to one another through various types of relationships. The four most common relationships are:

1. **Association**: A "has-a" relationship where one class contains or uses another class.
2. **Generalization (Inheritance)**: A relationship where one class (subclass) inherits the properties and behaviors of another (superclass).
3. **Realization (Interfaces)**: A class implements an interface, providing the functionality defined by the interface.
4. **Dependency**: A weak relationship where one class relies on another, typically indicating that changes in one class may affect the other.

### **Types of Class Relationships**

#### 1. **Association**

An **association** represents a "has-a" relationship between classes. It shows that an object of one class can interact with an object of another class. The relationship is denoted by a solid line.

#### Example: A `GameObject` can have a `Position` object to represent its coordinates.

```plaintext
+-------------------+   1   +------------------+
|   GameObject      |------>|     Position     |
+-------------------+       +------------------+
```

#### **Multiplicity in Association**

You can define the multiplicity on each end of an association to specify how many objects of one class can be related to objects of another class. For example:
- **One-to-one**: Each `GameObject` has one `Position`.
- **One-to-many**: A `GameObject` can be associated with multiple `Position` objects.

#### 2. **Generalization (Inheritance)**

**Generalization** represents an inheritance relationship, where one class (subclass) inherits from another class (superclass). It is represented by a solid line with a triangle pointing to the superclass.

#### Example:

```plaintext
+-------------------+      ^
|   GameObject      |------|
+-------------------+      |
        ^                  |
        |                  |
+-------------------+   +-------------------+
|   Player          |   |   Enemy           |
+-------------------+   +-------------------+
```

- The `Player` and `Enemy` classes are both subclasses of `GameObject`, inheriting its attributes and methods.

#### 3. **Realization (Interfaces)**

In **realization**, a class implements an interface, which is indicated by a dashed line with a triangle pointing to the interface.

#### Example:

```plaintext
+--------------------+    <<interface>>    +-------------------+
|   Printable        |-------------------->|   Image           |
+--------------------+                     +-------------------+
```

- `Image` implements the `Printable` interface, meaning it provides a concrete implementation for the methods declared in `Printable`.

#### 4. **Dependency**

A **dependency** represents a weaker relationship where a class depends on another. It is shown by a dashed arrow.

#### Example:

```plaintext
+--------------------+     <<uses>>     +------------------+
|   GameObject       |----------------->|    Position      |
+--------------------+                   +------------------+
```

- In this case, `GameObject` depends on `Position`, meaning that `GameObject` uses `Position` in its methods.

#### **Aggregation and Composition**

These are special forms of association that describe different levels of dependency:

- **Aggregation**: Represents a "whole-part" relationship where both entities can exist independently. For example, a `Pond` can have multiple `Duck` objects, but if the `Pond` is destroyed, the `Duck` objects can still exist.

- **Composition**: A stronger form of association where one object cannot exist without the other. For example, a `Department` cannot exist without a `University`.

---

### **Summary**

UML is a powerful tool for representing object-oriented designs through class diagrams. It helps developers visualize the structure and relationships between classes, attributes, methods, and their interactions. Understanding UML relationships—such as **association**, **generalization**, **realization**, and **dependency**—is key to designing clear and maintainable software systems.

## 17. Collections and Maps

### **Collections**

A framework that permits storing, accessing, and manipulating **lists** (an ordered collection).

### **Maps**

A framework that permits storing, accessing, and manipulating **key-value pairs**.

### **Using the ArrayList Class for Storing Data**

- `ArrayList` can be used to store different types of objects, provided they inherit the same base class.
- Technically, this means `ArrayList` is not designed for entirely different types of objects.
- `ArrayList` is a class in the Java Collections framework that allows storing, retrieving, and manipulating a group of objects.

### **Comparing Collection Types**

Each of these collection types has useful applications:

- **ArrayList** → Like arrays, but better.
- **HashSet** → Ensures elements are unique (no duplicates).
- **PriorityQueue** → Allows ordering of elements in non-trivial ways.
- **TreeSet** → Provides fast lookup/search of unique elements.

## 18. Type Parameters, Bounded Type Parameters

### **Generics in Java**

Java allows **class, interface, or method definitions** to include **parameter types**. These definitions are called **generics**, which:

- Enable **generic logic** to be written that applies to **any class type**.
- Allow **code reusability**.

We will first learn **how to use generically typed classes**, and then how to **write generically typed classes**.

---

### **Comparable Interface**

#### **Definition of the Comparable Interface**

```java
public interface Comparable<T> {  
    public int compareTo(T other);  
}
```

#### **What does `T` mean?**

##### **Type Parameters**

- `T` is a **type parameter** (or **type variable**).
- When `T` is given a **specific type**, every instance of the placeholder variable **is replaced** with that type.
- The value of `T` is literally a **class/interface type**, such as:
  - `Integer`
  - `String`
  - `Robot`
  - `Book`
  - `Driveable`

#### **Implementing the Comparable Interface**

Whoever implements the interface must provide the type:

```java
public class Robot implements Comparable<Robot> { ... }  
public class Book implements Comparable<Book> { ... }  
public class Dog implements Comparable<Dog> { ... }  
```

---

### **Why Use Type Parameters?**

Using **type parameters** allows us to define a **class or method** that works with **arbitrary, generic types**, making it applicable to **any and all types**.

### **Defining a Generic Class**

#### **Keyword: Generic Class**

A **generic class** is a class defined with an **arbitrary type** for:
- A **field**
- A **parameter**
- A **return type**

#### **Characteristics of a Generic Class**

- The **type parameter** is included in **angular brackets** (`<>`) after the class name in the class definition.
- A **type parameter** can have **any reference type** (i.e., any class type).
- Traditionally, a **single uppercase letter** (e.g., `T`) is used as a type parameter, but **any valid identifier** (non-keyword) can be used.
- A **generic class** is stored and compiled just like any other class.

---

### **Bounded Type Parameters**

Sometimes, we need to **guarantee a class’s behavior**, so we apply **bounds** to type parameters.

#### **Syntax for Bounded Type Parameters**

```java
public class Generic<T extends <class, interface...>> { }  
```

#### Examples:

```java
public class Generic<T extends Comparable<T>> { }  // T must implement Comparable  
public class Generic<T extends Robot> { }          // T must be a subclass of Robot  
public class Generic<T extends Robot & Comparable<T> & List<T>> { }  
// T must be a subclass of Robot AND implement Comparable & List  
```

---

### **Generic Methods**

#### **Keyword: Generic Method**

A **generic method** is a method that accepts arguments or returns objects of an **arbitrary type**.

- A **generic method** can be defined in **any class** (generic or non-generic).
- The **type parameter** (e.g., `T`) is **local** to the method.

#### **Examples of Generic Methods**

```java
public <T> int genericMethod(T arg);         // Accepts a generic argument  
public <T> T genericMethod(String name);     // Returns a generic type  
public <T> T genericMethod(T arg);           // Accepts and returns the same generic type  
public <T, S> T genericMethod(S arg);        // Uses two different generic types  
```

## 19. Design Patterns

### **What is a Software Design Pattern?**

A **Software Design Pattern** is a **description of a solution** to a **recurring problem** in software design.

### **Why Use Design Patterns?**

- Recurring problems in software design make these solutions **valuable** to developers.
- Documenting solutions as **patterns** allows developers to **reuse** them instead of **reinventing the wheel**.

### **Singleton Pattern**

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

### **Types of Errors**

#### **1. Syntax Errors**

**Definition:** Errors where the written code is not **valid Java syntax**.
- Identified by the **editor/compiler**.
- Prevents the program from compiling.
- Example:
  ```java
  int x = "hello";  // Error: Type mismatch (String assigned to an int)
  ```

#### **2. Semantic Errors**

**Definition:** The program **runs** but produces **incorrect output** or behaves unexpectedly.
- Identified through **software testing**.
- Example:
  ```java
  int x = 5 / 2;  
  System.out.println(x);  // Output: 2 (integer division, expected 2.5)
  ```

#### **3. Runtime Errors**

**Definition:** Errors that cause the program to **crash** during execution.
- Identified when the program **runs**.
- Example:
  ```java
  int[] arr = new int[5];  
  System.out.println(arr[10]);  // Error: ArrayIndexOutOfBoundsException
  ```

---

### **Common Runtime Errors**

- **Dividing a number by zero** (`ArithmeticException`)
- **Accessing an array element out of bounds** (`ArrayIndexOutOfBoundsException`)
- **Storing incompatible data types** (e.g., assigning a `String` to an `int`)
- **Using a negative value as an array size**
- **Invalid type conversions** (e.g., converting `"abc"` to an `int`)

#### **File Errors**

- **Opening a file in "read mode" that does not exist** or lacks permission
- **Opening a file in "write/update mode" with read-only permission**

---

### **Exceptions in Java**

### **Keyword: Exception**

An **exception** is an **error state** caused by a **runtime error** in your code.

### **How Java Handles Exceptions**

- Java creates an **exception object** to represent the error encountered.
- The program can **handle exceptions** using `try-catch` blocks.

#### Example:

```java
try {
    int result = 10 / 0;  // Error: Division by zero
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

### **Chaining Exceptions**

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

### **Enumerated Types**

**Keyword: `enum`** – A class that consists of a **finite list of constants**.

### **Why Use Enums?**

- Used when we need to represent a **fixed set of values**.
- Must list **all possible values** explicitly.
- Just like any other **class**, enums can have **methods** and **attributes**.

---

### **Defining an Enum in Java**

Let’s define an **enum** for the **Rank** of a card:

```java
public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}
```

#### And a **Card class** that uses this enum:

```java
public class Card {
    private Rank rank;

    public Card(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }
}
```

---

### **Enum Variables and Built-in Methods**

Enums in Java **come with built-in methods**:

#### **1. Default Constructor**

Enums **automatically** create a **default constructor**, which assigns values to constants.

#### **2. `toString()`**

Returns the **name of the enum constant** as a `String`.

```java
System.out.println(Rank.ACE.toString());  // Output: ACE
```

#### **3. `compareTo()`**

Compares the **ordinal values** of two enum constants.

```java
System.out.println(Rank.KING.compareTo(Rank.QUEEN));  // Output: 1
```

#### **4. `ordinal()`**

Returns the **position (zero-based index)** of the constant in the enum list.

```java
System.out.println(Rank.TEN.ordinal());  // Output: 9
```

---

### **Adding Methods to an Enum**

Since **enums are also classes**, we can **add (or override) methods**:

#### **Example: Checking Face Cards**

```java
public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    public boolean isFaceCard() {
        return this.ordinal() > Rank.TEN.ordinal();
    }
}
```

#### **Usage**

```java
System.out.println(Rank.JACK.isFaceCard());  // Output: true
System.out.println(Rank.TWO.isFaceCard());   // Output: false
```

### **Variadic Parameters**

#### **What are Variadic Methods?**

**Keyword: `Variadic Method`** – A method that takes an **unknown number of arguments**.

- **How does it work?**
  - Variadic methods are not overloaded for each possible number of arguments. Instead, they **implicitly convert** the input arguments into an array.

#### **Example Usage:**

```java
public class VariadicExample {

    public static void main(String[] args) {
        // Calling the variadic method
        System.out.println(concatenate("Hello", "world!"));
        System.out.println(concatenate("Programming", "is", "fun!"));
    }

    // Variadic method that concatenates an unknown number of String arguments
    public static String concatenate(String... strings) {
        String result = "";  
        // Loop through each string argument
        for (String s : strings) {
            result += " " + s;  // Concatenate with space
        }
        return result.trim();  // Return concatenated string, trimming any leading/trailing space
    }
}
```

#### **Output:**

```
Hello world!
Programming is fun!
```

---

####

### Functional Interfaces

### **What is a Functional Interface?**

**Keyword: `Functional Interface`**  
A **Functional Interface** is an interface that contains **only a single abstract method**. It is also called a **Single Abstract Method (SAM) interface**.

```java
@FunctionalInterface
public interface Attackable {
    void attack();  // Single abstract method
}
```

- A functional interface can only contain **one non-static method**. Adding more than one abstract method will cause a **compilation error**.

### **Characteristics of Functional Interfaces**

- **Single Abstract Method**: This is the core characteristic of a functional interface.
- **Used for Lambdas and Method References**: Functional interfaces are primarily used for enabling **lambda expressions** and **method references**.
- **Common Examples**:  
  - `Runnable`, `Callable`, `Comparator`
  - Custom interfaces annotated with `@FunctionalInterface`

### **Why Are Functional Interfaces Useful?**

Even without **lambdas** or **method references**, functional interfaces are still valuable for the following reasons:

1. **Provide a Clear Contract with a Single Method**  
   - The functional interface clearly defines the behavior through a single abstract method, ensuring clarity.

2. **Ensure Consistent Behavior Definition**  
   - Functional interfaces help guarantee **consistent** behavior, as there is only one method to implement.

3. **Simplify Implementations Using Anonymous Inner Classes**  
   - They simplify code by allowing you to easily create anonymous inner classes to implement the interface.

4. **Maintain Compatibility with Frameworks and APIs**  
   - Many libraries, frameworks, and APIs rely on functional interfaces for defining **callback mechanisms**, **listeners**, and **handlers**.

5. **Facilitate Testing and Documentation**  
   - Functional interfaces make testing and documenting code easier because of their **single-method** structure.

6. **Support Design Patterns like Strategy and Command**  
   - They are great for implementing design patterns such as the **Strategy** and **Command** patterns, where behavior is passed as an object.

### **Common Use Cases of Functional Interfaces**

1. **Callback Mechanism**:  
   - Use functional interfaces to define a **single action** to be executed when needed.

2. **Strategy Pattern**:  
   - Implement various strategies that can be easily swapped, promoting flexibility in the design.

3. **Stream API**:  
   - The **Stream API** leverages functional interfaces like `Predicate`, `Function`, and `Consumer` to manipulate collections in a declarative way.

---

### Lambda Expressions 
A **Lambda Expression** is a technique that treats code as data, which can be used as an **object**. It allows us to **instantiate interfaces** (particularly **functional interfaces**) without the need to explicitly implement them in a class.

#### Example of a **lambda expression**:

```java
public interface Predicate<T> {
    boolean test(T t);
}

// Lambda expression implementing the Predicate interface
Predicate<Integer> p = i -> i > 0;
```

- **Predicate** is a functional interface with a `test` method.
- The lambda expression `i -> i > 0` defines the behavior of the `test` method, checking whether an integer is greater than zero.

### **Structure of a Lambda Expression**

A **lambda expression** follows the general structure:

```java
(sourceVariable1, sourceVariable2, ...) -> <operation on source variables>
```

Where:
- **Source Variables**: These are the input arguments (can be zero or more).
- **Operation**: The expression defines what operation to perform on the source variables.

### **Examples of Operations in Lambda Expressions**

1. **Doubling an Integer**:  
   A lambda expression can be used to double the value of an integer:
   ```java
   Function<Integer, Integer> doubleValue = x -> x * 2;
   ```

2. **Comparing Two Objects**:  
   A lambda expression can compare two objects (e.g., integers or strings):
   ```java
   Comparator<Integer> compareNumbers = (a, b) -> a.compareTo(b);
   ```

3. **Performing a Boolean Test**:  
   A lambda can be used to apply boolean logic to an object:
   ```java
   Predicate<String> isEmpty = str -> str.isEmpty();
   ```

4. **Copying an Object**:  
   Lambda expressions can be used to perform actions like copying or modifying objects:
   ```java
   Function<String, String> copyText = str -> str + " copied!";
   ```

### **Benefits of Lambda Expressions**

- **Concise**: Lambda expressions allow you to write more concise and readable code.
- **Eliminates Boilerplate Code**: It removes the need for implementing unnecessary methods or classes.
- **Enables Functional Programming**: Lambda expressions align well with the functional programming paradigm, where functions can be treated as first-class citizens.

---

### **Method References in Java**

#### **What is a Method Reference?**

**Keyword: `Method Reference`**  
A **Method Reference** is a shorthand notation for a lambda expression that calls a single method. It allows you to refer directly to a method of a class or object, instead of using a lambda expression to invoke that method.

A method reference can be used in the following way:

```java
names.replaceAll(String::toUpperCase);
```

This replaces each string in the `names` list with its uppercase version. The method reference `String::toUpperCase` is equivalent to the lambda expression `s -> s.toUpperCase()`.

#### **How are Method References Stored?**

Method references can be stored in the same way lambda expressions are stored. For example, the following lambda expression:

```java
UnaryOperator<String> operator = s -> s.toLowerCase();
```

Can be replaced with a method reference:

```java
UnaryOperator<String> operator = String::toLowerCase;
```

### **Types of Method References**

There are three main types of method references in Java:

1. **Static Method References**  
   When referencing a **static method**, the syntax is:
   ```java
   Class::staticMethod
   ```
   Example:
   ```java
   Person::printWarning
   ```

2. **Instance Method References**  
   You can reference **instance methods** in two ways:
   - **Using the class name**:  
     ```java
     Class::instanceMethod
     ```
     Example:
     ```java
     String::startsWith
     ```

   - **Using an object reference**:  
     ```java
     object::instanceMethod
     ```
     Example:
     ```java
     person::toString
     ```

3. **Constructor References**  
   A **constructor reference** allows you to reference a class constructor. The syntax is:
   ```java
   Class::new
   ```
   Example:
   ```java
   String::new
   ```

### **How Method References Work**

- **Method Arguments**: With method references, the arguments are implied by the context of the method call. For example:
  - In the case of `String::toUpperCase`, the string object `s` will be automatically passed to the `toUpperCase()` method when the method reference is called.

---

### **Streams in Java**

Streams in Java are a powerful technique that enables you to perform complex data manipulation and transformations in a more readable and functional style. A **Stream** is a sequence of elements that supports various operations to manipulate or process the data. Streams can be used with collections (like lists, sets, etc.), and they allow for functional-style operations such as `map`, `filter`, `limit`, `collect`, and `reduce`.

### **Common Stream Operations**

#### 1. **map (convert input to output)**

The `map` operation transforms each element of the stream into another element. It applies a function to each element of the stream and returns a new stream consisting of the transformed elements.

Example:
```java
List<String> words = Arrays.asList("apple", "banana", "cherry");
List<String> upperCaseWords = words.stream()
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());
System.out.println(upperCaseWords);  // Output: [APPLE, BANANA, CHERRY]
```

#### 2. **filter (select elements with a condition)**

The `filter` operation is used to select elements from the stream that satisfy a particular condition. It takes a **predicate** as a parameter and returns a new stream containing only the elements that match the condition.

Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
System.out.println(evenNumbers);  // Output: [2, 4, 6, 8, 10]
```

#### 3. **limit (perform a maximum number of iterations)**

The `limit` operation is used to reduce the size of the stream by limiting it to a specified number of elements. This is useful when you only want the first N elements of a stream.

Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> firstThreeNumbers = numbers.stream()
                                         .limit(3)
                                         .collect(Collectors.toList());
System.out.println(firstThreeNumbers);  // Output: [1, 2, 3]
```

#### 4. **collect (gather all elements and output in a collection like List, Set, String, etc.)**

The `collect` operation is used to transform the elements of the stream into a different form, usually a collection such as a List, Set, or Map. This is a **terminal operation**, meaning it consumes the stream and produces a result.

Example:
```java
List<String> words = Arrays.asList("apple", "banana", "cherry");
String concatenatedWords = words.stream()
                                .collect(Collectors.joining(", "));
System.out.println(concatenatedWords);  // Output: apple, banana, cherry
```

#### 5. **reduce (aggregate a stream into a single value)**

The `reduce` operation performs a reduction on the elements of the stream using an associative accumulation function. It combines the elements of the stream into a single value. This is also a **terminal operation**.

Example:
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .reduce(0, (a, b) -> a + b);
System.out.println(sum);  // Output: 15
```

In this example, the `reduce` operation starts with an initial value of 0 and applies the lambda function `(a, b) -> a + b` to accumulate the sum of all numbers in the list.

### **Combining Stream Operations**

You can combine multiple stream operations to process data in a flexible and functional way. For example:

```java
List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
List<String> result = words.stream()
                           .filter(word -> word.length() > 5)
                           .map(String::toUpperCase)
                           .limit(3)
                           .collect(Collectors.toList());
System.out.println(result);  // Output: [BANANA, CHERRY, ELDERBERRY]
```
