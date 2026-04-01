import java.util.LinkedHashSet;

/**
 * Class: TrainConsistApp
 *
 * UC5: Preserve Insertion Order of Bogies using LinkedHashSet
 * Demonstrates uniqueness + order preservation.
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // 1️⃣ Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // 2️⃣ Attempt duplicate insertion
        train.add("Sleeper"); // duplicate

        // 3️⃣ Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nProgram running...");
    }
}