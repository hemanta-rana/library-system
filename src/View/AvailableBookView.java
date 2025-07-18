package View;

import Controller.BookController;
import Dao.BookDAO;

import java.util.ArrayList;

public class AvailableBookView {

    public static void showAvailableBooks(){
        ArrayList<Model.Book> bookList = BookController.getBook();
        System.out.println("Available books ");
                for (Model.Book b : bookList){
                    System.out.println( "BookNumber "+b.getBookNumber()+"  bookName "+b.getName());

                }

    }
}
