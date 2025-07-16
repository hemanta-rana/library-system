package Model;

public class BookRecords {
    private User user;
    private Book book;
    private String date;
    private boolean isReturned;

    public BookRecords(User user, Book book){
        this.user = user;
        this.book = book;
        this.date = "date"; // todo jati bekea add gareko tyo date hunu parxa
        this.isReturned = false;
    }

    public User getUser(){
        return user;
    }




}

