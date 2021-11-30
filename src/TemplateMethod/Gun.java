public class Gun extends Weapon {

    @Override
    public void wield() {
        System.out.println("Holding a gun");
    }

    @Override
    public void attack() {
        System.out.println("Shooting a gun");
    }

    @Override
    public void putAway() {
        System.out.println("Holstering a gun");
    }
    
}
