package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = null;
        try {
            String url="jdbc:mysql://localhost:3306/csj25";
            String username="root";
            String password="Root@123";
            connection = DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            int ex = statement.executeUpdate("insert into product values(1,'abc')");
            System.out.println("Rows updated "+ex);

        } catch (SQLException e) {
            System.out.println("execution while connecting to the database");
        }
        finally {
            connection.close();
        }
    }
}
