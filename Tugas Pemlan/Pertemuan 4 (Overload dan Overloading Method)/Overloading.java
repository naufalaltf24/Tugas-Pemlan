import java.util.Scanner;

public class Overloading {
   public static void HitungLuas(int a, int b){
    int nilai = a*b;
    System.out.println("maka hasil luas: " +nilai);
   }
  public static void HitungLuas (double value, double value2){
      double nilai = value * value2;
      System.out.println("Maka hasil Luas: " + nilai);
  }
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Overloading lingkaran = new Overloading();
      System.out.println("masukan nilai interger 1: ");
      int integer1 = in.nextInt();
      System.out.println("masukan nilai interger 2: ");
      int integer2 = in.nextInt();
      HitungLuas(integer1, integer2);
      System.out.print("masukkan nilai double 1 : ");
      double double1 = in.nextDouble();
      System.out.print("masukkan nilai double 2 : ");
      double double2 = in.nextDouble();
      lingkaran.HitungLuas(double1, double2);
      in.close();
  }
}
