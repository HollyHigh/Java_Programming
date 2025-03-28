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
//        yourDog.bark(3);
    }
}

class Dog {
    String name;
    int age;
    void bark() {
        System.out.println(name + " aged " + age + " says Woof!");
    }
//    void bark(int times) {
//        for (int i = 0; i < times; i++) {
//            System.out.println(name + " aged " + age + " says Woof!");
//        }
//    }
}