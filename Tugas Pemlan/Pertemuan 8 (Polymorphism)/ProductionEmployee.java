import java.util.Calendar;
import java.util.Date;

public class ProductionEmployee extends Employee {
    private double hourlyRate; // upah per barang
    private int quantity; // jumlah barang yang diproduksi

    public ProductionEmployee(String name, String noKTP, Date dateOfBirth, double hourlyRate, int quantity) {
        super(name, noKTP, dateOfBirth);
        this.hourlyRate = hourlyRate;
        this.quantity = quantity;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double earnings() {
        return hourlyRate * quantity;
    }

    public String toString() {
        return String.format("Production Employee\n%s\nHourly Rate: %.2f\nQuantity: %d",
                super.toString(), getHourlyRate(), getQuantity());
    }
}