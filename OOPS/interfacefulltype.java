package OOPS;

// Parent interface
interface Animal {
    void eat();
    void sleep();
}

// Child interface inheriting from Animal
interface Mammal extends Animal {
    void giveBirth();
}

// Another interface
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements Mammal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    
    @Override
    public void giveBirth() {
        System.out.println("Dog gives birth to puppies");
    }
    
    @Override
    public void play() {
        System.out.println("Dog is playing fetch");
    }
}

interface Vehicle {
    // Abstract method
    void start();
    
    // Default method (has implementation)
    default void stop() {
        System.out.println("Vehicle stopped");
    }
    
    // Static method
    static void honk() {
        System.out.println("Honk! Honk!");
    }
}

interface Electric {
    default void charge() {
        System.out.println("Charging electric vehicle");
    }
}

// Interface inheriting with default methods
interface ElectricCar extends Vehicle, Electric {
    // Overriding default method
    @Override
    default void stop() {
        System.out.println("Electric car stopped silently");
    }
    
    void autoPilot();
}

class Tesla implements ElectricCar {
    @Override
    public void start() {
        System.out.println("Tesla started silently");
    }
    
    @Override
    public void autoPilot() {
        System.out.println("Tesla autopilot engaged");
    }
}

interface Calculator {
    // Abstract methods
    int add(int a, int b);
    int multiply(int a, int b);
    
    // Default method using private methods
    default int complexCalculation(int a, int b, int c) {
        int sum = privateAdd(a, b);
        return privateMultiply(sum, c);
    }
    
    // Private method (helper method)
    private int privateAdd(int a, int b) {
        return a + b;
    }
    
    // Private static method
    private static int privateMultiply(int a, int b) {
        return a * b;
    }
}

class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}

interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B");
    }
}

// Resolving default method conflict
class C implements A, B {
    // Must override the conflicting default method
    @Override
    public void show() {
        // You can choose which interface's method to call
        A.super.show(); // Calls A's show method
        // or implement your own logic
        System.out.println("Class C's implementation");
    }
}

// Main class to test the interfaces
public class interfacefulltype {
    public static void main(String[] args) {
        // Testing basic inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.giveBirth();
        dog.play();
        
        System.out.println("\n--- Testing Default Methods ---");
        
        // Testing default methods
        Tesla tesla = new Tesla();
        tesla.start();
        tesla.stop(); // Uses overridden default method
        tesla.charge();
        tesla.autoPilot();
        
        // Calling static method from interface
        Vehicle.honk();
        
        System.out.println("\n--- Testing Private Methods ---");
        
        // Testing private methods in interfaces
        Calculator calc = new BasicCalculator();
        int result = calc.complexCalculation(2, 3, 4);
        System.out.println("Complex calculation result: " + result);
        
        System.out.println("\n--- Testing Multiple Inheritance Conflict ---");
        
        // Testing multiple inheritance conflict resolution
        C obj = new C();
        obj.show();
    }
}
