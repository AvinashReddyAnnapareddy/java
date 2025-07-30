//diff between static and non static method
// static method can be called without creating object of class
public class method {
    // static :for static it should be inside
    int z; // instance variable can declared in and out side of logic 
    int logic(int x,int y){
          
          if(x>y){
            z=x+y;
          }
          else{
            z=x-y;
          }
  return z;
    }
    static void telljoke(){
        System.out.println("Why did the scarecrow win an award? Because he was outstanding in his");
    }
             public static void main(String[] args) 
             {
                int a=4,b=5;
                int c;
                method obj=new method();
                c=obj.logic(a,b);
                // c=logic(a,b); when static logic is used
                int a1=2,b1=1;
                int c1;
                // c1=logic(a1,b1);
                c1=obj.logic(a1,b1);
                System.out.println(c);
                System.out.println(c1);
                telljoke();                    
             }                          
}
