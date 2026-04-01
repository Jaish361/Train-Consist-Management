import java.util.HashSet;
import java.util.Set;

/**
 * Class: TrainConsistApp
 *
 * UC3: Track Unique Bogie IDs using HashSet
 * Demonstrates how duplicates are automatically ignored.
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // 1️⃣ Add bogie IDs
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B1"); // duplicate
        bogieIds.add("B2"); // duplicate

        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // 2️⃣ Try adding another duplicate
        boolean isAdded = bogieIds.add("B3");

        if (!isAdded) {
            System.out.println("\nDuplicate B3 was not added.");
        }

        // Final unique set
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nProgram running...");
    }
}