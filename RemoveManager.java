import java.util.List;
import java.util.Scanner;

public class RemoveManager {
    public List<Members> removeManager(List<Members> members){
        if(members.size() == 1){
            System.out.println("Manager does't exist");
            return members;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ManagerId to remove : ");
        int removeId = sc.nextInt();
        if (removeId > members.size()) {
            System.out.println("Invalid id----:");
            return members;
        }
        if(members.get(removeId).role.equals("manager"))
            members.remove(removeId);
        else return members;
        System.out.println("Manager removed Successfully");
        return members;
    }
}
