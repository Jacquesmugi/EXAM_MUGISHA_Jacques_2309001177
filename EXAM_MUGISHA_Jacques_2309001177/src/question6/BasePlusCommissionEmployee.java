package question6;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}


