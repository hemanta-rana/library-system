package Controller;

import View.AddbookView;
import View.AvailableBookView;
import View.DeleteVIew;
import View.UpdateBookVIew;

public class ViewController {
    AddbookView addbookView = new AddbookView();
    DeleteVIew deleteVIew = new DeleteVIew();
    public  void getAddBookView(){
        addbookView.AddBookView();
    }
    public  void getAvailableBooks(){
        AvailableBookView.showAvailableBooks();
    }
    public  void getUpdateView(){
        UpdateBookVIew.showUpdateView();
    }
    public void getDeleteView(){
        deleteVIew.showDeleteView();
    }


}
