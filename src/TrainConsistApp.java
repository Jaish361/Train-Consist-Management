import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UC7: Sort Bogies by Capacity using Comparator
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<bogie> bogies = new ArrayList<>();

        // Add bogie objects
        bogies.add(new bogie("Sleeper", 72));
        bogies.add(new bogie("AC Chair", 60));
        bogies.add(new bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        for (bogie b : bogies) {
            b.display();
        }

        // Sort using Comparator (lambda)
        bogies.sort(Comparator.comparingInt(bogie::getCapacity));

        System.out.println("\nAfter Sorting by Capacity:");
        for (bogie b : bogies) {
            b.display();
        }
    }
}