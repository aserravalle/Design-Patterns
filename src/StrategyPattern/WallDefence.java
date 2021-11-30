package StrategyPattern;

public class WallDefence implements DefenceMethod{
    String wall;

    public WallDefence(String wall) {
        this.wall = wall;
    }

    @Override
    public void defend() {
        System.out.println("defending with " + wall);
    }
    
}
