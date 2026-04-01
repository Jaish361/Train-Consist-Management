import java.util.ArrayList;
import java.util.List;

/**
 * Class: TrainConsistApp
 *
 * This class represents the entry point of the Train Consist Management System.
 * It initializes the train consist and displays the initial summary.
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("Program running...");
    }
}