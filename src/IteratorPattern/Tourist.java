import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tourist {
    public void randomSearch(List<String> locations, String destination) {
        int step = 0;
        boolean arrived = false;
        Random randomGenerator = new Random(123);
        while (!arrived) {
            step++;
            int index = randomGenerator.nextInt(locations.size());
            String location = locations.get(index);
            arrived = location.equals(destination);
        }
        System.out.println("Random: steps = " + step);
    }
    
    public void sequentialSearch(List<String> locations, String destination) {
        int step = 0;
        for (String location : locations) {
            step++;
            boolean arrived = location.equals(destination);
            if (arrived) {
                break;
            }
        }
        System.out.println("Sequential: steps = " + step);
    }
    
    public void alphabeticalSearch(List<String> locations, String destination) {
        int step = 0;
        Collections.sort(locations);
        for (String location : locations) {
            step++;
            boolean arrived = location.equals(destination);
            if (arrived) {
                break;
            }
        }
        System.out.println("Alphabetical: steps = " + step);
    }
}
