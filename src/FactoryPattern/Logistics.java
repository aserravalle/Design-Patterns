package FactoryPattern;

public abstract class Logistics {
    private String start;
    private String destination;

    public Logistics(String start, String destination) {
        this.start = start;
        this.destination = destination;
    }
    
    public void planDelivery() {
        System.out.println("Planning route from " + start + " to " + destination);
    }

    public abstract Transport createTransport();

}
