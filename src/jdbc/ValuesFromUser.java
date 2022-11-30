package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class ValuesFromUser {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the product id and product name");
            int product_id=scanner.nextInt();
            String product_name=scanner.next();

            String url="jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Root@123";
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?)");
            preparedStatement.setInt(1,product_id);
            preparedStatement.setString(2,product_name);
            preparedStatement.executeUpdate();
            System.out.println("updated "+preparedStatement);
            connection.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
