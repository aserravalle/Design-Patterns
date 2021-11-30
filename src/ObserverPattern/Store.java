package ObserverPattern;

import java.util.ArrayList;

public class Store {
    String name;
    ArrayList<Customer> customers;
    
    public Store(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void releaseProduct(String product) {
        System.out.println(product + "is now in the" + name);
        notify(product);
    }

    public void attach(Customer customer) {
        customers.add(customer);
    }

    public void detach(Customer customer) {
        customers.remove(customer);
    }

    public void notify(String product) {
        for(Customer c : customers) {
            if (c.getWishlist().contains(product)) {
                c.update(product);
            }
        }
    }
}
