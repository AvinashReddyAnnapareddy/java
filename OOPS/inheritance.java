package OOPS;
class bases{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base setting x now");
        this.x = x;
    }
      bases(){
        System.out.println("i am constructor");
       
    }
    bases(int x){
         System.out.println("i am overloaded constructor a as"+x);
    }

}
class derived extends bases {
    int y;
   
    derived(){
          super(90);
          System.out.println("i am derived constructor");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
         bases b=new bases();
        b.setX(23);
        // System.out.println(b.getX());
        derived d=new derived();
         d.setX(67);
        // System.out.println(d.getX());
    }
}
