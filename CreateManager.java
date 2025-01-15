import java.util.List;
import java.util.Scanner;

public class CreateManager {
    public Members CreateManager(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager Name : ");
        String userName = sc.next();
        System.out.print("Enter Manager Password : ");
        String password = sc.next();
        sc.nextLine();
        return new Members(userName, password, "manager");
    }
}
