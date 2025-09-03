
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void speak();

    public void eat() {
        System.out.println("The animal is eating.");
    }
}
 class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Roar!");
    }
}

 class Dolphin extends Animal {
    public Dolphin(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Ee-ee!");
    }
}

public class Zoo {
    public static void main(String[] args) {
     
        Lion lion = new Lion("Simba", 5);
        System.out.println("Lion's name: " + lion.getName());
        System.out.println("Lion's age: " + lion.getAge());
        lion.speak();
        lion.eat();

        Dolphin dolphin = new Dolphin("Delphi", 10);
        System.out.println("Dolphin's name: " + dolphin.getName());
        System.out.println("Dolphin's age: " + dolphin.getAge());
        dolphin.speak();
        dolphin.eat();
    }
}