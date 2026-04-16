public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("ABC1234", 500.0, 4);

        PackageItem pac = new PackageItem("BR999", 10.5, "Pending");

        Route r = new Route(pac, truck);
        r.deliver();

        Motorcycle moto = new Motorcycle("MOTO1", 50.0, true);
        Route r2 = new Route(new PackageItem("BR100", 2.0, "Ready"), moto);
        r2.deliver();
    }
}
