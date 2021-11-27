public class BuilderPatternTest {
    public static void main(String[] args) {
        ApartmentBuilder aBuilder = new ApartmentBuilder();
        Director director = new Director(aBuilder);
        director.buildStudentAccomodation();
        Apartment studentapt = aBuilder.getApartment();
    }
}
