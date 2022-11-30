package jdbc;

import java.sql.*;

public class ReadFromTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=null;
        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Root@123";
             connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from product");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("product_id")+"/t "+resultSet.getString("product_name"));
            }
            } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            connection.close();
        }

    }
}
