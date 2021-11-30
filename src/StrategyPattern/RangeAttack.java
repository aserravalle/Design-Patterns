package StrategyPattern;

public class RangeAttack implements AttackMethod {

    String weapon;

    public RangeAttack (String weapon) {
        this.weapon  = weapon;
    }

    @Override
    public void attack() {
        System.out.println("Shooting with " + weapon);

    }

    
}
