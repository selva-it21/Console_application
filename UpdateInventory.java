import java.util.List;
import java.util.Scanner;

public class UpdateInventory {
    public List<Product> updateInventory(List<Product> products){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product id to update : ");
        int id = sc.nextInt();
        if(id <= 0 && id > products.size() && products.size() < 1){
            System.out.println("Invalid product id");
            // id = sc.nextInt();
            return products;
        }
        id = id-1;
        System.out.print("Enter product Name : ");
        String newProductName = sc.next();
        System.out.print("Enter product Price : ");
        int newProductPrice = sc.nextInt();
        System.out.print("Enter product Quantity : ");
        int newProductQuantity = sc.nextInt();
        sc.nextLine();
        products.get(id).productName = newProductName;
        products.get(id).productQuantity = newProductQuantity;
        products.get(id).productPrice = newProductPrice;
        return products;
    }
}
