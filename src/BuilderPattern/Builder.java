package BuilderPattern;

public interface Builder {
    public void reset();
    public void buildWalls(int numwalls);
    public void buildDoors(int numdoors);
    public void buildRooms(int numrooms);
    public void buildPool(boolean hasPool);
    public void buildRoof(boolean hasRoof);
    public void buildGarage(boolean hasGarage);
    public void buildBasement(boolean hasBasement);
    public void buildStudySpace(boolean hasStudySpace);
}
