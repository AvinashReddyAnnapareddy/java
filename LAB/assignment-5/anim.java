class Animal {
    void eat() {
        System.out.println("Animals Eat");
    }
}

class herbivores extends Animal {
    void eat() {
        System.out.println("Herbivores Eat Plants");
    }
}

class omnivores extends Animal {
    void eat() {
        System.out.println("Omnivores Eat Plants and meat");
    }
}

class carnivores extends Animal {
    void eat() {
        System.out.println("Carnivores Eat meat");
    }
}

public class anim {
    public static void main(String args[]) {

        Animal a;

        a = new Animal();
        a.eat();

        a = new herbivores();
        a.eat();

        a = new omnivores();
        a.eat();

        a = new carnivores();
        a.eat();
    }
}

