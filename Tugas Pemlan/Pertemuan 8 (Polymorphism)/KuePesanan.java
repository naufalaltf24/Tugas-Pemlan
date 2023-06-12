public class KuePesanan extends Kue {
    protected double berat;

    public KuePesanan(String nama, double harga, double berat) {
        this.nama = nama;
        this.harga = harga;
        this.berat = berat;
    }

    public double hitungHarga() {
        return harga * berat;
    }
}