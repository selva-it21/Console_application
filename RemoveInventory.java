import java.util.List;
import java.util.Scanner;
public class RemoveInventory {
    public List<Product> removeInventory(List<Product> products){
        Scanner sc = new Scanner(System.in);
        if(products.size() == 0){
            System.out.println("Nothing to Remove || update");
            return products;
        }
        System.out.print("Enter ProductId to remove : ");
        int removeId = sc.nextInt();
        if (removeId > products.size() || removeId <= 0) {
            System.out.println("Invaid ID");
            return products;
        }
        products.remove(removeId-1);
        return products;
    }
}
