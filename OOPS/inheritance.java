package OOPS;
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println("i am constructor");

    }

}
class derived extends base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
         base b=new base();
        b.setX(23);
        System.out.println(b.getX());
        derived d=new derived();
        d.setX(67);
        System.out.println(d.getX());
    }
}
