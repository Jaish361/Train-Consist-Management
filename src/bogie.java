/**
 * Class: Bogie
 * Represents a bogie with name, capacity, and type
 */
public class bogie {

    private String name;
    private int capacity;
    private String type; // NEW

    public bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println(name + " (" + type + ") - Capacity: " + capacity);
    }
}