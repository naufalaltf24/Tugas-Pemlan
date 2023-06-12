import java.util.Calendar;
import java.util.Date;

public class CommissionEmployee extends Employee {
    private double grossSales; // penjualan per minggu
    private double commissionRate; // komisi

    public CommissionEmployee(String name, String noKTP, Date dateOfBirth, double grossSales, double commissionRate) {
        super(name, noKTP, dateOfBirth);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    public String toString() {
        return String.format("Commission Employee\n%s\nGross Sales: %.2f\nCommission Rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }
}