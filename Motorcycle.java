public class Motorcycle extends Vehicle {
    private boolean trunk;

    public Motorcycle(String plate, double capacity, boolean trunk) {
        super(plate, capacity);
        this.trunk = trunk;
    }

    public boolean hasTrunk() { return trunk; }
    public void setTrunk(boolean trunk) { this.trunk = trunk; }

    @Override
    public String getType() { return "Motorcycle"; }
}
