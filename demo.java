class Calculator{
    int num=10;
public int add(int a, int b) {
    System.out.println("Adding two numbers");
    return a + b;   

    }

}


public class demo {
    public static void main(String[] args) {
    
    int num1=10;
    int num2=20;
 Calculator calc =new Calculator();// Creating an object of the Calculator class
    // Calling the add method using the object
    int sum = calc.add(num1, num2);
    System.out.println(sum);
    calc.num=23; // Changing the value of num variable in the Calculator class
    Calculator calc2 = new Calculator();
    System.out.println(calc2.num); // Accessing the num variable from the Calculator class
    System.out.println(calc.num);
    }
}
