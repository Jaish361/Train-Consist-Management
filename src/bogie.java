/**
 * Class: Bogie
 *
 * Represents a passenger bogie with name and seating capacity.
 */
public class bogie {

    private String name;
    private int capacity;

    public bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}