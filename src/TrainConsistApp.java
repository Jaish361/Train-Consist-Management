import java.util.ArrayList;
import java.util.List;

/**
 * Class: TrainConsistApp
 *
 * UC2: Add Passenger Bogies to Train using ArrayList
 * Demonstrates CRUD operations (Create, Read, Delete, Check)
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList to store bogies
        List<String> trainConsist = new ArrayList<>();

        // 1️⃣ Add bogies (CREATE)
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(trainConsist);

        // 2️⃣ Remove a bogie (DELETE)
        trainConsist.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(trainConsist);

        // 3️⃣ Check existence (READ / CHECK)
        if (trainConsist.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram running...");
    }
}