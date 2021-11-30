package TemplateMethod;

public class WeaponTest {
    public static void main(String[] args) {
        Weapon weapon;

        System.out.println("===========");
        weapon = new Sword();
        weapon.wield();
        weapon.attack();
        weapon.putAway();
        
        System.out.println("===========");
        weapon = new Gun();
        weapon.wield();
        weapon.attack();
        weapon.putAway();
    }
}
