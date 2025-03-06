# Java is Compiled and Interpreted

Java Compiler converts Java source code (file with extension `.java`) to bytecode (file with extension `.class`). Bytecode is an intermediate form, closer to machine representation. An Interpreter (virtual machine) on any target platform interprets the bytecode. Porting a Java system to any new platform involves writing an interpreter. The interpreter will figure out the equivalent machine-dependent code to run.

## Java Features

- Compiled and Interpreted
- Platform-Independent and Portable
- Object-Oriented

## Object-Oriented

Java is an Object-Oriented Programming (OOP) language. Common programming constructs are: Classes, Objects, Methods, etc. We will learn more in the coming lectures.

# Hello World - Line by Line

```java
// HelloWorld.java: Display "Hello World!" on the screen
import java.lang.*;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        return;
    }
}
```

## Line 1:

This is a comment in Java, similar to line 1 of the C program. Java supports 3 types of comments:
- `/* */` - Usually used for multi-line comments, similar to C.
- `//` - Used for single-line comments.
- `/** */` - Documentation comments, will learn more later.

## Line 2: import java.lang.*;

Serves the same purpose as the `#include` statement used in C. It is used to import additional classes (similar to libraries used in C). In Java, classes are grouped into packages. Packages may be defined by different people and may even have the same class and method names, but they differ by package name (will learn more later): e.g., `ibm.mathlib.*`, `microsoft.mathlib.*`. By default, Java imports the `java.lang.*` package; therefore, this statement is optional.

## Line 3: public class HelloWorld {

Class definition - in Java everything is defined in a class (we will learn more about classes and the keyword `public` later). The name of the class must be the same as the Java file name (HelloWorld class must be saved in a file `HelloWorld.java`).

## Line 4: public static void main(String args[])

Definition of the `main` method, very similar to C. A standalone Java program must have a `main` method. A class can have only one `main()` method. We will learn about the keywords `public` and `static` later. `String args[]` defines command line arguments, similar to C.

## Line 5: System.out.println("Hello World!");

Serves the same purpose as the `printf` function in C, except `println` is called a method, as opposed to a function in C. `System.out`: `out` is an object in the class `System`; this class is defined in the `java.lang` package. You will learn more about classes, objects, methods, and packages in the coming lectures.

## Line 6: return

This is optional, and usually not included, just included here for comparison with C.

# Writing and Running the Java Program

1. Write the Java program using a text editor (e.g., Notepad, Vim), and save it in a file `HelloWorld.java`. You will learn to use an Integrated Development Environment (IDE) later.
2. Ensure that the Java build and runtime environment is installed on the machine.
    - Open a command window and type the commands:
      ```shell
      javac -version
      java -version
      ```
3. Compile the program using the following command:
    ```shell
    javac HelloWorld.java
    ```
    The command, if successful, will generate a file `HelloWorld.class`.
4. Run the program using the following command:
    ```shell
    java HelloWorld
    ```
    You should see the following output.

    If you run `java HelloWorld` with command line arguments as follows:
    ```shell
    java HelloWorld Australia England France
    ```
    `args[]` (defined in `public static void main(String args[])`) will contain the command line arguments:
    - `args[0]` -> `Australia`
    - `args[1]` -> `England`
    - `args[2]` -> `France`
