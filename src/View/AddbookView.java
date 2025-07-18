package View;

import java.util.Scanner;

import Controller.BookController;
import Model.Book;

public class AddbookView {
    BookController  bookController = new BookController();
    public void AddBookView(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the book name : ");
        String bookName = input.nextLine();
        System.out.println("Enter the bookNumber : ");
        int bookNumber = input.nextInt();
        System.out.println("Enter the book Quantity : ");
        int bookQuantity = input.nextInt();
        System.out.println("Enter the book author  : ");
        String  bookAuthor = input.nextLine();

        Book book = new Book(bookNumber, bookName, bookQuantity, bookAuthor);
            if (bookController.storeBook(book)){
                System.out.println("Successfully added ! ");
            } else {
                System.out.println("Failed to add ");
            }

    }
}
