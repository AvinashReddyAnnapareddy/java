

public class spacecraft {
    String name;
    double fuelCapacity;
    public spacecraft( String name,double fuelCapacity){
            this.name=name;
            this.fuelCapacity=fuelCapacity;
    }
     public static void main(String[] args) {
        starship z=new starship(200, 0, null, 0);
         z.getwrapspeed();
     }
}
class spaceship extends spacecraft{
    int crewsize;
    public spaceship(int crewsize,String name,double fuelCapacity){
            super(name, fuelCapacity);
            this.crewsize=crewsize;
    }
}
class starship extends spaceship{
    double warpSpeed;
    public starship(double warpSpeed,int crewsize,String name,double fuelCapacity){
          super(crewsize, name, fuelCapacity);
          this.warpSpeed=warpSpeed;
    }
     int     getwrapspeed(){
        return warpSpeed;
    }
}