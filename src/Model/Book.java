package Model;

public class Book {
//    attributes -> book number, name, quantity, author

    private  int bookNumber ;
    private  String name ;
    private  int quantity ;
    private  String author;


    public Book(int bookNumber, String name, int quantity, String author){
        this.bookNumber = bookNumber;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
    }

//    behaviour -> increase quantity, decrease quantity
    public  void increaseQuantity(){
        this.quantity++;
    }

    public void decreaseQuantity (){
        this.quantity--;
    }



//    getter and settter
    public int getBookNumber(){
        return  bookNumber;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getAuthor(){
        return author;
    }

    public void setName(String name){
        this.name= name;
    }
    public void setBookNumber(int bookNumber){
        this.bookNumber = bookNumber;
    }
    public  void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setAuthor(String author){
        this.author = author;
    }

}
