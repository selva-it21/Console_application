import java.util.List;
import java.util.Scanner;

public class ChangePassWord {
    public List<Members> change(List<Members> members, String userName, String password, Scanner sc){
        System.out.print("Enter new Password : ");
        // Scanner sc = new Scanner(System.in);
        String newPassword = sc.next();
        sc.nextLine();
        GetId getId = new GetId();
        int id = getId.GetId(members, userName);
        // System.out.println(id);
        members.get(id).password = newPassword;
        return members;
    }
}
