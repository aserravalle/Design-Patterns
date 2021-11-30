package StrategyPattern;

public class Soldier {
    String name;
    AttackMethod aMethod;
    DefenceMethod dMethod;

    public Soldier(String name, AttackMethod aMethod, DefenceMethod dMethod) {
        this.name = name;
        this.aMethod = aMethod;
        this.dMethod = dMethod;
    }

    public void attack() {
        aMethod.attack();
    }

    public void block() {
        dMethod.defend();
    }
}
