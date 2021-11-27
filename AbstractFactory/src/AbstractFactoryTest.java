package src;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        String style = "modern";
        FurnitureFactory factory = null;

        if(style.equals("victorian")) {
            factory = new VictorianFurnitureFactory();
        }else if (style.equals("modern")) {
            factory = new ModernFurnitureFactory();
        }


        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.describeChair();
        sofa.describeSofa();
        coffeeTable.describeTable(); 
    }
}
