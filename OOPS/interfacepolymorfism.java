package OOPS;
interface mywifi{
 String[] getnetworks();
 void connecttonetwork(String network);
}
interface mycamera{
void takesnap();
void recordvideo();
private void greet(){
    System.out.println("Good morning");// private meth cannot be called directly so it initialized like this
}
default void record4kvideo(){
    greet();
   System.out.println("rercording 4k video....");
}
}
class mycellphone{
 void callnum(int phonenum){
        System.out.println("calling"+phonenum);
 }
void pickupnum(){
       System.out.println("conneting....");
}
}
class mysmartphone extends mycellphone implements mywifi,mycamera{
 public void takesnap(){
    System.out.println("taking snap");
 }
 public void recordvideo(){
    System.out.println("recording started");
 }
 public String[] getnetworks(){
    System.out.println("Getting list of networks");
    String[] networklist={ "avi","hi","jio"};
    return networklist;
 }
 public void connecttonetwork(String network){
    System.out.println("conneting to network"+network);
 }
 public void record4kvideo(){
   System.out.println("recording 4k video....and take snap");//overiding the default method and always this run first
}
}
public class interfacepolymorfism {
    public static void main(String[] args) {
        mycamera cam=new mysmartphone();
       // cam.getnetworks();error
        cam.record4kvideo();
        cam.takesnap();
    }
}
