import java.util.ArrayList;

public class arraylist{
public static void main(String[] args) {
    ArrayList<Integer> l1 =new ArrayList<>();
    ArrayList<Integer> l2 =new ArrayList<>(5);
    l2.add(13);
    l2.add(21);
    l2.add(30);
    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);
    l1.add(5);
    l1.add(0,6);
    l1.addAll(0,l2);
    System.out.println(l1.contains(1));
    for(int i=0;i<l1.size();i++){
         System.out.println(l1.get(i));
    }
}
}