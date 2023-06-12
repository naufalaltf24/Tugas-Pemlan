import java.time.LocalDate;

public class Main3 {
        public static void main(String[] args) {
                Manusia manusia1 = new Manusia("Tegar", "1111", true, false);
                System.out.println(manusia1.toString());

                System.out.println("===========================================");
                MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("225150407111022", 4.0,
                                "Naufal Althaf Reswara", "1112", true, false);
                System.out.println(mahasiswa1.toString());

                System.out.println("===========================================");
                Pekerja pekerja1 = new Pekerja(1000.0, LocalDate.of(2003, 3, 20),
                                10, "Ammar", "1113", true, true);
                System.out.println(pekerja1.toString());

                System.out.println("===========================================");
                Manager manager1 = new Manager("HRD", 7500.0,
                                LocalDate.of(2008, 1, 24), 0, "Ghifari Rifqy", "1114", true, true);
                System.out.println(manager1.toString());

                System.out.println("===========================================");
        }
}