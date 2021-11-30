package src;

public class TransportTest {

    public static void main(String[] args) {
        String deliveryType = "sea";
        String start = "sydney";
        String destination = "melbourne";
        Logistics log = null;
        if(deliveryType.equals("road")) {
            log = new RoadLogistics(start, destination);
        }else if (deliveryType.equals("sea")) {
            log = new SeaLogistics(start, destination);
        }else {
            System.out.println("invalid method of transport");
            return;
        }
        log.planDelivery();
        Transport transport = log.createTransport();
        transport.deliver("Apples", destination);
            
    }
}
