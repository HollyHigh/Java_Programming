public class ConstructorExample {
    public static void main(String[] args) {
        SmartDog mySmartDog = new SmartDog();
        mySmartDog.bark();

        SmartDog yourSmartDog = new SmartDog("Jack", 5);
        yourSmartDog.bark();

//        yourSmartDog.setColor("Black");
//        System.out.println(yourSmartDog.getColor());


//        System.out.println(SmartDog.dogsCount);
//        System.out.println(SmartDog.getDogsCount());

    }
}

class SmartDog {
    private final String name;
    private final int age;
    private String color;
//    String getColor() {
//        return color;
//    }
//    void setColor(String color) {
//        this.color = color;
//    }
    SmartDog() {
        this.name = "Xiaoming";
        this.age = 0;
//        dogsCount++;
    }
//    SmartDog() {
//        this("Xiaoming", 0);
//    }
    SmartDog(String name, int age) {
        this.name = name;
        this.age = age;
//        dogsCount++;
    }
    void bark() {
        System.out.println(name + " aged " + age + " says Woof!");
    }

//    public static int dogsCount = 0;
//    public static int getDogsCount() {
//        return dogsCount;
//    }
}