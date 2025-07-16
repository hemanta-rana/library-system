package Controller;

import View.AddbookView;
import View.AvailableBookView;
import View.DeleteVIew;
import View.UpdateBookVIew;

public class ViewController {
    public static void getAddBookView(){
        AddbookView.AddBookView();
    }
    public static void getAvailableBooks(){
        AvailableBookView.showAvailableBooks();
    }
    public static void getUpdateView(){
        UpdateBookVIew.showUpdateView();
    }
    public static void getDeleteView(){
        DeleteVIew.showDeleteView();
    }

}
