import java.util.regex.*;

public class UC11ValidateTrainAndCargoApp {

    public static boolean isValidTrainID(String trainId) {
        String trainPattern = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(trainPattern);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean isValidCargoCode(String cargoCode) {
        String cargoPattern = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(cargoPattern);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID: " + trainId + " → " +
                (isValidTrainID(trainId) ? "Valid" : "Invalid"));

        System.out.println("Cargo Code: " + cargoCode + " → " +
                (isValidCargoCode(cargoCode) ? "Valid" : "Invalid"));
    }
}