import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while (resultSet.next()) {
                System.out.println("User ID: " + resultSet.getInt("id") +
                                   ", Name: " + resultSet.getString("name"));
            }

            // Closing the connection
            resultSet.close();
            statement.close();
            connection.close();
            
        } catch (SQLException e) {
            // Handle SQL exception
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
