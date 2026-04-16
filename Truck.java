public class Truck extends Vehicle {
    private int axles;

    public Truck(String plate, double capacity, int axles) {
        super(plate, capacity);
        setAxles(axles);
    }

    public int getAxles() { return axles; }
    public void setAxles(int axles) {
        if (axles <= 0) throw new IllegalArgumentException("Axles must be positive");
        this.axles = axles;
    }

    @Override
    public String getType() { return "Truck"; }
}
