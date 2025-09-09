// Parent class
class Bicycle {
    int gear;
    int speed;

    // Constructor
    Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Method to increase speed
    void speedUp(int increment) {
        speed += increment;
        System.out.println("Speed increased by " + increment + " -> Current speed: " + speed);
    }

    // Method to decrease speed
    void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;  // avoid negative speed
        System.out.println("Speed decreased by " + decrement + " -> Current speed: " + speed);
    }

    // Display method
    void display() {
        System.out.println("Gear: " + gear + ", Speed: " + speed);
    }
}

// Child class
class MountainBike extends Bicycle {
    int seatHeight;

    // Constructor
    MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed); // call Bicycle constructor
        this.seatHeight = seatHeight;
    }

    // Method to update seat height
    void setSeatHeight(int newHeight) {
        seatHeight = newHeight;
        System.out.println("Seat height updated to: " + seatHeight);
    }

    // Display method
    @Override
    void display() {
        System.out.println("Gear: " + gear + ", Speed: " + speed + ", Seat Height: " + seatHeight);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Create a Bicycle object
        Bicycle bike = new Bicycle(3, 20);
        System.out.println("Bicycle:");
        bike.display();
        bike.speedUp(5);
        bike.applyBrake(10);

        System.out.println();

        // Create a MountainBike object
        MountainBike mb = new MountainBike(5, 30, 10);
        System.out.println("Mountain Bike:");
        mb.display();
        mb.speedUp(15);
        mb.applyBrake(20);
        mb.setSeatHeight(15);
        mb.display();
    }
}

