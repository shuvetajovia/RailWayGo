public class UC14ExceptionHandlingApp {

    public static void main(String[] args) {

        try {
            // Valid bogie
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // Invalid bogie
            Bogie b2 = new Bogie("AC Chair", -10);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}