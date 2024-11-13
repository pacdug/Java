import java.time.LocalDate;

public abstract class Material {
    protected String id;
    protected String name;
    protected LocalDate manufactureDate;
    protected int cost;

    public Material(String id, String name, LocalDate manufactureDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();
}