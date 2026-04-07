public class UC15SafeCargoAssignmentApp {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        try {
            // ✅ Safe
            b1.assignCargo("Petroleum");
            System.out.println("Assigned cargo to b1: " + b1);

            // ❌ Unsafe
            b2.assignCargo("Petroleum");
            System.out.println("Assigned cargo to b2: " + b2);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment process completed.");
        }

        System.out.println("Program continues safely...");
    }
}