public class Main00 {
    public static void main(String[] args) {
        Kue[] arrayKue = new Kue[20];
        // Isikan 20 objek kue dengan berbagai jenis kue
        arrayKue[0] = new KuePesanan("tahu goreng", 10.0, 0.5);
        arrayKue[1] = new KueJadi("wajik", 5.0, 3);
        arrayKue[2] = new KuePesanan("kue lapis", 12.0, 0.8);
        arrayKue[3] = new KueJadi("pisang goreng", 6.0, 4);
        arrayKue[4] = new KuePesanan("Kue Keju", 15.0, 0.5);
        arrayKue[5] = new KueJadi("Onde-onde", 2.5, 0.9);
        arrayKue[6] = new KuePesanan("Kue coklat", 15.0, 0.5);
        arrayKue[7] = new KueJadi("Lemper", 3.0, 1.0);
        arrayKue[8] = new KuePesanan("Kue Bugis ", 20.0, 1.5);
        arrayKue[9] = new KueJadi("putu bambu", 2.0, 1.0);
        arrayKue[10] = new KuePesanan("Nagasari", 18.0, 1.5);
        arrayKue[11] = new KuePesanan("Kue Cucur", 5.0, 0.5);
        arrayKue[12] = new KueJadi("Kue Talam", 3.5, 0.9);
        arrayKue[13] = new KuePesanan("Bikang", 10.0, 0.8);
        arrayKue[14] = new KueJadi("Serabi", 25.0, 5);
        arrayKue[15] = new KuePesanan("Mendut", 9.0, 0.5);
        arrayKue[16] = new KueJadi("Wajik", 1.5, 0.9);
        arrayKue[17] = new KuePesanan("klepon", 10.0, 1.5);
        arrayKue[18] = new KueJadi("Kue Mangkok", 3.0, 1.0);
        arrayKue[19] = new KuePesanan("Kue Lumpur", 20.0, 1.5);
        // Tampilkan semua kue dan jenis kuenya
        for (Kue kue : arrayKue) {
            if (kue instanceof KuePesanan) {
                System.out.println("Jenis: Kue Pesanan");
            } else if (kue instanceof KueJadi) {
                System.out.println("Jenis: Kue Jadi");
            }
            System.out.println(kue);
        }
        // Hitung total harga dari semua jenis kue
        double totalHarga = 0;
        for (Kue kue : arrayKue) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("Total Harga: " + totalHarga);
        // Hitung total harga dan total berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).berat;
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat);
        // Hitung total harga dan total jumlah dari KueJadi
        double totalHargaJadi = 0;
        double totalJumlah = 0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).jumlah;
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah);
        // Temukan kue dengan harga terbesar
        double hargaTerbesar = 0;
        Kue kueTerbesar = null;
        for (Kue kue : arrayKue) {
            if (kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("Kue dengan Harga Terbesar: " + kueTerbesar);
    }
}