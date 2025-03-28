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

//        cat.makeSound();
//        cat.move();
//        cat.stopSound();
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

//interface Movable {
//    void move();
//}
//
//interface Soundable {
//    void makeSound();
//    default void stopSound() {
//        System.out.println("Sound stopped");
//    }
//}


class Cat extends Animal { // implements Movable, Soundable {
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

//    @Override public void makeSound() {
//        System.out.println(getName() + " is making sound...");
//    }
//
//    @Override public void move() {
//        System.out.println(getName() + " is moving...");
//    }
}