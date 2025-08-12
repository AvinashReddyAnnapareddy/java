package OOPS;
class myemployee{
   private int age;//1.defult,2.protected,3.public
   private String name;
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
public class getterssetters {
    public static void main(String[] args) {
          myemployee avi=new myemployee();
        // employee jon=new employee();
        // avi.age=67;
        // avi.name="avinash";due to privzate assccee modifier
        avi.setName("aviansh");
      System.out.println(avi.getName());
      
    }
}
