package OOPS;
interface bicycle{
    int a=45;
    void applybreak(int decrement);
    void Speed(int increment);
}
interface horn{
    void blowhorn();
} 
class avon implements bicycle,horn{

    void hello(){
        System.out.println("hello namaste");
    }
    public  void applybreak(int decrement){//we declare public for interface method 
           System.out.println("Applying break");
     }
   public  void Speed(int increment){
        System.out.println("incresing speed");
    }
     public void blowhorn(){
        System.out.println("pee poo peee pooo horn blow");
     }
}
public class hellointerface{
    public static void main(String[] args) {
      avon z=new avon();
      z.applybreak(1);
      System.out.println(z.a);
}
}