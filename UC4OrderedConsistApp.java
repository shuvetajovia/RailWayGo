import java.util.LinkedList;

public class UC4OrderedConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC4: Ordered Bogie Sequence (LinkedList) ===");
        System.out.println();

        // LinkedList to maintain ordered train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies: Engine, Sleeper, AC, Cargo, Guard (order matters)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train consist: " + trainConsist);

        // Insert Pantry Car at position 2 (0-based index: 0-Engine, 1-Sleeper, 2-Pantry Car)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting 'Pantry Car' at position 2: " + trainConsist);

        // Remove first and last bogie
        String removedFirst = trainConsist.removeFirst();
        String removedLast  = trainConsist.removeLast();

        System.out.println("Removed first bogie: " + removedFirst);
        System.out.println("Removed last bogie: " + removedLast);

        // Final ordered consist
        System.out.println("Final ordered train consist: " + trainConsist);
    }
}
