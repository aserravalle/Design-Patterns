package BuilderPattern;

public class HouseBuilder implements Builder {
    /**
     *
     */
    private static final String BUILT = "built ";
    private House house;

    public HouseBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        house = new House();

    }

    @Override
    public void buildWalls(int numwalls) {
        System.out.println(BUILT + numwalls + " walls");
        house.setNumwalls(numwalls);
    }

    @Override
    public void buildDoors(int numdoors) {
        System.out.println(BUILT + numdoors + " doors");
        house.setNumdoors(numdoors);

    }

    @Override
    public void buildRooms(int numrooms) {
        System.out.println(BUILT + numrooms + " rooms");
        house.setNumrooms(numrooms);

    }

    @Override
    public void buildPool(boolean hasPool) {
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
        house.setHasGarage(hasGarage);
        if(hasGarage) {
            System.out.println("built a garage");
        }

    }

    @Override
    public void buildBasement(boolean hasBasement) {
        //do nothing
    }

    @Override
    public void buildStudySpace(boolean hasStudySpace) {
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
