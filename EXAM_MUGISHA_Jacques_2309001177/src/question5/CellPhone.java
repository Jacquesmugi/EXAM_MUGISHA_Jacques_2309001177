package question5;

public class CellPhone {
    private String manufact;
    private String model;
    private double retailPrice;

    // Constructor
    public CellPhone(String manufact, String model, double retailPrice) {
        this.manufact = manufact;
        this.model = model;
        this.retailPrice = retailPrice;
    }

    // Default constructor
    public CellPhone() {
        this.manufact = "";
        this.model = "";
        this.retailPrice = 0.0;
    }

    // Setters
    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    // Getters
    public String getManufact() {
        return manufact;
    }

    public String getModel() {
        return model;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}