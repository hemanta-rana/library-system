import View.MenuView;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static void main (String[] args) {

        MenuView.showMenuView();
//
//        ArrayList <Model.Book> books = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        // TODO show available options
//
//        Model.Book book1 = new Model.Book(1, "python",10,"aaa");
//        books.add(book1);
//        Model.Book book2 = new Model.Book(2,"java",15,"bbb");
//        books.add(book2);
//        Model.Book book3 = new Model.Book(3, "atomic habits",5,"cc");
//        books.add(book3);
//
//
//
//
//        Model.User user1 = new Model.User("james","james1", "james@gmail.com");
//        Model.User user2 = new Model.User("robert", "robert12", "robert23@gmail.com");
//        try {
//            Connection conn = Dao.DatabaseConnection.connect();
//            String query = "INSERT INTO user(name, username,contact) VALUES (?,?,?)";
//
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1,user1.getName());
//            ps.setString(2, user1.getUsername());
//            ps.setString(3, user1.getContact());
//
//            if (ps.executeUpdate()> 0){
//                System.out.println("user added to database");
//            }else {
//                System.out.println("failed to add ");
//            }
//
//        }catch (SQLException | ClassNotFoundException e){
//            throw new RuntimeException(e);
//        }
//
//
//
//        //show options:  available books,  borrow book , return book , exit
//        while (true) {
//
//
//
//
//            int option = scanner.nextInt();
//
//            if (option == 1) {
//                System.out.println("shows book list ");
//              
//
//            } else if (option == 2) {
//                System.out.println("Borrow books ");
//                // TODO kun book borrow garne ho tyo chai dinu parxha
//                // Todo borrow garera skaesi message deakhaune
//                user1.borrowBook(user1, book1);
//
//                System.out.println( book1.getQuantity());
//
//
//            } else if (option == 3) {
//                System.out.println("Return book ");
//
//            } else if (option == 4) {
//                System.out.println("exiting.........");
//                break;
//            } else if (option == 5) {
//                System.out.println("working on exiting");
//
//
//
//
//            }else if (option== 6){

//    }


        // create some books and users
        // TODO figure out where to keep the books
    }    // TODO need to

    }
