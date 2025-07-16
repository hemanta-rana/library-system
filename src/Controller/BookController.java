package Controller;

import Dao.BookDAO;
import Model.Book;

public class BookController {
    public static void storeBook(Book book){
        BookDAO bookDAO= new BookDAO();
        bookDAO.insertBook(book);
    }
    public static void deleteBook(int bookId){
        BookDAO.deleteBook(bookId);
    }
    public static void updateBook(int bookNumber, int bookID){
            BookDAO.updateBook(bookNumber, bookID);
    }
}
