public class KueJadi extends Kue {
    protected double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public double hitungHarga() {
        return harga * jumlah * 2;
    }
}