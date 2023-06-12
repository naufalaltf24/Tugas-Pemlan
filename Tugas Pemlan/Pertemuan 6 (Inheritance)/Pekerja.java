import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jmlAnak;

    public Pekerja(double gaji, LocalDate tahunMasuk, int jmlAnak, String nama, String nik, boolean jenisKelamin,
            boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.tahunMasuk = tahunMasuk;
        this.gaji = gaji;
        this.jmlAnak = jmlAnak;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public int getjmlAnak() {
        return jmlAnak;
    }
    public void setjmlAnak(int jmlAnak) {
        this.jmlAnak = jmlAnak;
    }
    public double getBonus() {
        int lamaKerja = LocalDate.now().getYear() -
                tahunMasuk.getYear();
        if (lamaKerja <= 5) {
            return 0.05 * getGaji();
        }
        if (lamaKerja <= 10) {
            return 0.1 * getGaji();
        }
        if (lamaKerja > 10) {
            return 0.15 * getGaji();
        } else {
            return 0;
        }
    }
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jmlAnak * 20)
                + gaji;
    }
    @Override
    public String toString() {
        return super.toString() + "\ntahun Masuk : " +
                tahunMasuk + "\njumlah Anak : " + jmlAnak + "\ngaji : "
                + gaji;
    }
}