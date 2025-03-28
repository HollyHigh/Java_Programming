# Course Outline

1. First JAVA program
2. Basic Syntax
   - 2.1 Identifiers, Data Types, Variables and Constants
   - 2.2 Operators and Expressions
   - 2.3 Flow of Control
3. Object-Oriented Programming (OOP)
   - 3.1 Abstraction in Different Programming Paradigms
   - 3.2 Classes, Objects
   - 3.3 Constructors
   - 3.4 Method Overloading
   - 3.5 Getters and Setters
   - 3.6 Static Attributes and Methods
   - 3.7 Inheritance
   - 3.8 Interfaces
4. Reference Types
   - 4.1 String
   - 4.2 Array
   - 4.3 Enum

# First JAVA program

```java
/**
 * This class is public, which means it can be accessed from other classes
 * This class is named Hello
 */
public class Hello { // This is a class declaration
    /**
     * This is a method declaration, main method is the entry point of any Java program
     * This method is public, which means it can be accessed from other classes
     * This method is static, which means it belongs to the class and not to any instance of the class
     * This method is void, which means it does not return any value
     * This method takes an array of strings as an argument
     */
    public static void main(String[] args) { // This is a method declaration, main method is the entry point of any Java program
        System.out.println("Hello, world!"); // This statement prints "Hello, world!" to the console
    }
}
```

# Basic Syntax

## 2.1 Identifiers, Data Types, Variables and Constants

### Java Identifiers

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
- **Constants**
  - **UPPERCASE** with words separated by underscores.  (e.g., `MAX_LENGTH`).

#### **Restricted Identifiers**

- **Keywords and reserved words**:  
  - Cannot be used as identifiers (e.g., `public`, `class`, `void`, `static`).
- **Predefined identifiers from Java libraries**:  
  - Can be redefined, but doing so is discouraged as it can cause confusion or unintended behavior (e.g., `System`, `String`, `println`).

### Data Types

#### Primitive Types

byte, short, int, long, float, double, char, boolean

#### Reference Types

String, Array, Class, Interface, Enum

#### **Floating-Point Numbers in Java**

Java provides two floating-point types:

- **`float`** → **Single-precision** (32-bit)
- **`double`** → **Double-precision** (64-bit, more precise and preferred by default)

##### **Key Points**

- By default, floating-point numbers in Java are treated as **double**.
- To explicitly define a **float**, append **`f`** or **`F`** to the number.

##### **Examples**

```java
float a = 2.3F;  // Single-precision (requires 'F' suffix)
double b = 6.7;  // Double-precision (default)
```

### Variables

#### **Java Variables**

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

#### **Variable Assignment**

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

#### **Type Compatibility in Assignments**

- **Type mismatch is not allowed** (e.g., assigning `double` to `int` directly).
- **Implicit conversion** (widening) is allowed where safe.

#### **Examples**

```java
int intVariable = 2.99;  // ❌ Not valid (double to int without casting)
double doubleVariable = 2;  // ✅ Valid (int to double, implicit conversion)
```

#### **Type Conversion in Java**  

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

### Constants

A **constant** is a value that **does not change** during program execution. In Java, constants are declared using the `final` keyword.  

#### **Key Characteristics:**  

✅ **Immutable**: Once assigned, a constant **cannot** be modified.  
✅ **Declared using `final`**: The `final` keyword ensures the value remains **unchanged**.  
✅ **Naming Convention**: Constants are written in **UPPERCASE** with words separated by underscores.  

#### **Declaring Constants**  

```java
final int MAX_LENGTH = 420;       // Integer constant  
final char CHAR_CONSTANT = 'Z';   // Character constant  
final boolean BOOL_CONSTANT = true; // Boolean constant  
final String STRING_CONSTANT = "Welcome to Java"; // String constant  
```

#### **Why Use Constants?**  

🔹 Improves **code readability** (e.g., `MAX_SPEED` vs. `100`).  
🔹 Prevents **accidental modification** of values.  
🔹 Makes it **easier to update** values in large programs.  

## 2.2 Operators and Expressions

### Arithmetic Operators

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

### Relational Operators

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

### Logical Operators

| Operator | Meaning        |
|----------|---------------|
| `&&`     | Logical AND   |
| `\|\|`     | Logical OR    |
| `!`      | Logical NOT   |

---

### Bitwise Operators（*）

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

### Other Operators

#### Increment and Decrement Operators

```java
++x; x++;
--x; x--;
```

#### Conditional Operator

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

### Mathematical Functions

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

## 2.3 Flow of Control

### Branching

Branching in Java allows the program to choose different paths of execution depending on certain conditions. The main branching statements are:

- **if-else statement**: Executes one block of code if a condition is true and another block if it's false.
- **multi-way if-else statement**: Allows multiple conditions to be checked sequentially, with an `else if` clause for each alternative condition.
- **switch statement**: Evaluates a variable and compares it against a series of constant values, executing the code corresponding to the first match.
  
```java
  public class SwitchExample {
    public static void main(String[] args) {
      int dayOfWeek = 3;
      switch (dayOfWeek) {
          case 1:
              System.out.println("Monday");
              break;
          case 2:
              System.out.println("Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          default:
              System.out.println("Invalid day");
      }
    }
  }
```

### Loops

Loops allow you to repeat a block of code multiple times. Java supports several looping constructs:

- **while loop**: Repeats a block of code as long as the condition is true.
  
```java
public class WhileExample {
    public static void main(String[] args) {
        int n = 0;         
        while (n < 5) {     
            System.out.println("n = " + n);
            n++;         
        }
    }
}
```

- **do-while loop**: Executes the block of code once and then repeats it as long as the condition is true.

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int n = 0;        
        do {
            System.out.println("n = " + n);
            n++;           
        } while (n < 5);
    }
}
```

- **for loop**: Used when the number of iterations is known beforehand. It includes initialization, condition checking, and increment/decrement all in one line.

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

# Object-Oriented Programming (OOP)

## 3.1 Abstraction in Different Programming Paradigms

- **Procedural Programming (e.g., C)**:
  - Abstraction is achieved using **functions** or **procedures**. A function encapsulates logic that can be reused, reducing code duplication and enhancing maintainability.
  - A function can take **parameters** to make it more general and flexible.

- **Object-Oriented Programming (OOP) (e.g., Java, C++)**:
  - Abstraction is achieved through **Abstract Data Types (ADTs)**, which combine both **data** and **functions** that operate on that data into a **class**.
  - A **class** defines a blueprint for creating objects. It can contain:
    - **Attributes (or fields)**: Represent the state or properties of an object.
    - **Methods (or functions)**: Define behaviors or operations that an object can perform.

### examples

Calculate area and perimeter

#### Procedural Programming: C

``` C
#include <stdio.h>

struct Rectangle {
    float length;
    float width;
};

float calculate_area(struct Rectangle rect) {
    return rect.length * rect.width;
}

float calculate_perimeter(struct Rectangle rect) {
    return 2 * (rect.length + rect.width);
}

int main() {
    struct Rectangle my_rect;
    
    printf("Enter length: ");
    scanf("%f", &my_rect.length);
    printf("Enter width: ");
    scanf("%f", &my_rect.width);
    
    printf("\nResults:\n");
    printf("Area: %.2f\n", calculate_area(my_rect));
    printf("Perimeter: %.2f\n", calculate_perimeter(my_rect));
    
    return 0;
}
```

#### Object-Oriented Programming: JAVA

```java
import java.util.Scanner;

class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float calculateArea() {
        return length * width;
    }
    
    public float calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        float l = scanner.nextFloat();
        System.out.print("Enter width: ");
        float w = scanner.nextFloat();
        
        Rectangle myRect = new Rectangle(l, w);
        
        System.out.println("\nResults:");
        System.out.printf("Area: %.2f\n", myRect.calculateArea());
        System.out.printf("Perimeter: %.2f\n", myRect.calculatePerimeter());
        
        scanner.close();
    }
}
```

## 3.2 Classes, Objects

### Class

- Blueprint for objects.
- Define properties (fields) and methods (functions).

### Object

- Instance of a class.
- Example:

```java
public class DogClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.age = 3;
        myDog.bark();

        Dog yourDog = new Dog();
        yourDog.name = "Jack";
        yourDog.age = 5;
        yourDog.bark();
    }
}

class Dog {
    String name;
    int age;
    void bark() {
        System.out.println(name + " aged " + age + " says Woof!");
    }
}
```

## 3.3 Constructors

A **constructor** is a special method used to **initialize objects** when they are created. Constructors have the following characteristics:

### Key Characteristics

1. **Same Name as the Class**: The constructor name must match the class name.
2. **No Return Type**: Constructors do not have a return type.
3. **Object Initialization**: They are used to set the initial values of an object’s attributes.
4. **Overloading**: A class can have multiple constructors with different parameters (constructor overloading).

### Syntax

```java
public class ConstructorExample {
    public static void main(String[] args) {
        SmartDog mySmartDog = new SmartDog();
        mySmartDog.bark();

        SmartDog yourSmartDog = new SmartDog("Jack", 5);
        yourSmartDog.bark();
    }
}

class SmartDog {
    private final String name;
    private final int age;
    SmartDog() {
        this.name = "Xiaoming";
        this.age = 0;
    }
    SmartDog(String name, int age) {
        this.name = name;
        this.age = age;

    }
    void bark() {
        System.out.println(name + " aged " + age + " says Woof!");
    }
}
```

### Constructor Chaining

A constructor can call another constructor in the same class using `this()`.

``` java
    SmartDog() {
        this("Xiaoming", 0);
    }
```

## 3.4 Method Overloading

**Method overloading** occurs when multiple methods in a class have the **same name** but differ in their **method signature**, which can be based on:

- **Number of arguments**
- **Type of arguments**
- **Order of arguments**

### Key Points

- **Polymorphism**: Overloading is a form of polymorphism, allowing methods to behave differently depending on the arguments passed.
- **Overloaded Methods**: Methods can have the same name but different signatures (argument types and/or counts).

``` java
void bark() {
    System.out.println(name + " aged " + age + " says Woof!");
}
void bark(int times) {
    for (int i = 0; i < times; i++) {
        System.out.println(name + " aged " + age + " says Woof!");
    }
}
```

## 3.5 Getters and Setters

**Getters** and **setters** are essential in Java for controlling the access and modification of an object's instance variables. These methods ensure that your class maintains **encapsulation** by providing a controlled interface to its internal state.

### **Accessor (Getter)** and **Mutator (Setter)** Methods

1. **Getter (Accessor)**:
   - Retrieves or returns the value of a private field.
   - Conventionally starts with `get` followed by the field name, capitalized.

2. **Setter (Mutator)**:
   - Sets or updates the value of a private field.
   - Conventionally starts with `set` followed by the field name, capitalized.

``` java
   String getColor() {
       return color;
   }
   void setColor(String color) {
       this.color = color;
   }
```

## 3.6 Static Attributes and Methods

### **Static Variables and Methods in Java**

**Static Variables**:

- **Shared Among All Objects**: A static variable is **shared by all instances** of a class, meaning there is only one copy of it, regardless of how many objects are created.
- **Class-Level Data**: They belong to the **class** rather than any particular object.
- **Usage Example**: Tracking the number of objects created from a class.

#### Example of Static Variable

```java
   public static int dogsCount = 0;
```

#### Accessing Static Variables

```java
System.out.println(SmartDog.dogsCount);
```

### **Static Methods**

- **No `this` or `super`**: Static methods cannot use **`this`** or **`super`** because they are tied to **specific object instances**, while static methods belong to the class itself.
  
#### Example of Static Method

```java
   public static int getDogsCount() {
       return dogsCount;
   } 
```

#### Accessing Static Methods

```java
System.out.println(SmartDog.getDogsCount());
```

### **Important Notes**

- **Instance Variables**: Each object gets its own copy (e.g., `centreX`, `centreY`, `radius` for each Circle).
- **Static Variables**: Only one copy for the entire class (e.g., `numCircles` for all Circle objects).
- **Static Methods**: They can only interact with static data (class-level data) and should not interact with instance-specific data.

## 3.7 Inheritance

Inheritance allows one class (the **subclass** or **child class**) to inherit attributes and behaviors (methods) from another class (the **superclass** or **parent class**). It provides a way to avoid redundancy by reusing code and establishing a relationship between classes.

### **Parent Class (Superclass)**

### **Subclass (Child Classes)**

### **Constructor Inheritance**

A constructor is used to initialize an object when it's created. Inheritance works with constructors as well, and the `super` keyword is used to invoke the parent class's constructor from the subclass.

- **The `super` Keyword**:
  - Used to invoke a constructor from the parent class.
  - The `super` constructor must be the first statement in the subclass constructor (if used).
  - The parameter types to the `super` constructor call must match the constructor in the parent class.

### **Method Inheritance and Overriding**

- **Method Inheritance**: A method defined in the parent class is inherited by the child class.
  
- **Method Overriding**: Sometimes, the method behavior needs to be different in the subclass. This is where method overriding comes into play.

#### **Example**

```java
public class InheritanceExample {
    public static void main(String[] args) {
        Animal animal = new Animal("normal animal", 3);
        animal.eat();
        animal.sleep();
        System.out.println("-------------------");

        Cat cat = new Cat("Tom", 2, "orange");
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

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

class Cat extends Animal {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public void meow() {
        System.out.println(getName() + " says meow...");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating silently...");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
```

### **Benefits of Method Overriding**

1. **Specialized Behavior**: Subclasses can implement specialized logic while retaining the general behavior defined in the parent class.
2. **Code Reusability**: Common logic (like move logic) can be inherited, while specific details (like movement rules) are handled by the subclass.

### **Using `@Override` Annotation**

The `@Override` annotation is optional but highly recommended as it helps to ensure that a method is indeed overriding a method from the parent class. It also provides a compile-time check to avoid errors when the method signature does not match the parent class method.

## 3.8 Interfaces

### **Interfaces in Java**

Interfaces are used in Java to define a contract of behavior that classes can agree to implement. They define methods that a class must provide, but they do not provide the implementation details. This allows for a more flexible and modular design.

```java
interface Movable {
   void move();
}

interface Soundable {
   void makeSound();
   default void stopSound() {
       System.out.println("Sound stopped");
   }
}
```

# Reference Types

## 4.1 Strings

### **Strings in Java**

- **String Definition**:
  - `String` is a class in Java used to represent sequences of characters. It’s commonly used for messages, errors, and attributes like names.

#### Example

```java
String greeting = "Hello, World!";
```

- **Escaping Special Characters**:
  - Special characters such as double quotes `"` or backslashes `\` are "escaped" using the backslash (`\`) character.

#### Example

```java
System.out.println("Game of Thrones season 8 was \"good\".");
```

- **String Operations** ### **String Operations**:
  - You can concatenate strings using the `+` operator.

#### Example

```java
String name = "Alice";
System.out.println("Hello " + name);  // Outputs: Hello Alice
```

- **Immutability of Strings**:
  - Strings are immutable in Java, meaning once created, their value cannot be changed. Every string operation creates a new string.

#### Example

```java
String str = "Hello";
str = str + " World";  // A new string "Hello World" is created
```

## 4.2 Array

### **Array Declaration and Initialization**

- **Array Declaration**:
  - `basetype[] varName;` or `basetype varName[];`
  - This declares an array where each element is of type `basetype`.

#### Example

```java
int[] intArray; // Declares an array of integers
```

- **Array Initialization**:
  - `int[] intArray_1 = {0, 1, 2, 3, 4};`
  - This initializes an array with values `{0, 1, 2, 3, 4}`.
  - The number of elements is 5, and the values are the ones specified.

#### Example

```java
int[] intArray_1 = {0, 1, 2, 3, 4};  // 5 elements: 0, 1, 2, 3, 4
```

- **Array with a predefined size**:
  - `int[] intArray_2 = new int[100];`
  - This creates an array of 100 elements, all initialized to `0` (default value for integers).
  
#### Example

```java
int[] intArray_2 = new int[100]; // 100 elements, all initialized to 0
```

- **Array Assignment**:
  - You can assign one array to another. The second array will point to the same object as the first.
  
#### Example

```java
int[] intArray_1 = new int[n];
int[] intArray_2 = intArray_1;  // intArray_2 now points to the same array as intArray_1
```

---

### **Arrays for Objects**

- Arrays can store objects. For example, an array of `Circle` objects can be declared and allocated as follows:

#### Example

```java
Circle[] circleArray;         // Declaration of an array of Circle objects
circleArray = new Circle[25]; // Allocation of storage for 25 Circle objects
```

- **Note**: The array can store **references** to `Circle` objects, but the objects themselves aren't created yet. You need to instantiate them individually.

#### Example of creating and storing objects

```java
for (int i = 0; i < 25; i++) {
    circleArray[i] = new Circle(); // Creating and storing individual Circle objects
}
```

## 4.3 Enum

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

#### And a **Card class** that uses this enum

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
