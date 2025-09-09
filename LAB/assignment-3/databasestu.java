
import java.util.HashMap;
import java.util.Scanner;
class student{
    int studentId;
    String firstName;
    String lastName;
   public student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void display() {
    System.out.println("ID: " + studentId + ", Name: " + firstName + " " + lastName);
}

}

public class databasestu { 
    public static void removeStudent(HashMap<Integer,student>db, int id) {
        db.remove(id);
    }
    public static student getStudent(HashMap<Integer, student> db, int id) {
        return db.get(id);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
          int a=s.nextInt();
        student arr[]=new student[a];
      for(int i=0;i<a;i++){
        int id=s.nextInt();
        s.nextLine();
        String first=s.nextLine();
        String last=s.nextLine();
        arr[i]=new student(id, first, last);
      }
      //transfer array to hashmap
      HashMap<Integer,student>db=new HashMap<>();
      for(student i:arr){
        db.put(i.studentId,i);
      }
      System.out.println("Get student with ID 1:");
        student x = getStudent(db, 1);
      if (x != null) x.display();
      System.out.println("Remove student with ID 2.");
        removeStudent(db, 2);



          s.close();
    }
}
