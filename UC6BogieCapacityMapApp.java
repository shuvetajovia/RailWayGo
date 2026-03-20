import java.util.HashMap;
import java.util.Map;

public class UC6BogieCapacityMapApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC6: Bogie Capacity Mapping (HashMap) ===");
        System.out.println();

        // HashMap to store bogie -> capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert capacity values for bogies using put()
        bogieCapacityMap.put("Sleeper", 72);      // 72 seats
        bogieCapacityMap.put("AC Chair", 56);     // 56 seats
        bogieCapacityMap.put("First Class", 48);  // 48 seats

        System.out.println("Bogie capacity mapping details:");
        // Iterate using entrySet() to access keys and values together
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        System.out.println();
        System.out.println("UC6 execution completed. Program can continue to further analytics or validation.");
    }
}
