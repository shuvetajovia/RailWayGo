import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        // Dynamic initialization of train consist (empty list of bogies)
        List<String> bogies = new ArrayList<>();

        // Display initial consist summary
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + bogies.size());

        // Program continues (later UC2, UC3 will add more logic here)
        System.out.println("Application is ready for further operations.");
    }
}
