import java.sql.*;
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
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO book(bookName, Quantity, bookAuthor,bookNumber) VALUES (?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,book1.getName());
            ps.setInt(2, book1.getQuantity());
            ps.setString(3, book1.getAuthor());
            ps.setInt(4,book1.getBookNumber());

            if (ps.executeUpdate()> 0){
                System.out.println("book added to database");
            }else {
                System.out.println("failed to add ");
            }


        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }



        User user1 = new User("james","james1", "james@gmail.com");
        User user2 = new User("robert", "robert12", "robert23@gmail.com");
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO user(name, username,contact) VALUES (?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,user1.getName());
            ps.setString(2, user1.getUsername());
            ps.setString(3, user1.getContact());

            if (ps.executeUpdate()> 0){
                System.out.println("user added to database");
            }else {
                System.out.println("failed to add ");
            }


        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }



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
                ArrayList<Book> bookList = new ArrayList<>();
                try {
                    Connection conn = DatabaseConnection.connect();
                    String query = "SELECT bookName, Quantity, bookAuthor, bookNumber FROM book";

                    PreparedStatement ps = conn.prepareStatement(query);
                    ResultSet bookSet = ps.executeQuery();

                    while (bookSet.next()){
                        int bookNumber  = bookSet.getInt("bookNumber");
                        String name = bookSet.getString("bookName");
                        String author = bookSet.getString("bookAuthor");
                        int quantity = bookSet.getInt("Quantity");

                        Book book = new Book(bookNumber, name, quantity, author);
                        bookList.add(book);
                    }

                }catch (SQLException | ClassNotFoundException e){
                    throw new RuntimeException(e);
                }

                for (Book b : bookList){
                    System.out.println("BookNumber "+b.getBookNumber()+"  bookName "+b.getName());

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
