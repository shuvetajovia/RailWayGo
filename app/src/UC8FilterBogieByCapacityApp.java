import java.util.*;
import java.util.stream.Collectors;

class UC8FilterBogieByCapacityApp {

    public static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));

        int threshold = 60;

        List<Bogie> filtered = filterBogies(bogies, threshold);

        System.out.println("Filtered Bogies (capacity > " + threshold + "):");
        filtered.forEach(System.out::println);
    }
}