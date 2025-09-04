package OOPS;
class Parent {
  public void meth2() {
    System.out.println("I am method 2 of Parent class");
  }
}

class Child extends Parent {
  @Override
  public void meth2() {
    System.out.println("I am method 2 of Child class");
  }
  public void meth3() {
    System.out.println("I am method 3 of Child class");
  }
}

public class methodoverriding {
  public static void main(String[] args) {
    Parent p = new Parent();
    p.meth2();
    Child c = new Child();
    c.meth2();
  }
}
