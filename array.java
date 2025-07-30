public class array {
     public static void main(String[] args){
          int num[]={10,20,30,40,50};
          // Printing the array elements using for loop
            for(int i=0;i<num.length;i++){
                 System.out.println(num[i]);
            }
          // Printing the array elements using for-each loop
            for(int element : num){
                 System.out.println(element);
            }
     }
}
