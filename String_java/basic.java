package  String_java;

class Mbile{
   static String name;
    String brand;
    int price;
    public void displayDetails() {
        System.out.println("Mobile Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}
public class basic
{
    public static void main(String a[])
    {
     Mbile obj1=new Mbile();
        Mbile.name="smartphone";
        obj1.brand="Apple";
        obj1.price=1099;
        Mbile obj2=new Mbile();
        Mbile.name="smartphone";
        obj2.brand="Samsung";
        obj2.price=1199;
        Mbile.name="Mobile"; // Static variable can be accessed through class name
        obj1.displayDetails();
        obj2.displayDetails();
    }
}
