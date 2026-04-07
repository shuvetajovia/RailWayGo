import java.util.Arrays;

public class UC19BinarySearchBogieApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // ⚠️ Ensure array is sorted
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                high = mid - 1; // Search left
            } else {
                low = mid + 1; // Search right
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

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie found using Binary Search.");
        } else {
            System.out.println("Bogie NOT found.");
        }
    }
}