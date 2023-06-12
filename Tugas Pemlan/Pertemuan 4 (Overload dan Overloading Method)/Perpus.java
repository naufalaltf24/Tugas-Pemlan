package Perpus;

import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Perpus {
    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private String[] penulisbanyak;
    private String sinopsis;
    private int jumlahKata;
    private double tingkatKesamaan;
    private int biaya_buku;
    private int royalti_persen;
    private int Royalti;
    private int Penjualan;

    public Perpus() {
    }

    public Perpus(String kategori1, String penulis1, String judul1, String bahasa1, String penerbitan1, String edisi1,
            String halaman1, String sinopsis1) {
    }

    public String[] getPenulisbanyak() {
        return penulisbanyak;
    }

    public void setPenulisbanyak(String[] s) {
        this.penulisbanyak = s;
    }

    public void setKategori(String s) {
        kategori = s;
    }

    public void setPenulis(String s) {
        penulis = s;
    }

    public void setJudul(String s) {
        judul = s;
    }

    public void setPenerbitan(String s) {
        penerbitan = s;
    }

    public void setEdisi(String i) {
        edisi = i;
    }

    public void setHalaman(int i) {
        halaman = i;
    }

    public void setBahasa(String s) {
        bahasa = s;
    }

    public void setSinopsis(String s) {
        sinopsis = s;
        penghitungKata();
    }

    public void penghitungKata() {
        String penghitung = sinopsis;
        int sum = 0;
        for (int j = 0; j < penghitung.length(); j++) {
            if (penghitung.charAt(j) == ' ') {
                sum++;
            }
        }
        if (sum > 0) {
            sum += 1;
        }
        jumlahKata = sum;
    }

    public double ItungKesamaan(Perpus o1) {
        int same = 0;
        if (this.kategori.equals(o1.kategori)) {
            same++;
        }
        if (this.penulis.equals(o1.penulis)) {
            same++;
        }
        if (this.judul.equals(o1.judul)) {
            same++;
        }
        if (this.bahasa.equals(o1.bahasa)) {
            same++;
        }
        if (this.penerbitan.equals(o1.penerbitan)) {
            same++;
        }
        tingkatKesamaan = same * 20;
        displayItungKesamaan(o1);
        return tingkatKesamaan;
    }

    private void displayItungKesamaan(Perpus o1) {
        System.out.println("Tingkat kesamaan kata : " + tingkatKesamaan);
    }

    public int hitungRoyalti(int biaya) {
        this.biaya_buku = biaya;
        Royalti = (Penjualan * biaya_buku * 10 / 100);
        return Royalti;
    }

    public int hitungRoyalti(int biaya, int persen) {
        this.biaya_buku = biaya;
        this.royalti_persen = persen;
        Royalti = (Penjualan * biaya_buku * royalti_persen) / 100;
        return Royalti;
    }

    public void bacaFile(String pathFile) {
        try {
            File file = new File(pathFile);
            Scanner input = new Scanner(file);
            String isi = input.nextLine();
            String[] isiFile = isi.split("; ");
            this.judul = isiFile[0];
            this.penulis = isiFile[1];
            input.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found: " + exception.getMessage());
        }
    }

    public void simpanFile(String namaFile) {
        try {
            BufferedWriter tulis = new BufferedWriter(new FileWriter(namaFile));
            tulis.write(judul + "; " + penulis);
            tulis.close();
        } catch (IOException exception) {
            System.out.println("Error : " + exception.getMessage());
        }
    }

    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: ");
        System.out.println("Kategori : " + kategori);
        if (this.penulisbanyak == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]", ""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        if (jumlahKata >= 10) {
            System.out.println("Sinopsis buku :" + sinopsis);
        }
        System.out.println("Hasil penjualan buku bulan ini : " + Penjualan);
        System.out.println("Penulis menerima royalti sebesar : " + Royalti);
    }
}
