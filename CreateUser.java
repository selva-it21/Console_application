import java.util.Scanner;

public class CreateUser {
    public Members creatUser(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter User Name : ");
            String userName = sc.next();
            System.out.print("Enter User Password : ");
            String password = sc.next();
            sc.nextLine();
            return new Members(userName, password, "user");
    }
}
