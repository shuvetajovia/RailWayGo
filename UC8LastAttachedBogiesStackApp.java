import java.util.Stack;

public class UC8LastAttachedBogiesStackApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC8: Last-Attached Bogies (Stack / LIFO) ===");
        System.out.println();

        // Stack to manage last-minute attached bogies (LIFO)
        Stack<String> lastAttachedBogies = new Stack<>();

        // Push last-minute attachments
        lastAttachedBogies.push("Extra Sleeper");
        lastAttachedBogies.push("Extra AC");
        lastAttachedBogies.push("Relief Cargo");

        System.out.println("Last-attached bogies stack (top is last attached): " + lastAttachedBogies);

        // Peek at the current last-attached bogie
        String topBeforeRemoval = lastAttachedBogies.peek();
        System.out.println("Current last-attached bogie (top of stack): " + topBeforeRemoval);

        // Emergency rollback: remove last-attached bogies
        String removed1 = lastAttachedBogies.pop();
        System.out.println("Emergency removed bogie: " + removed1);

        String removed2 = lastAttachedBogies.pop();
        System.out.println("Emergency removed bogie: " + removed2);

        // Final state
        System.out.println("Stack after emergency removals: " + lastAttachedBogies);
        System.out.println("Is any last-minute bogie left? " + !lastAttachedBogies.empty());

        System.out.println();
        System.out.println("UC8 execution completed. Program can continue with further use cases.");
    }
}
