import java.util.*;

public class UC10TotalSeatCapacityApp {

    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("First Class", 50));

        int total = calculateTotalCapacity(bogies);

        System.out.println("Total Seating Capacity of Train: " + total);
    }
}