package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteFromTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Root@123";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement= connection.createStatement();

            String query="Delete from product where product_id=3";
            int q=statement.executeUpdate(query);
            System.out.println("ID deleted "+q);
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
