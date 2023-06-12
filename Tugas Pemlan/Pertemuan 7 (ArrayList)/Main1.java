public class Main1 {
    public static void main(String[] args) {

        // Lakukan modifikasi data tambah mahasiswa ...
        DataMahasiswa.tambahMahasiswa("Naufal Althaf", "Sistem Informasi", false);
        DataMahasiswa.tambahMahasiswa("Raisha Halderman", "Pendidikan Teknologi Informasi", true);
        DataMahasiswa.tambahMahasiswa("Farhan Syauqi", "Teknik Informatika", false);

        // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();

        // Method cariMahasiswa (jika data ada)
        System.out.println("============== Cari Mahasiswa ==============");
        Mahasiswa m1 = DataMahasiswa.cariMahasiswa("Naufal Althaf");
        if (m1 != null) {
            System.out.println("Data mahasiswa atas nama Naufal Althaf ditemukan.");
        } else {
            System.out.println("Data mahasiswa atas nama Naufal Althaf tidak ditemukan.");
        }

        // Method cariMahasiswa (jika data tidak ada)
        System.out.println("\n");
        System.out.println("============== Cari Mahasiswa ==============");
        Mahasiswa m2 = DataMahasiswa.cariMahasiswa("Elon Musk");
        if (m2 != null) {
            System.out.println("Data mahasiswa atas nama Elon Musk ditemukan.");
        } else {
            System.out.println("Data mahasiswa atas nama Elon Musk tidak ditemukan.");
        }

        // Method tampilMahasiswa (sebelum diupdate)
        System.out.println("\n");
        System.out.println("============= Sebelum diupdate =============");
        DataMahasiswa.tampilMahasiswa(m1);

        // Method tampilMahasiswa (setelah diupdate)
        DataMahasiswa.updateMahasiswa("Naufal Althaf", "Magister Sistem Informasi", true);
        System.out.println("============= Setelah diupdate =============");
        DataMahasiswa.tampilMahasiswa(m1);
    }
}
