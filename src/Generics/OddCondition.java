package Generics;

public class OddCondition implements Condition<Integer> {

    @Override
    public boolean eval(Integer t) {
        return t % 2 != 0 ;
    }
    
}
