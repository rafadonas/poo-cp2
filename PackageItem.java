public class PackageItem {
    private String code;
    private double weight;
    private String status;

    public PackageItem(String code, double weight, String status) {
        setCode(code);
        setWeight(weight);
        setStatus(status);
    }

    public String getCode() { return code; }
    public void setCode(String code) {
        if (code == null || code.trim().isEmpty())
            throw new IllegalArgumentException("Code cannot be empty");
        this.code = code;
    }

    public double getWeight() { return weight; }
    public void setWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException("Weight cannot be negative");
        this.weight = weight;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) {
        if (status == null || status.trim().isEmpty())
            throw new IllegalArgumentException("Status cannot be empty");
        this.status = status;
    }

    public void changeStatus(String newStatus) { setStatus(newStatus); }

    @Override
    public String toString() {
        return "Package " + code + " (" + status + ")";
    }
}
