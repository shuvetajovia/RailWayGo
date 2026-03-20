import java.util.HashSet;
import java.util.Set;

public class UC3UniqueBogieIdsApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC3: Unique Bogie IDs ===");
        System.out.println();

        // HashSet for storing unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add duplicate values intentionally
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");  // duplicate
        bogieIds.add("BG102");  // duplicate

        // Final set after automatic de-duplication
        System.out.println("Final set of unique bogie IDs: " + bogieIds);
        System.out.println("Total unique bogie IDs: " + bogieIds.size());

        System.out.println();
        System.out.println("Note: Duplicates like BG101, BG102 were automatically ignored by HashSet.");
    }
}
