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
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
    }
    public void hi(){
        System.out.println("hi from child ");
    }
}

public class dispatch {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); // Output: Parent show()

        Child c = new Child();
        c.show(); // Output: Child show()

        Parent ref = new Child();
        ref.show(); // Output: Child show() (dynamic dispatch)
        ref.hello();
        ref.hi();
    }
}
