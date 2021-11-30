package FactoryPattern;

public class RoadLogistics extends Logistics {

    public RoadLogistics(String start, String destination) {
        super(start, destination);
    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }
    
}
