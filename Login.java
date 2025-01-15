import java.util.List;
import java.util.Scanner;

public class Login {
    List<Members> members;
    public void login(List<Members> members){
        Scanner sc = new Scanner(System.in);
        // operation.display(role, sc);
        this.members = members;
        System.out.print("Enter UserName : ");
        String userName = sc.next();
        System.out.print("Enter Password : ");
        String password = sc.next();
        sc.nextLine();
        String role = null;
        // String role = log.login(members, sc);
        for (Members mem : members) {
            if(mem.userName.equalsIgnoreCase(userName) && mem.password.equals(password)){
                role = mem.role;
            }
        }
        if(role != null){
            System.out.println("Logged in Successfull for " + role);
            Operations operation = new Operations();
            operation.operation(userName,password,members,role, sc);
        }
        else{
            System.out.println("Invalid Login. Please try again.");
            login(members);
        }
        // return role;
    }
    public void afterLogout(List<Members> members){
        Login log = new Login();
        System.out.println("After logout called");
        log.login(members);
    }

}
