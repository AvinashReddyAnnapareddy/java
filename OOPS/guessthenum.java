// package OOPS;
// import java.util.*;
// class game{
//     int num;
//     int inputnum;
//     int noofguess=0;
//     game(){
//        Random rand=new Random();
//        num=rand.nextInt(100);
//     }
//     void takeuserinput(){
//         System.out.println("enter input num");
//         Scanner sc=new Scanner(System.in);
//         this.inputnum=sc.nextInt();
//         sc.close();
//     }
//     boolean iscorrectfunction(){
//             noofguess++;
//            if(num==inputnum){
//               System.out.format("the num is %d \n,noof guess %d",inputnum,noofguess);
//               return true;
//            }
//            if(num<inputnum){
//             System.out.println("input num is high");
//            }
//             if(num<inputnum){
//             System.out.println("input num is low");
//            }
//            return false;

//     }

// }
// public class guessthenum {
//     public static void main(String[] args) {
//         boolean b=false;
//         game g=new game();
//         while(!b){
//             g.takeuserinput();
//             b=g.iscorrectfunction();
//         }
//     }
// }
package OOPS;
import java.util.*;

class game {
    int num;
    int inputnum;
    int noofguess = 0;

    game() {
        Random rand = new Random();
        num = rand.nextInt(100);
    }

    void takeuserinput() {
        Scanner sc = new Scanner(System.in);//if i keep sc.close it won,t work so no use of it
        System.out.println("Enter your guess (0-99):");
        inputnum = sc.nextInt();
    }

    boolean iscorrectfunction() {
        noofguess++;
        if (num == inputnum) {
            System.out.format("Correct! The number is %d. Number of guesses: %d\n", inputnum, noofguess);
            return true;
        }
        if (num < inputnum) {
            System.out.println("Your guess is too high.");
        }
        if (num > inputnum) {
            System.out.println("Your guess is too low.");
        }
        return false;
    }
}

public class guessthenum {
    public static void main(String[] args) {
    
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.iscorrectfunction();
        }
       
    }
}