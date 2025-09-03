package OOPS;
abstract class base{
    public base(){
       System.out.println("constructor of base");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class basechild extends base{
      
    @Override //when an abstract class is extends its abstract method should be implimented in child class or declare class as abstract
    public void greet() {
        System.out.println("Hello from basechild!");
    }
     public void greet1() {
        System.out.println("Hello from basechild!");
    }
}
abstract class basechild2 extends base{
        public void th(){
            System.out.println("i another absract created by base abstract");
        }
}

public class abstract_meth{
      public static void main(String[] args) {
        basechild c=new basechild();
        c.greet();
        //basechild2 c=new basechild2(); object cannot be created 
      }
}
