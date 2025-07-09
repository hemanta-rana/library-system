import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static void main (String[] args) {

        ArrayList <Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // TODO show available options

        Book book1 = new Book(1, "python",10,"aaa");
        books.add(book1);
        Book book2 = new Book(2,"java",15,"bbb");
        books.add(book2);
        Book book3 = new Book(3, "atomic habits",5,"cc");
        books.add(book3);


        User user1 = new User("james","james1", "james@gmail.com");
        User user2 = new User("robert", "robert12", "robert23@gmail.com");

        //show options:  available books,  borrow book , return book , exit
        while (true) {
            System.out.println("Welcome to the library ");
            System.out.println("1. Show available books ");
            System.out.println("2. Borrow book   ");
            System.out.println("3. Return Book ");
            System.out.println("4. Exit ");


            System.out.println("Choose an option (1-4): ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("shows book list ");
                System.out.println("Name "+"BookNumber"+ "Quantity"+ "author");
                for (Book b: books){
                    System.out.println(b.getName()+"  "+b.getBookNumber()+"  "+b.getQuantity()+"   "+b.getAuthor());


                }

            } else if (option == 2) {
                System.out.println("Borrow books ");
                // TODO kun book borrow garne ho tyo chai dinu parxha
                // Todo borrow garera skaesi message deakhaune
                user1.borrowBook(user1, book1);

                System.out.println( book1.getQuantity());


            } else if (option == 3) {
                System.out.println("Return book ");

            } else if (option == 4) {
                System.out.println("exiting.........");
                break;
            } else {
                System.out.println("choose option from (1-4)");
            }
        }
    }





        // create some books and users
        // TODO figure out where to keep the books
        // TODO need to

    }
