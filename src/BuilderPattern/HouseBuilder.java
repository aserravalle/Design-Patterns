public class HouseBuilder implements Builder {
    private House house;

    public HouseBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        house = new House();

    }

    @Override
    public void buildWalls(int numwalls) {
        // TODO Auto-generated method stub
        System.out.println("built " + numwalls + " walls");
        house.setNumwalls(numwalls);
    }

    @Override
    public void buildDoors(int numdoors) {
        // TODO Auto-generated method stub
        System.out.println("built " + numdoors + " doors");
        house.setNumdoors(numdoors);

    }

    @Override
    public void buildRooms(int numrooms) {
        // TODO Auto-generated method stub
        System.out.println("built " + numrooms + " rooms");
        house.setNumrooms(numrooms);

    }

    @Override
    public void buildPool(boolean hasPool) {
        // TODO Auto-generated method stub
        house.setHasPool(hasPool);
        if(hasPool) {
            System.out.println("built a pool");
        }
    }

    @Override
    public void buildRoof(boolean hasRoof) {
        house.setHasRoof(hasRoof);
        if(hasRoof) {
            System.out.println("built a roof");
        }

    }

    @Override
    public void buildGarage(boolean hasGarage) {
        // TODO Auto-generated method stub
        house.setHasGarage(hasGarage);
        if(hasGarage) {
            System.out.println("built a garage");
        }

    }

    @Override
    public void buildBasement(boolean hasBasement) {
        // TODO Auto-generated method stub
        //do nothing
    }

    @Override
    public void buildStudySpace(boolean hasStudySpace) {
        // TODO Auto-generated method stub
        house.setHasStudySpace(hasStudySpace);
        if(hasStudySpace) {
            System.out.println("study space built");
        }
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    
    
}
