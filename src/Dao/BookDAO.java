package Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import  Model.Book;

public class BookDAO {
    public  boolean insertBook(Book book){

        try {
            Connection conn = Dao.DatabaseConnection.connect();
            String query = "INSERT INTO book(bookName, Quantity, bookAuthor,bookNumber) VALUES (?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,book.getName());
            ps.setInt(2, book.getQuantity());
            ps.setString(3, book.getAuthor());
            ps.setInt(4,book.getBookNumber());

            if (ps.executeUpdate()> 0){

                return true;
            }else {
                System.out.println("failed to add ");
                return false;
            }


        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }

    }
    public boolean deleteBook(int bookid){
        try {
            Connection conn = Dao.DatabaseConnection.connect();
            String query = "DELETE FROM book WHERE bookid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,bookid);
            if(ps.executeUpdate() > 0){
                System.out.println("book deleted");
                return true;

            }else{
                System.out.println("Failed to delete");
                return  false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void updateBook(int bookNumber, int bookid){
        try {
            Connection conn = Dao.DatabaseConnection.connect();
            String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,bookNumber);
            ps.setInt(2, bookid);
            if(ps.executeUpdate() > 0){
                System.out.println("book updated");
            }else{
                System.out.println("Failed to update");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Book> allBook(){
        ArrayList<Book> bookList = new ArrayList<>();
        try {
            Connection conn = Dao.DatabaseConnection.connect();
            String query = "SELECT bookName, Quantity, bookAuthor, bookNumber FROM book";

            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet bookSet = ps.executeQuery();

            while (bookSet.next()){
                int bookNumber  = bookSet.getInt("bookNumber");
                String name = bookSet.getString("bookName");
                String author = bookSet.getString("bookAuthor");
                int quantity = bookSet.getInt("Quantity");

                Model.Book book = new Model.Book(bookNumber, name, quantity, author);
                bookList.add(book);
            }
            return bookList;

        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
