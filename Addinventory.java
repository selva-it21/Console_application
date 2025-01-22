import java.util.Scanner;

public class AddInventory {
    public Product AddInventory(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name : ");
        String productName = sc.next();
        System.out.print("Enter Product Price : ");
        int productPrice = sc.nextInt();
        System.out.print("Enter Product Quantity : ");
        int productQuantity = sc.nextInt();
        sc.nextLine();
        return new Product(productName, productPrice, productQuantity);
    }
}
