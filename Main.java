import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login log = new Login();
        List<Members> members = new ArrayList<>();
        members.add(new Members("admin","admin", "admin"));
        log.login(members);
        // for (Members members2 : members) {
        //     System.out.println("User Name : " + members2.password + ", Role : " + members2.role);
        // }
    }
}