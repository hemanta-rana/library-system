package View;
import Controller.BookController;
import Controller.ViewController;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class MenuView {
    static ViewController viewController = new ViewController();
    public  static  void showMenuView(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the library ");
        System.out.println("1. Add a new books ");
        System.out.println("2. Show available books ");
        System.out.println("3. Borrow book   ");
        System.out.println("4. Return Book ");
        System.out.println("5. update book");
        System.out.println("6. Delete book");
        System.out.println("7. Exit ");
        boolean run = true;

        while (run){
            System.out.println("Choose an option (1-4): ");
            int option = input.nextInt();

            if (option < 0){
                System.out.println("Invalid  option ");
            } else {
                if (option == 1){
                    viewController.getAddBookView();
                } else if (option == 2){
                    viewController.getAvailableBooks();
                } else if (option == 3) {


                } else if (option == 4) {

                } else if (option == 5) {
                    viewController.getUpdateView();
                } else if (option == 6) {
                    viewController.getDeleteView();
                } else if (option== 7) {
                    run =false;
                }
            }
        }



    }
}

