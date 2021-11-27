public class ApartmentBuilder implements Builder {
    private Apartment apartment;

    public ApartmentBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        apartment = new Apartment();

    }

    @Override
    public void buildWalls(int numwalls) {
        // TODO Auto-generated method stub
        System.out.println("built " + numwalls + " walls");
        apartment.setNumwalls(numwalls);
        
    }

    @Override
    public void buildDoors(int numdoors) {
        // TODO Auto-generated method stub
        System.out.println("built " + numdoors + " doors");
        apartment.setNumdoors(numdoors);
    }

    @Override
    public void buildRooms(int numrooms) {
        // TODO Auto-generated method stub
        System.out.println("built " + numrooms + " rooms");
        apartment.setNumrooms(numrooms);
    }

    @Override
    public void buildPool(boolean hasPool) {
        // TODO Auto-generated method stub
        apartment.setHasPool(hasPool);
        if(hasPool) {
            System.out.println("built a pool");
        }

    }

    @Override
    public void buildRoof(boolean hasRoof) {
        //do nothing
        apartment.setHasRoof(hasRoof);
        if(hasRoof) {
            System.out.println("built a roof");
        }
    }

    @Override
    public void buildGarage(boolean hasGarage) {
        // TODO Auto-generated method stub
        //do nothing

    }

    @Override
    public void buildBasement(boolean hasBasement) {
        // TODO Auto-generated method stub
        if(hasBasement) {
            System.out.println("basement built");
        }
        apartment.setHasBasement(hasBasement);
    }

    @Override
    public void buildStudySpace(boolean hasStudySpace) {
        // TODO Auto-generated method stub
        apartment.setHasStudySpace(hasStudySpace);
        if(hasStudySpace) {
            System.out.println("study space built");
        }
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
    
    
}
