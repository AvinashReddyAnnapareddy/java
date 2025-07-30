public class method1 {
    static void change(int a){
         a=98;
    }
     static void change(int arr[]){//in java we can call  method's with same name but different arguments or parameters
         arr[0]=98;
    }
     static int sum(int x,int ...arr){//varargs 
     //available as  int arr[];
     int result=x;
     for(int a:arr){
        result=result+a;
     }
     return result;
     }
     static int factorial(int x){
               if(x==0 || x==1){
                return 1;
               }
               else{
               return x*factorial(x-1);
     }
    }
    static int fabinnoci(int x){
        if(x==1){
            return 0;
        }
        else if(x==2){
            return 1;
        }
        else{
            return fabinnoci(x-1)+fabinnoci(x-2);
        }
    }
    public static void main(String[] args) {
        //case ;1 changing integer
        int x=45;
        change(x);
        System.out.println("The value of x is "+x);
        int marks[]={67,78,89,45,67};
        change(marks);
        System.out.println(marks[0]);
        System.out.println("the sum of 4 and 5 :"+sum( 4,4,5)); 
         System.out.println("the sum of 3,4 and 5 :"+sum( 3,3,4,5)); 
        int z=factorial(5);
        System.out.println("factorial of 5 is:"+z);
        int y=fabinnoci(5);
        System.out.println("fabinnoci at 5th place is:"+y);
    }
}
