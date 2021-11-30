public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void buildStudentAccomodation() {
        builder.reset();
        builder.buildWalls(15);
        builder.buildDoors(4);
        builder.buildRooms(3);
        builder.buildPool(false);
        builder.buildRoof(true);
        builder.buildGarage(true);
        builder.buildBasement(true);
        builder.buildStudySpace(true);
    }

    public void buildStudio() {
        builder.reset();
        builder.buildWalls(5);
        builder.buildDoors(2);
        builder.buildRooms(1);
        builder.buildPool(false);
        builder.buildRoof(true);
        builder.buildGarage(false);
        builder.buildBasement(false);
        builder.buildStudySpace(false);
    }

}
