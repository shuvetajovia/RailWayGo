import java.util.ArrayList;
import java.util.List;

public class UC2PassengerBogiesApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC2: Passenger Bogies ===");
        System.out.println();

        // Start from an empty list of passenger bogies (extension of UC1 idea)
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("Train consist initialized (UC2).");
        System.out.println("Initial passenger bogie count: " + passengerBogies.size());
        System.out.println();

        // Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after insertion: " + passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removing 'AC Chair': " + passengerBogies);

        // Check if Sleeper exists
        boolean sleeperExists = passengerBogies.contains("Sleeper");
        System.out.println("Does 'Sleeper' bogie exist? " + sleeperExists);

        // Final state
        System.out.println("Final passenger bogie list: " + passengerBogies);
        System.out.println("Final passenger bogie count: " + passengerBogies.size());

        System.out.println();
        System.out.println("UC2 execution completed. Application continues...");
    }
}
