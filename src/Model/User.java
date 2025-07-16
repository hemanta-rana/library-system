package Model;

public class User {
    private String name ;
    private String username ;
    private String contact;


    public User(String name, String username, String contact){
        this.name = name;
        this.username = username;
        this.contact = contact;

    }

//  TODO  behavior -> check registered, borrow, return

    public void isRegistered(){

    }
    public void returnBook(){

    }
    public  void borrowBook(User user, Book book){
        if (book.getQuantity() >0 ){
            BookRecords record = new BookRecords(user , book);
            book.decreaseQuantity();

        }else {
            System.out.println("Model.Book not available ");
        }
    }



    // getter
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getContact(){
        return contact;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setContact(String contact){
        this.contact = contact;
    }



}
