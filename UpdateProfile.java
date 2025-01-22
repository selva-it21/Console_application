import java.util.List;
import java.util.Scanner;

public class UpdateProfile {
    public List<Members> change(List<Members> members, String userName, String password, Scanner sc){
        System.out.print("Enter new UserName : ");
        // Scanner sc = new Scanner(System.in);
        String newUserName = sc.next();
        sc.nextLine();
        GetId getId = new GetId();
        int id = getId.GetId(members, userName);
        // System.out.println(id);
        members.get(id).userName = newUserName;
        return members;
    }
}
