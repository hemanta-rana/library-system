package View;

import java.util.Scanner;

import Controller.BookController;
import Model.Book;

public class AddbookView {
    public  static  void AddBookView(){
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

        BookController.storeBook(book);
    }
}
