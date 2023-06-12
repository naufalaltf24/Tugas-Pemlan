import java.util.Calendar;
import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, Date dateOfBirth, double grossSales,
            double commissionRate, double baseSalary) {
        super(name, noKTP, dateOfBirth, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return baseSalary + super.earnings();
    }

    public String toString() {
        return String.format("Base Plus Commission Employee\n%s\nBase Salary: %.2f", super.toString(), getBaseSalary());
    }
}