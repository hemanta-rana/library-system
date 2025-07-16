package View;

import Controller.BookController;
import Dao.BookDAO;

import java.util.Scanner;

public class UpdateBookVIew {

    public static void showUpdateView(){
        Scanner scanner = new Scanner(System.in);
                 System.out.println("Enter book id: ");
                int bookid = scanner.nextInt();
                System.out.println("Enter book Number: ");
                int bookNumber = scanner.nextInt();

        BookDAO.updateBook(bookNumber,bookid);
    }


}
