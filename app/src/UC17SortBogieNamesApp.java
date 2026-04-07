import java.util.Arrays;

public class UC17SortBogieNamesApp {

    public static void main(String[] args) {

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // ✅ Built-in sorting
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}