package Controller;

import Dao.BookDAO;
import Model.Book;
import com.mysql.cj.xdevapi.DeleteStatement;

import java.util.ArrayList;

public class BookController {
    private BookDAO bookDAO = new BookDAO();
    public  boolean storeBook(Book book){

        if ( bookDAO.insertBook(book)){
            return true;
        } else {
            return false;
        }

    }
    public  boolean deleteBook(int bookId){

        if (bookDAO.deleteBook(bookId)){
            return true;
        }else{
            return false;
        }

    }
    public static void updateBook(int bookNumber, int bookID){
            BookDAO.updateBook(bookNumber, bookID);
    }
    public static ArrayList<Book> getBook(){
        return BookDAO.allBook();
    }
}
