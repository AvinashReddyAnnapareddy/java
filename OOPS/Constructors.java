package OOPS;
class mainemployee{
   private int age;//1.defult,2.protected,3.public
   private String name;
//    public mainemployee(){
//      age=45;
//      name="your-name-here";
//    }
 public mainemployee(String myName,int myId){
     age=myId;
     name=myName;
   }
  public String getName(){
    return name;
  }
   public void setName(String n){
    name=n;
   }
   public int getAge(){
    return age;
  }
   public void setAge(int x){
   age=x;
   }
}
public class Constructors {
    public static void main(String[] args) {
        mainemployee avi=new mainemployee("avinash",12);
              System.out.println(avi.getAge());

              System.out.println(avi.getName());
              avi.setName("hello");
              System.out.println(avi.getName());
    }
}
