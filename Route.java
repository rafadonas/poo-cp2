public class Route {
    private PackageItem pkg;
    private Vehicle vehicle;

    public Route(PackageItem pkg, Vehicle vehicle) {
        if (pkg == null || vehicle == null) throw new IllegalArgumentException("Package and vehicle required");
        this.pkg = pkg;
        this.vehicle = vehicle;
    }

    public void deliver() {
        System.out.println("Delivering " + pkg.getCode() + " using " + vehicle);
    }
}
