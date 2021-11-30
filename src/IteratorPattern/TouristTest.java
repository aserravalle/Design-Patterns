package IteratorPattern;

import java.util.Arrays;
import java.util.List;

public class TouristTest {
    public static void main(String[] args) {
        List<String> locations = Arrays.asList(
            "Eiffel Tower",
            "Pyramids",
            "Christ the redeemer",
            "Colloseum",
            "Petra",
            "Big Ben",
            "Uluru"
        );

        Tourist tourist = new Tourist();
        String destination = "Pyramids";
        tourist.randomSearch(locations, destination);
        tourist.sequentialSearch(locations, destination);
        tourist.alphabeticalSearch(locations, destination);
    }
}
