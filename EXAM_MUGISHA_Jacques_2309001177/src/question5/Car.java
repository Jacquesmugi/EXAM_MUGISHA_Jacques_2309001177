package question5;

public class Car {
    private String make;
    private int yearModel;

    // Constructor
    public Car(String make, int yearModel) {
        this.make = make;
        this.yearModel = yearModel;
    }

    // Default constructor
    public Car() {
        this.make = "";
        this.yearModel = 0;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public int getYearModel() {
        return yearModel;
    }


}
