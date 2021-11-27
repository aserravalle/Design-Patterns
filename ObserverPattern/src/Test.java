public class Test {
    public static void main(String[] args) {

        String iPhone12 = "iPhone 12";
        String appleWatch6 = "Apple Watch 6";
        String airpodsPro = "Air pods pro";
        String macbookPro = "Mac Book Pro";

        Store appleStore = new Store("Apple Store");
        Customer shak = new Customer("shak");
        Customer tanvee = new Customer("tanvee");
        Customer kyra = new Customer("kyra");
        
        appleStore.attach(shak);
        appleStore.attach(kyra);
        appleStore.attach(tanvee);

        shak.wishlist.add(iPhone12);
        shak.wishlist.add(macbookPro);

        kyra.wishlist.add(appleWatch6);
        kyra.wishlist.add(macbookPro);

        tanvee.wishlist.add(airpodsPro);
        tanvee.wishlist.add(macbookPro);

        appleStore.releaseProduct(iPhone12);
        appleStore.releaseProduct(appleWatch6);
        appleStore.releaseProduct(airpodsPro);
        appleStore.releaseProduct(macbookPro);

        assert(shak.getWishlist().isEmpty());
        assert(kyra.getWishlist().isEmpty());
        assert(tanvee.getWishlist().isEmpty());

        shak.showStuffBought();
        System.out.println("============================================================");
        kyra.showStuffBought();
        System.out.println("============================================================");
        tanvee.showStuffBought();
    }
    
}
