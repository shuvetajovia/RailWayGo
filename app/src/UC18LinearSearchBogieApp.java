public class UC18LinearSearchBogieApp {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {

            // Compare using equals()
            if (id.equals(key)) {
                return true; // Found → stop early
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG101", "BG205", "BG309", "BG412", "BG550"
        };

        String searchKey = "BG309";

        System.out.println("Searching for Bogie ID: " + searchKey);

        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie found in the train consist.");
        } else {
            System.out.println("Bogie NOT found.");
        }
    }
}