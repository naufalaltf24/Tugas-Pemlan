import java.util.Date;

public class TestEmployee {
public static void main(String[] args) {
// Buat objek dengan tanggal lahir
Date birthDate1 = new Date(2000, 5, 21); // Contoh tanggal lahir: 21 Juni 2000
Date birthDate2 = new Date(1998, 8, 12); // Contoh tanggal lahir: 12 September 1998

// Buat objek dari setiap kelas Employee
SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135",
800.00, birthDate1);
HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, birthDate2);
CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06, birthDate1);
BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300, birthDate2);

// Hitung gaji secara polimorfisme dan tambahkan gaji jika bulan ini ulang
tahun
Employee[] employees = { salariedEmployee, hourlyEmployee,
commissionEmployee, basePlusCommissionEmployee };
for (Employee employee : employees) {
System.out.println(employee);
System.out.printf("Pendapatan: $%,.2f\n", employee.earnings());

if (employee.isBirthday()) {
double additionalSalary = 100000; // Tambahan gaji jika ulang tahun
System.out.printf("Gaji Tambahan: $%,.2f\n", additionalSalary);
double totalEarnings = employee.earnings() + additionalSalary;
System.out.printf("Pendapatan Total: $%,.2f\n", totalEarnings);
}
}
}
}
