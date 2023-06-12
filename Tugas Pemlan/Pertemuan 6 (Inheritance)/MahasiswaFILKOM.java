public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getBeasiswa() {
        if (ipk > 3.5) {
            return 75;
        } else if (ipk > 3.0) {
            return 50;
        } else {
            return 0;
        }
    }

    public String getStatus() {
        String prodi = nim.substring(6, 7);
        String angkatan = nim.substring(0, 2);
        if (prodi.equals("2")) {
            return "Teknik Informatika, 20" + angkatan;
        } else if (prodi.equals("3")) {
            return "Teknik Komputer, 20" + angkatan;
        } else if (prodi.equals("4")) {
            return "Sistem Informasi, 20" + angkatan;
        } else if (prodi.equals("6")) {
            return "Pendidikan Teknologi Informasi, 20" +
                    angkatan;
        } else if (prodi.equals("7")) {
            return "Teknologi Informasi, 20" + angkatan;
        } else {
            return null;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\nnim : " + nim +
                "\nipk : " + ipk + "\nstatus : " + getStatus();
    }
}