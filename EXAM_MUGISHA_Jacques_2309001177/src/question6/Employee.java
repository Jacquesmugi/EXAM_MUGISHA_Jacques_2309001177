package question6;
public abstract class Employee implements Displayable {
    private String name;
    private int SSN;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getSSN() {
        return this.SSN;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public abstract double earnings();

    @Override
    public void displayAllDetails() {
        System.out.println("Name: " + getName());
        System.out.println("SSN: " + getSSN());
        System.out.println("Address: " + getAddress());
        System.out.println("Company Name: " + companyName);
        System.out.println("Fax: " + fax);
    }

    @Override
    public void displayEarnings() {
        System.out.println("Earnings: " + earnings());
    }
}