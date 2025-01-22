import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {
    List<Product> products = new ArrayList<>();
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
            System.out.println("10.Create User");
            System.out.println("11.Log out");
            System.out.println("12.Exit Application");
        }
        else if(role.equals("manager")){
            System.out.println("2.Update Profile");
            System.out.println("6.Add inventory");
            System.out.println("7.Remove inventory");
            System.out.println("8.Update inventory");
            System.out.println("9.View inventory");
            System.out.println("11.Log out");
            System.out.println("12.Exit Application");
        }
        else if(role.equals("user")){
            System.out.println("2.Update Profile");
            System.out.println("6.Add inventory");
            System.out.println("7.Remove inventory");
            System.out.println("9.View inventory");
            System.out.println("11.Log out");
        }
    }
    
    void operation(String userName, String password, List<Members> members, String role, Scanner sc){
        Login log = new Login();
        CreateManager manager = new CreateManager();
        UpdateProfile profile = new UpdateProfile();
        AddInventory inventory = new AddInventory();
        ViewInventory view = new ViewInventory();
        UpdateInventory update = new UpdateInventory();
        RemoveManager removeManager = new RemoveManager();
        RemoveInventory removeInventory = new RemoveInventory();
        UpdateManager updateManager = new UpdateManager();
        CreateUser user = new CreateUser();
        int operationNumber = 0;
        show(role);
        boolean exitFlag = true;
        ChangePassWord changeObj = new ChangePassWord();
        while (exitFlag) {
            System.out.print("Enter operataion number : ");
            operationNumber = sc.nextInt();
            switch (operationNumber) {
                case 1:
                    members = changeObj.change(members, userName, password, sc);
                    log.login(members);
                    show(role);
                    exitFlag = false;
                    break;
            
                case 2:
                    members = profile.change(members, userName, password, sc);
                    show(role);
                    // exitFlag = false;
                break;
            
                case 3:
                    Members m1 = manager.CreateManager();
                    members.add(m1);
                    System.out.println("Manager added successfully");
                    show(role);
                    break;
                    
                    case 4:
                    view.displayManager(members);
                    members = updateManager.updateManager(members);
                    show(role);
                    // exitFlag = false;            
                    break;
                    
                    case 5:
                    view.displayManager(members);
                    members = removeManager.removeManager(members);
                    show(role);
                    // exitFlag = false;               
                    break;
            
                case 6:
                    Product pro = inventory.AddInventory();
                    products.add(pro);
                    System.out.println("Product Added Successfully");
                    // exitFlag = false;    
                    show(role);
                    break;
            
                case 7:
                    view.displayProducts(products);
                    products = removeInventory.removeInventory(products);
                    show(role);
                    // exitFlag = false;    
                    break;
            
                case 8:
                    view.displayProducts(products);
                    products = update.updateInventory(products);
                    
                    show(role);
                    // exitFlag = false;    
                    break;
            
                case 9:
                    view.displayProducts(products);
                    show(role);
                    // exitFlag = false;    
                    break;

                case 10:
                    Members user1 = user.creatUser();
                    members.add(user1);
                    break;

                case 11:
                    Logout.logout(members);
                    exitFlag = false;
                    break;
                
                case 12:
                    exitFlag = true;
                    return;

                default:
                    // System.out.print("Please Enter valid operation number : ");
                    exitFlag = true;
                    break;
            }
        }
    }
    
}
