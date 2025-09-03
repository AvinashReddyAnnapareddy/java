package OOPS;
class A{
      public void meth2(){
        System.out.println("i am method 2 of A class");
      }
}
class B extends A{
    @Override
            public void meth2(){
        System.out.println("i am method 2 of B class");
      }  // if we comment out this we get out of method in A class 2 times
             public void meth3(){
        System.out.println("i am method 3 of B class");
      }
}
public class methodoverriding {
    public static void main(String[] args) {
             A a=new A();
             a.meth2();
             B b=new B();
             b.meth2();
    }
}
