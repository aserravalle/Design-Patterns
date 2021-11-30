package src;



public class BoxTest {
    public static void main(String[] args) {
        Product charger = new Product("charger", 90.00);
        Product screenProtector = new Product("screen protector", 20.00);
        Product phone = new Product("iPhone", 2130);
        Product headphones =  new Product("Beats Studio", 1100);
        Box phoneBox = new Box("iPhoneBox");
        Box headphoneBox = new Box ("headphones box");
        headphoneBox.addItem(headphones);

        phoneBox.addItem(charger);
        phoneBox.addItem(screenProtector);
        phoneBox.addItem(phone);
        phoneBox.addItem(headphoneBox);

        assert(headphoneBox.getTotalCost() == 1100);
        assert(headphoneBox.getTotalInventoryCount() == 1);
        assert(phoneBox.getTotalCost() == 3340);
        assert(phoneBox.getTotalInventoryCount() == 4);

        phoneBox.showItems();

    }
}
