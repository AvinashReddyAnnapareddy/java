package String_java;
class Mobile{
   static String name;
    String brand;
    int price;
    static
    {
        name="phone"; // Static block to initialize static variable
        System.out.println("Static block executed: Mobile name set to ");
    }
    public Mobile() {
        // Constructor can be used to initialize instance variables if needed
        brand = "";
        price = 200;
        System.out.println("Constructor executed: Mobile object created");
    }
    public void displayDetails() {
        System.out.println("Mobile Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}
public class Static {
    public static void main (String args[]){
        
        Mobile obj1=new Mobile();
        Mobile.name="smartphone";
        obj1.brand="Apple";
        obj1.price=1099;   

        obj1.displayDetails(); // Print the details to see all outputs

    }
}
