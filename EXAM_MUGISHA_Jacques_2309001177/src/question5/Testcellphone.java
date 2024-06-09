package question5;

public class Testcellphone { // Main method for testing
    public static void main(String[] args) {
        CellPhone cellphone = new CellPhone();
        cellphone.setManufact("Apple");
        cellphone.setModel("iPhone 13");
        cellphone.setRetailPrice(999.99);
        System.out.println("Manufacturer: " + cellphone.getManufact());
        System.out.println("Model: " + cellphone.getModel());
        System.out.println("Retail Price: " + cellphone.getRetailPrice());
    }
}