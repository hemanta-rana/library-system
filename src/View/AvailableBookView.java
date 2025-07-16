package View;

import Dao.BookDAO;

import java.util.ArrayList;

public class AvailableBookView {

    public static void showAvailableBooks(){
        ArrayList<Model.Book> bookList = BookDAO.allBook();

                for (Model.Book b : bookList){
                    System.out.println( "BookNumber "+b.getBookNumber()+"  bookName "+b.getName());

                }

    }
}
