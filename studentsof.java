class Student {
    String name;
    int age;
    int marks;
    }

public class studentsof {
    public static void main(String[] args){
        Student students[] = new Student[3];
        
        students[0] = new Student();
        students[0].name = "Alice";
        students[0].age = 20;
        students[0].marks = 85;

        students[1] = new Student();
        students[1].name = "Bob";
        students[1].age = 22;
        students[1].marks = 90;

        students[2] = new Student();
        students[2].name = "Charlie";
        students[2].age = 21;
        students[2].marks = 88;
       //for each loop or anhanced
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age + ", Marks: " + student.marks);
        }
        // Using a traditional for loop
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].name + ", Age: " + students[i].age + ", Marks: " + students[i].marks);
        }
    }
}
