import java.util.Calendar;
import java.util.Date;

public abstract class Employee {
    private String name;
    private String noKTP;
    private Date dateOfBirth;

    public Employee(String name, String noKTP, Date dateOfBirth) {
        this.name = name;
        this.noKTP = noKTP;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public abstract double earnings(); // pendapatan

    public String toString() {
        return String.format("Name: %s\nNo. KTP: %s", getName(), getNoKTP());
    }
}