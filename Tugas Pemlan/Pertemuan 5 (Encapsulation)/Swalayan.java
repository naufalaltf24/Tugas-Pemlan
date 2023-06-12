public class Swalayan {
    private double saldo;
    private double pembelian;
    private double cashback;
    private String nomorPelanggan;
    private String nama;
    private String jenisRekening;
    private String pin;
    private int valid;
    private boolean autentifikasi = false;

    public Swalayan(String nama, String jenisRekening) {
        this.nama = nama;
        this.jenisRekening = jenisRekening;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public void setPin(String n) {
        this.pin = n;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public void setnomorPelanggan(String n) {
        this.nomorPelanggan = n;
    }

    public String getjenisRekening() {
        return jenisRekening;
    }

    public void setjenisRekening(String n) {
        this.jenisRekening = n;
    }

    public void informasiAkun() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Pelanggan: " + nomorPelanggan);
        System.out.println("Jenis Rekening: " + jenisRekening);
    }

    public void setPembelian(double s) {
        if (valid == 3) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Akun Anda telah terblokir");
        } else if (autentifikasi == false) {
        } else {
            this.pembelian = s;
            hitungPembelian(this.pembelian);
        }
    }

    public void autentifikasi(String nomorPelanggan1, String Pin1) {
        if (valid == 3) {
            System.out.println("Anda telah melebihi batas autentifikasi. Akun Anda akan diblokir");
            setnomorPelanggan(nomorPelanggan1);
            ;
            setPin(Pin1);
        } else {
            if (nomorPelanggan1.equals(nomorPelanggan)) {
                if (Pin1.equals(pin)) {
                    System.out.println("Autentifikasi Berhasil");
                    autentifikasi = true;
                } else {
                    System.out.println("Kesalahan Autentifikasi. Password yang Anda masukkan salah");
                }
            } else {
                System.out.println("Maaf, nama yang Anda masukkan tidak terdeteksi");
            }
            valid++;
        }
    }

    public void topUp(int s) {
        if (valid == 3) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Akun Anda telah terblokir");
        } else if (autentifikasi == false) {
        } else {
            saldo = saldo + s;
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Top up berhasil");
            System.out.println("Saldo Anda: " + saldo);
            System.out.println("--------------------------------------------------------------------");
        }
    }

    private double hitungCashback(double s) {
        pembelian = s;
        String jenis = nomorPelanggan.substring(0, 2);
        pembelian = s;
        switch (jenis) {
            case "38":
                cashback = pembelian * 0.05;
                saldo = saldo + cashback;
                System.out.println("Pembelian Berhasil");
                System.out.println("Cashback Anda: " + cashback);
                System.out.println("Saldo Anda: " + saldo);
                break;
            case "56":
                if (pembelian > 1000000) {
                    cashback = pembelian * 0.07;
                    saldo = saldo + cashback;
                    System.out.println("Pembelian Berhasil");
                    System.out.println("Cashback Anda: " + cashback);
                    System.out.println("Saldo Anda: " + saldo);
                } else {
                    cashback = pembelian * 0.02;
                    saldo = saldo + cashback;
                    System.out.println("Pembelian Berhasil");
                    System.out.println("Cashback Anda: " + cashback);
                    System.out.println("Saldo Anda: " + saldo);
                }
                break;
            case "74":
                if (pembelian > 1000000) {
                    cashback = pembelian * 0.10;
                    saldo = saldo + cashback;
                    System.out.println("Pembelian Berhasil");
                    System.out.println("Cashback Anda: " + cashback);
                    System.out.println("Saldo Anda: " + saldo);
                } else {
                    cashback = pembelian * 0.05;
                    saldo = saldo + cashback;
                    System.out.println("Pembelian Berhasil");
                    System.out.println("Cashback Anda: " + cashback);
                    System.out.println("Saldo Anda: " + saldo);
                }
                break;
        }
        return cashback;
    }

    private void hitungPembelian(double pembelian) {
        double sisa = saldo - pembelian;
        if (sisa < 10000) {
            System.out.println("Pembelian Gagal");
            System.out.println("Saldo Anda: " + sisa);
        } else {
            saldo = sisa;
            hitungCashback(this.pembelian);
        }
    }
}
