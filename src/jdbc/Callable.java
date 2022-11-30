package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Callable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password  ="Root@123";
            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "insert into product values(1,'xyz')\n"+
                            "\tinsert into product values(10,'efg')\n"+
                            "\tinsert into product values(1,'ghk')\n";
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.execute();
            System.out.println("Updated "+callableStatement);
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
