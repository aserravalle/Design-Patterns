package src;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        // TODO Auto-generated method stub
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        // TODO Auto-generated method stub
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        // TODO Auto-generated method stub
        return new ModernCoffeeTable();
    }
    
}
