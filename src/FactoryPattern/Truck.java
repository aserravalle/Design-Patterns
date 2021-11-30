package FactoryPattern;

public class Truck implements Transport{

    @Override
    public void deliver(String goods,  String destination) {
        System.out.println(goods + " delivered to " + destination + " by the truck");
    }
    
}
