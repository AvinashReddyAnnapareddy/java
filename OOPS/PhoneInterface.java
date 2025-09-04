package OOPS;

interface MyWifi {
   String[] getNetworks();
   void connectToNetwork(String network);
}

interface MyCamera {
   void takeSnap();
   void recordVideo();
   private void greet() {
      System.out.println("Good morning");
   }
   default void record4KVideo() {
      greet();
      System.out.println("Recording 4K video...");
   }
}

class MyCellPhone {
   void callNum(int phoneNum) {
      System.out.println("Calling " + phoneNum);
   }
   void pickUpNum() {
      System.out.println("Connecting...");
   }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
   public void takeSnap() {
      System.out.println("Taking snap");
   }
   public void recordVideo() {
      System.out.println("Recording started");
   }
   public String[] getNetworks() {
      System.out.println("Getting list of networks");
      String[] networkList = { "avi", "hi", "jio" };
      return networkList;
   }
   public void connectToNetwork(String network) {
      System.out.println("Connecting to network " + network);
   }
   public void record4KVideo() {
      System.out.println("Recording 4K video... and take snap");
   }
}

public class PhoneInterface {
   public static void main(String[] args) {
      MySmartPhone ms = new MySmartPhone();
      String[] ar = ms.getNetworks();
      for (String c : ar) {
         System.out.println(c);
      }
   }
}
