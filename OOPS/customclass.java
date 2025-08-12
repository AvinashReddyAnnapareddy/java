package OOPS;
class employee{
    int age;
    String name;
    public void display(){
          System.out.print("age :"+age+"\n");
          System.out.println("name:"+name);
    }
    public int getage(){
          return age;
    }
}

public class customclass {
    public static void main(String[] args) {
        employee avi=new employee();
        employee jon=new employee();
        avi.age=67;
        avi.name="avinash";
        avi.display();
        jon.age=23;
        jon.name="kjddffvli";
        int ag=avi.getage();
        System.out.println(ag);
    }
}
