package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = null ;
        try {
            String url="jdbc:mysql://localhost:3306/csj25";
            String username="root";
            String password="Root@123";
             connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            boolean isTableCreated = statement.execute("create table product(product_id int, product_name varchar(50))");
            System.out.println("Table created "+isTableCreated);
        } catch (SQLException sqlException) {
            System.out.println("execution while connecting to the database");
        }finally {
            connection.close();
        }
    }
}
