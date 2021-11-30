package StrategyPattern;

public class MeleeAttack implements AttackMethod {
    String weapon;

    public MeleeAttack(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println("Striking with " + weapon);

    }
    
}
