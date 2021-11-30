package src;

public class Product implements Component {
    String productName;
    double itemCost;

    public Product(String name, double cost) {
        this.productName = name;
        this.itemCost = cost;
    }

    @Override
    public double getTotalCost() {
        return itemCost;
    }

    @Override
    public int getTotalInventoryCount() {
        return 1;
    }

    @Override
    public void showItems() {
        System.out.println(productName);
    }

    
}
