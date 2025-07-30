import java.util.Scanner;

public  class user {
    public static void main(String[] args) {
        // System.out.println("Hello, User!");
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();//print the statements
        System.out.println( str);
        System.out.print("Enter your number 1: ");
        int a= s.nextInt();
        System.out.print("Enter your number 2: " );
        int b= s.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two numbers is: " + sum);
        s.close();// Close the scanner to prevent resource leaks
    }
}
