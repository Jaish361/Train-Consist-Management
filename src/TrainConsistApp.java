import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new bogie("Sleeper", 72));
        bogies.add(new bogie("AC Chair", 60));
        bogies.add(new bogie("First Class", 40));

        // Stream filtering (capacity > 60)
        List<bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (bogie b : filteredBogies) {
            b.display();
        }
    }
}