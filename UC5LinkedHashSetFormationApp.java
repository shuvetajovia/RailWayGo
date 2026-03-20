import java.util.LinkedHashSet;
import java.util.Set;

public class UC5LinkedHashSetFormationApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC5: Formation with LinkedHashSet ===");
        System.out.println();

        // LinkedHashSet to represent train formation (unique + insertion-ordered)
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies in sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Intentional duplicate attachment
        trainFormation.add("Sleeper");  // duplicate, will be ignored

        // Final formation order
        System.out.println("Final train formation (in insertion order, without duplicates):");
        System.out.println(trainFormation);
    }
}
