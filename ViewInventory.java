import java.util.List;

public class ViewInventory {
    public void displayProducts(List<Product> products){
        if(products.size() < 1){
            System.out.println("Nothing to remove || show || update");
            return;
        }
        for (int i = 0; i < products.size(); i++) {
            Product pro = products.get(i);
            System.out.println("Product Id : " + (i+1) +  ", Product Name : " +  pro.productName + ", Product price : " + pro.productPrice + ", Product Quantity : " + pro.productQuantity);
            
        }
    }
    public void displayManager(List<Members> members){
        if(members.size() < 1) System.out.println("No managers");
        for (int i = 1; i < members.size(); i++) {
            System.out.println("Manager id : " + i + ", Manager Name : " + members.get(i).userName);
        }
    }
}
