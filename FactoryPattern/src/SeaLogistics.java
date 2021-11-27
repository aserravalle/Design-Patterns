package src;

public class SeaLogistics extends Logistics {

    public SeaLogistics(String start, String destination) {
        super(start, destination);
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }
    
}
