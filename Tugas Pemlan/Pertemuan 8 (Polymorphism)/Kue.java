public abstract class Kue {
    protected String nama;
    protected double harga;

    public abstract double hitungHarga();

    public String toString() {
        return "Nama Kue: " + nama + ", Harga: " + harga;
    }
}