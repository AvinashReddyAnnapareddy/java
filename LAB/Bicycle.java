package LAB;

public class Bicycle {
    int Gear;
    double speed;
    public void incrementSpeed(int val){
       speed = speed + val;
    }
    public void decrementSpeed(int val){
       speed = speed - val;
    }
    public Bicycle(int Gear,double speed){
     this.Gear = Gear;
     this.speed = speed;
    }
    public static void main(String args[]){
        Bicycle myBike = new Bicycle(3, 15);
        myBike.incrementSpeed(10);
        myBike.decrementSpeed(5);
        System.out.println();

        MountainBike myMountainBike = new MountainBike(5, 10, 25);
        
        
        myMountainBike.setSeatHeight(30);
        
        myMountainBike.incrementSpeed(15);
        myMountainBike.decrementSpeed(8);
    }
}
class MountainBike extends Bicycle {
  int seatHeight;
  public MountainBike(int Gear,double speed,int setHeight){
     super(Gear, speed);
     this.seatHeight = setHeight;
  }
     public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
     }
} 
