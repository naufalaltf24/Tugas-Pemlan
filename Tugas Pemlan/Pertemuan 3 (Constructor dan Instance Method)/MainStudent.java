import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        Student2[] siswa = new Student2[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nSiswa " + (i+1));
            System.out.print("Masukkan nama: ");
            String name = input.next();
            System.out.print("Masukkan alamat: ");
            String addres = input.next();
            System.out.print("Masukkan umur: ");
            int age = input.nextInt();
            System.out.print("Masukkan nilai matematika: ");
            int math = input.nextInt();
            System.out.print("Masukkan nilai bahasa inggris: ");
            int english = input.nextInt();
            System.out.print("Masukkan nilai IPA: ");
            int science = input.nextInt();

            siswa[i] = new Student2();
            siswa[i].setName(name);
            siswa[i].setAddress(addres);
            siswa[i].setAge(age);
            siswa[i].setMath(math);
            siswa[i].setEnglish(english);
            siswa[i].setScience(science);

        }input.close();
        
        System.out.println( "\n");
        System.out.println("Data siswa : ");
        for(int i=0; i<jumlahSiswa; i++){
            System.out.println("Siswa ke-" + (i+1)); 
            siswa[i].displayMessage ();
        }
        Student2.jumlahObjek();
    }
}
