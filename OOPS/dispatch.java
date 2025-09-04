package OOPS;

class Parent {
    void show() {
        System.out.println("Parent show()");
    }
    public void hello(){
        System.out.println("hello from parent ");
    }
       public void hi(){
        System.out.println("hi from child ");
    }
    static void fix(){
         System.out.println("static from parent ");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
    }
    public void hi(){
        System.out.println("hi from child ");
    }
    static void fix(){
         System.out.println("static from child ");
    }
}

public class dispatch {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); // Output: Parent show()
        p.fix();
        Child c = new Child();
        c.show(); // Output: Child show()
        c.fix();
        Parent ref = new Child();
        ref.show(); // Output: Child show() (dynamic dispatch)
        ref.hello();
        ref.hi();
        ref.fix();//static method cannot be overridden
    }
}
