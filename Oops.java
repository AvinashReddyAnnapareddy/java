class Employee{
    int id;
    String name;
     public void display() {
        System.out.println(id);
        System.out.println(name); 
}
}
public class Oops {
    public static void main(String[] args) {
        System.out.println("this is custom class");
        Employee avi =new Employee();
        Employee hello =new Employee();
        avi.id=61;
        avi.name="avinash";
        hello.id=61;
        hello.name="avinash";
             avi.display();
             hello.display();
    }
}
