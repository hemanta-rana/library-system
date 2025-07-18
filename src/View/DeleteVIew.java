package View;

import Controller.BookController;

import java.util.Scanner;

public class DeleteVIew {
    BookController bookController = new BookController();
    public  void showDeleteView(){
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the book id to delete: ");
                int bookid = scanner.nextInt();

        if( bookController.deleteBook(bookid)){
            System.out.println("deleted ");
        } else {
            System.out.println("failed to delete");
        }
        }

}
