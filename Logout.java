import java.util.List;
import java.util.Scanner;

public class Logout {
    public static void logout(List<Members> members){
        Login log = new Login();
        System.out.println("Successfully logged out ------ !");
        log.afterLogout(members);
    }
}
