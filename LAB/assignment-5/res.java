
abstract class Beverage {
    // Abstract method that must be implemented by subclasses
    public abstract void prepare();
}

// Subclass: Coffee
class Coffee extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Coffee...");
    }
}


class Tea extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Tea...");
    }
}


class LemonTea extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Lemon Tea...");
    }
}

class CoffeeMachine {
    
    public void dispense(Beverage beverage) {
        try {
            if (beverage == null) {
                throw new IllegalArgumentException("Unsupported beverage requested!");
            }
            beverage.prepare();
            System.out.println("Dispensing your drink. Enjoy!\n");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


public class res {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

       
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();
        Beverage lemonTea = new LemonTea();

       
        machine.dispense(coffee);
        machine.dispense(tea);
        machine.dispense(lemonTea);

        
        machine.dispense(null);
    }
}

