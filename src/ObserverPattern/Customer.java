import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<String> wishlist;
    ArrayList<String> productsBought;

    public Customer(String name) {
        this.name = name;
        this.wishlist = new ArrayList<>();
        this.productsBought  = new  ArrayList<>();
    }

    public void update(String product) {
        wishlist.remove(product);
        System.out.println(name + " bought the " + product);
        productsBought.add(product);
    }

    public ArrayList<String> getWishlist() {
        return wishlist;
    }

    public void showStuffBought() {
        System.out.println(name + " got");
        for (String item : productsBought) {
            System.out.println(item);
        }
    }
}
