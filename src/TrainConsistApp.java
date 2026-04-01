import java.util.*;
import java.util.stream.Collectors;

/**
 * UC9: Group Bogies by Type
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<bogie> bogies = new ArrayList<>();

        // Add bogies with type
        bogies.add(new bogie("Sleeper", 72, "Passenger"));
        bogies.add(new bogie("AC Chair", 60, "Passenger"));
        bogies.add(new bogie("Cargo", 100, "Goods"));
        bogies.add(new bogie("Parcel", 80, "Goods"));

        // Grouping
        Map<String, List<bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(bogie::getType));

        // Display result
        System.out.println("\nGrouped Bogies:");

        for (String type : grouped.keySet()) {
            System.out.println("\nType: " + type);
            for (bogie b : grouped.get(type)) {
                b.display();
            }
        }
    }
}