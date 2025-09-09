

import java.util.Scanner;

public class student{
    int rollno;
    int Height;
   String name;
    // Constructor to initialize rollno and Height
    public student(int rollno, int Height,String name) {
        this.rollno = rollno;
        this.Height = Height;
        this.name=name;
    }

    public  void display(){
        System.out.println("Rollno"+rollno);
         System.out.println("Height"+Height);
    }
    static double avgheight(student arr[]){
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (student s : arr) {
            sum += s.Height;
        }
        return (double) sum / arr.length;
    }
      public static void main(String[] args) {
             Scanner s =new Scanner(System.in);       
                int a=s.nextInt();
            student  arr[]=new student[a];
                for(int i=0;i<a;i++){
                       int hei = s.nextInt();
                       int roll=s.nextInt();
                       s.nextLine();
                       String name=s.nextLine();
                       arr[i]=new student(roll,hei,name);
                }
           double avg=avgheight(arr);
           System.out.println(avg);
           arr[1].display();
                  s.close();
      }
}
