package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBatch {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Root@123";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            int query = statement.executeUpdate("insert into product values(2,'pqr')");
            int query1 = statement.executeUpdate("insert into product values(3,'xyz')");
            int query2 = statement.executeUpdate("insert into product values(4,'lmn')");

            System.out.println("Row updated "+query+"/t"+query1+"/t"+query2);
            connection.close();

            } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}