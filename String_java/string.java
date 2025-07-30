package String_java;

public class string {
    public static void main(String a[]){
        String name = "Hello, World!";//useing string means using objects indirectly
        //String name= new String("Hello, World!");  
        name=name+"avi";
        System.out.println(name+": ?earth");
        System.out.println(name.charAt(3));
        System.out.println(name.concat("bolo world"));
        String s1= "avinash";
        String s2= "reddy";
        System.out.println(s1.compareTo(s2)); //s1<s2 = -ve, s1>s2 = +ve, s1==s2 = 0
        System.out.println(s1 == s2); //false
        StringBuffer sb=new StringBuffer("Hello, World!"); //mutable
        System.out.println(sb.capacity());
        sb.append("avi");
        sb.insert(0, "Hi, "); //insert at index 0
        sb.replace(0, 3, "Hey"); //replace from index 0 to 3
        sb.delete(0, 3); //delete from index 0 to 3
        String str=sb.toString(); //convert StringBuffer to String
        System.out.println(str);
    } 

}
