import java.util.List;
import java.util.Scanner;

public class Operations {
    void show(String role){
        if(role.equals("admin")){
            System.out.println("1.Change Password");
            System.out.println("2.Update Profile");
            System.out.println("3.Create Manager");
            System.out.println("4.Update Manager");
            System.out.println("5.Remove Manager");
            System.out.println("6.Add inventory");
            System.out.println("7.Remove inventory");
            System.out.println("8.Update inventory");
            System.out.println("9.View inventory");
            System.out.println("10.Log out");
        }
        else if(role.equals("manager")){
            System.out.println("2.Update Profile");
            System.out.println("6.Add inventory");
            System.out.println("7.Remove inventory");
            System.out.println("8.Update inventory");
            System.out.println("9.View inventory");
            System.out.println("10.Log out");
        }
        else if(role.equals("user")){
            System.out.println("2.Update Profile");
            System.out.println("6.Add inventory");
            System.out.println("7.Remove inventory");
            System.out.println("9.View inventory");
            System.out.println("10.Log out");
        }
    }
    void operation(String userName, String password, List<Members> members, String role, Scanner sc){
        Login log = new Login();
        CreateManager manager = new CreateManager();

        int operationNumber = 0;
        show(role);
        System.out.print("Enter operataion number : ");
        boolean exitFlag = true;
        ChangePassWord changeObj = new ChangePassWord();
        while (exitFlag) {
            operationNumber = sc.nextInt();
            switch (operationNumber) {
                case 1:
                    members = changeObj.change(members, userName, password, sc);
                    log.login(members);
                    exitFlag = false;
                    break;
            
                case 2:
                    exitFlag = false;
                    break;
            
                case 3:
                    Members m1 = manager.CreateManager();
                    members.add(m1);
                    show(role);
                    break;
            
                case 4:
                    exitFlag = false;                    
                    break;
            
                case 5:
                    exitFlag = false;               
                    break;
            
                case 6:
                    exitFlag = false;    
                    break;
            
                case 7:
                    exitFlag = false;    
                    break;
            
                case 8:
                    exitFlag = false;    
                    break;
            
                case 9:
                    exitFlag = false;    
                    break;
            
                case 10:
                    exitFlag = false;
                    Logout.logout(members);
                    break;
    
                default:
                    System.out.print("Please Enter valid operation number : ");
                    exitFlag = true;
                    break;
            }
        }
        // return members;
    }
    
}
