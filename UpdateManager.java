import java.util.List;
import java.util.Scanner;

public class UpdateManager {
    public List<Members> updateManager(List<Members> members){
        Scanner sc = new Scanner(System.in);
        if(members.size() == 1){
            System.out.println("Manager does't exist");
            return members;
        }
        System.out.print("Enter Manager id to update : ");
        int id = sc.nextInt();
        if(id == 0){
            System.out.println("This not manager");
            return members;
        }
        System.out.print("Enter Manager Name : ");
        String userName = sc.next();
        System.out.print("Enter Manager Password : ");
        String password = sc.next();
        sc.nextLine();
        members.get(id).userName = userName;
        members.get(id).password = password;
        return members;
    }
}
