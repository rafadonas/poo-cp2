public abstract class Vehicle {
    private String plate;
    private double capacity;

    public Vehicle(String plate, double capacity) {
        setPlate(plate);
        setCapacity(capacity);
    }

    public String getPlate() { return plate; }
    public void setPlate(String plate) {
        if (plate == null || plate.trim().isEmpty())
            throw new IllegalArgumentException("Plate cannot be empty");
        this.plate = plate;
    }

    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Capacity cannot be negative");
        this.capacity = capacity;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " " + plate;
    }
}
