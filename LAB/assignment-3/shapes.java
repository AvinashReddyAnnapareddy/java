interface shape{
    void area();
    void perimeter();
}
class circle implements shape{
 double radius;
   circle(double radius){
   this.radius=radius;
   }
 public void area(){
    System.out.println("Area of circle is:"+3.14*radius*radius);
 }
  public void perimeter(){
    System.out.println("Area of circle is:"+2*3.14*radius);
 }
}
class rectangle implements shape{
    double lenght;
     double width;
    rectangle(double lenght,double width){
          this.lenght=lenght;
          this.width=width;
    }
 public void area(){
    System.out.println("Area of circle is:"+lenght*width);
 }
  public void perimeter(){
    System.out.println("Area of circle is:"+2*(lenght+width));
 }

}
public class shapes {
    public static void main(String[] args) {
         shape circle = new circle(5);
         shape rectangle = new rectangle(4, 6);
          circle.area();
        circle.perimeter();
        rectangle.area();
        rectangle.perimeter();
    }
}
