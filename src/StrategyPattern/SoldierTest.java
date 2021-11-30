public class SoldierTest {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier("Samurai Jack", new MeleeAttack("katana"), new ShieldDefence("Kite Shield"));
        Soldier soldier2 = new Soldier("Hawkeye", new RangeAttack("crossBow"), new WallDefence("Archer Tower"));

        System.out.println("Fight!");
        soldier1.attack();
        soldier2.block();
        soldier2.attack();
        soldier1.block();
        soldier1.attack();
        soldier2.attack();
        System.out.println("soldier 2 won");
        
    }
}
