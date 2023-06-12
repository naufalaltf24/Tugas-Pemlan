package Perpus;

public class javaPerpus {
    public static void main(String[] args) {
        Perpus b1 = new Perpus();
        b1.setJudul("A History of Science Technology and Philosophy in the Eighteenth Century");
        b1.setKategori("Teknologi");
        b1.setPenulis("McKie, D.");
        b1.setPenerbitan("London George Allen & Unwin Ltd 1952");
        b1.setBahasa("Inggris");
        b1.setEdisi("Kedua");
        b1.setHalaman(814);
        b1.setSinopsis(
                "Buku ini menggambarkan perkembangan ilmu pengetahuan, teknologi, dan filsafat pada abad ke-18, dengan fokus pada revolusi ilmiah, pemikiran ilmiah, dan peran alam dalam filsafat. ");
        b1.displayMessage();
        System.out.println("=====================================");

        Perpus b2 = new Perpus();
        b2.setJudul("Information and Communication Technology, dan Literasi Media Digital");
        b2.setKategori("Teknologi");
        b2.setPenulisbanyak(new String[] { "Dewi Kartika Sari", "Nurul Hasfi", "Hedi Pudjo Santosa",
                "Triyono Lukmantoro", "Narayana Mahendra Prastya", "Santi Isnaini", "Said Romadlan",
                "Sa’diyah El Adawiyah", "Suwarto", "Aminah Swarnawati", "AgungPrabowo", "Kurnia Arofah",
                "Sri Budi Lestari", "Edi antoso", "M as’Amah" });
        b2.setPenerbitan("ASPIKOM 2015");
        b2.setBahasa("Indonesia");
        b2.setEdisi("Pertama");
        b2.setHalaman(178);
        b2.setSinopsis(
                "Buku ini menjelaskan tentang berbagai teknologi TIK dan dampaknya pada masyarakat serta pentingnya literasi media digital ");
        b2.displayMessage();
        System.out.println("=====================================");

        Perpus b3 = new Perpus();
        b3.setJudul("Dunia Sophie");
        b3.setKategori("Filsafat");
        b3.setPenulis("Jostein Gaarder");
        b3.setPenerbitan("Mizan Pustaka 2014");
        b3.setBahasa("Indonesia");
        b3.setEdisi("-");
        b3.setHalaman(800);
        b3.setSinopsis(
                "Novel ini bercerita tentang seorang gadis bernama Sophie yang menerima surat misterius yang mempertanyakan keberadaannya dan mengajaknya untuk mempertanyakan dunia di sekitarnya. ");
        b3.displayMessage();
        System.out.println("=====================================");

        Perpus b4 = new Perpus();
        b4.setJudul("Filsafat Kata");
        b4.setKategori("Filsafat");
        b4.setPenulis("Reza Alexander Antonius Wattimena");
        b4.setPenerbitan("Evolitera 2011");
        b4.setBahasa("Indonesia");
        b4.setEdisi("-");
        b4.setHalaman(396);
        b4.setSinopsis(
                "Buku ini menjelaskan tentang filsafat yang membahas berbagai topik seperti kebebasan, cinta, agama, hingga kematian.");
        b4.displayMessage();
        System.out.println("=====================================");

        Perpus b5 = new Perpus();
        b5.setJudul("Dinamika Pendidikan Islam: Perspektif Historis");
        b5.setKategori("Sejarah");
        b5.setPenulis("Dr. Siswanto, M.Pd.I");
        b5.setPenerbitan("Pena Salsabila 2013");
        b5.setBahasa("Indonesia");
        b5.setEdisi("-");
        b5.setHalaman(190);
        b5.setSinopsis("Buku ini membahas sejarah perkembangan pendidikan Islam dari masa awal hingga modern ");
        b5.displayMessage();
        System.out.println("=====================================");

        Perpus b6 = new Perpus();
        b6.setJudul("Penulisan dan Penghimpunan Hadis: Kajian Historis");
        b6.setKategori("Sejarah");
        b6.setPenulis("Rasul Ja'fariyan");
        b6.setPenerbitan("Lentera 1992");
        b6.setBahasa("Indonesia");
        b6.setEdisi("Pertama");
        b6.setHalaman(100);
        b6.setSinopsis(
                "Buku ini membahas bagaimana kumpulan hadis yang ada mulai ditulis dan berapa lama diperlukan untuk menjadikannya suatu laporan");
        b6.displayMessage();
        System.out.println("=====================================");

        Perpus b7 = new Perpus();
        b7.setJudul("Berkata Baik atau Diam: 294 Adab Kebiasaan Rasulullah SAW.");
        b7.setKategori("Agama");
        b7.setPenulis("Ninik Handrini");
        b7.setPenerbitan("PT. Gramedia Pustaka Utama 2016");
        b7.setBahasa("Indonesia");
        b7.setEdisi("Pertama");
        b7.setHalaman(240);
        b7.setSinopsis("buku ini berisi tentang kebiasaan baik Nabi Muhammad SAW dalam berbicara dan bertindak.");
        b7.displayMessage();
        System.out.println("=====================================");

        Perpus b8 = new Perpus();
        b8.setJudul("Ya Allah, Aku Jatuh Cinta");
        b8.setKategori("Agama");
        b8.setPenulis("Qowi Alta Az Zahra");
        b8.setPenerbitan("PT. Elex Media Komputindo 2014");
        b8.setBahasa("Indonesia");
        b8.setEdisi("Pertama");
        b8.setHalaman(116);
        b8.setSinopsis(
                "Buku ini menceritakan tentang perjuangan seorang wanita muda bernama Karmila dalam mencari arti cinta sejati yang sebenarnya. ");
        b8.displayMessage();
        System.out.println("=====================================");

        Perpus b9 = new Perpus();
        b9.setJudul("Akhir Bahagia");
        b9.setKategori("Psikologi");
        b9.setPenulis("Sandy Oogway");
        b9.setPenerbitan("PT. Karpindo 2018");
        b9.setBahasa("Indonesia");
        b9.setEdisi("Pertama");
        b9.setHalaman(121);
        b9.setSinopsis(
                "Buku ini menceritakan tentang kisah cinta dua orang yang dipertemukan oleh takdir namun harus melewati berbagai cobaan dan rintangan dalam hidup mereka.");
        b9.displayMessage();
        System.out.println("=====================================");

        Perpus b10 = new Perpus();
        b10.setJudul("Modul Pembelajaran dan Praktikum Tes Psikologi");
        b10.setKategori("Psikologi");
        b10.setPenulis("Zainul Anwar");
        b10.setPenerbitan("Psychology Forum 2021");
        b10.setBahasa("Indonesia");
        b10.setEdisi("-");
        b10.setHalaman(60);
        b10.setSinopsis(
                "Buku ini membahas tentang pengertian tes psikologi, macam-macamnya hingga prinsip pelaksanaanya");
        b10.displayMessage();
        System.out.println("=====================================");

        Perpus b11 = new Perpus();
        b11.setJudul("Nasionalisme Indonesia Kini dan di Masa Depan");
        b11.setKategori("Politik");
        b11.setPenulis("Benedict Anderson");
        b11.setPenerbitan("Anjing Galak Penerbitan 2010");
        b11.setBahasa("Indonesia");
        b11.setEdisi("-");
        b11.setHalaman(42);
        b11.setSinopsis(
                "Buku ini membahas tentang nasionalisme Indonesia dari perspektif sejarah, sosial, dan politik.");
        b11.displayMessage();
        System.out.println("=====================================");

        Perpus b12 = new Perpus();
        b12.setJudul("Nyanyi sunyi seorang bisu: Catatan-catatan dari P. Buru");
        b12.setKategori("Politik");
        b12.setPenulis("Pramoedya Ananta Toer");
        b12.setPenerbitan("Lentera 1995");
        b12.setBahasa("Indonesia");
        b12.setEdisi("Pertama");
        b12.setHalaman(316);
        b12.setSinopsis("Buku ini memuat kisah hidup Pramoedya selama ia diasingkan ke Pulau Buru pada era Orde Baru.");
        b12.displayMessage();
        System.out.println("=====================================");

        Perpus b13 = new Perpus();
        b13.setJudul("Laut Bercerita");
        b13.setKategori("Fiksi");
        b13.setPenulis("Leila S. Chudori");
        b13.setPenerbitan("Gramedia Pustaka Utama 2017");
        b13.setBahasa("Indonesia");
        b13.setEdisi("-");
        b13.setHalaman(390);
        b13.setSinopsis(
                "Buku ini memuat sebelas cerita pendek yang mengangkat tema tentang kehidupan dan kisah-kisah di sekitar laut..");
        b13.displayMessage();
        System.out.println("=====================================");

        Perpus b14 = new Perpus();
        b14.setJudul("Seperti Dendam, Rindu Harus Dibayar Tuntas");
        b14.setKategori("Fiksi");
        b14.setPenulis("Eka Kurniawan");
        b14.setPenerbitan("Gramedia Pustaka Utama 2019");
        b14.setBahasa("Indonesia");
        b14.setEdisi("-");
        b14.setHalaman(257);
        b14.setSinopsis(
                "Buku ini mengisahkan tentang dua tokoh utama, yakni Ajo Kawir dan Gecko, yang merupakan sahabat masa kecil yang terpisah selama bertahun-tahun dan hidup di dua dunia yang berbeda. ");
        b14.displayMessage();
        System.out.println("=====================================");
        b1.ItungKesamaan(b2);
        b13.ItungKesamaan(b14);
    }
}
