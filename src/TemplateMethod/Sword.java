public class Sword extends Weapon {

    @Override
    public void wield() {
        System.out.println("Holding a sword");
    }

    @Override
    public void attack() {
        System.out.println("Stabbing with a sword");
    }

    @Override
    public void putAway() {
        System.out.println("Sheathing the sword");
    }
    
}
