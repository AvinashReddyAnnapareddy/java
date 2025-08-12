package LAB;

public class Booktest {
 static class Book{
    private int publish;
    double price;
    String title;
    String author;

//defult constructor
public Book(){
     publish=1;
     price=0;
     title="the title";
     author="the author";
}
//parameterized
public Book(String tit,String author,int publish,int price){
            title = tit;
            this.author = author;
            this.publish = publish;
            this.price = price;
}
public void display(){//it is object belong to main class 
        System.out.println(title+author+publish+price);

  }
 }
    public static void main(String[] args) {
     Book book1 = new Book();
     Book book2 = new Book("Game of Trones","George martin",2005,200);
     book1.display();
     book2.display();
    }
}
