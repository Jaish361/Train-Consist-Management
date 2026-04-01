import java.util.LinkedList;

/**
 * Class: TrainConsistApp
 *
 * UC4: Maintain Ordered Bogie IDs using LinkedList
 * Demonstrates insertion, deletion, and order maintenance.
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // 1️⃣ Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train:");
        System.out.println(train);

        // 2️⃣ Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry at position 2:");
        System.out.println(train);

        // 3️⃣ Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        // Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}