// Main method for testing
package question5;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Toyota");
        car.setYearModel(2021);
        System.out.println("Make: " + car.getMake());
        System.out.println("Year Model: " + car.getYearModel());
    }
}

