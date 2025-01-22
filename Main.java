import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login log = new Login();
        List<Members> members = new ArrayList<>();
        members.add(new Members("admin","admin", "admin"));
        storeMembersDataInDatabase(members);
        log.login(members);
        
    }

    public static void storeMembersDataInDatabase(List<Members> members) {
        String jdbcURL = "jdbc:mysql://localhost:3306/mydb"; // MySQL connection string
        String jdbcUsername = "root"; // MySQL username
        String jdbcPassword = "root"; // MySQL password
    
        String insertSQL = "INSERT INTO Members (username, password, role) VALUES (?, ?, ?)";
    
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            
            for (Members member : members) {
                // Access the public fields directly
                preparedStatement.setString(1, member.userName);
                preparedStatement.setString(2, member.password);
                preparedStatement.setString(3, member.role);
                preparedStatement.executeUpdate();
            }
    
            System.out.println("Data successfully inserted into the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}