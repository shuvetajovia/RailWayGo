import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UC7SortBogieByCapacityApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC7: Sort Bogies by Capacity (Comparator) ===");
        System.out.println();

        // Create a List<Bogie> to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies with capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 48));

        System.out.println("Before sorting (original order):");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        System.out.println();

        // Sort by capacity using Comparator + lambda
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("After sorting by capacity (ascending):");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        System.out.println();
        System.out.println("UC7 execution completed.");
    }
}