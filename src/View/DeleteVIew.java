package View;

import Controller.BookController;

import java.util.Scanner;

public class DeleteVIew {
    public static void showDeleteView(){
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the book id to delete: ");
                int bookid = scanner.nextInt();

                 BookController.deleteBook(bookid);
        }

}
