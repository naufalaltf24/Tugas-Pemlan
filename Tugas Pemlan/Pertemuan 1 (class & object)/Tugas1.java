import java.io.*;
import java.util.*;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.nextLine();
        double atkPower = scanner.nextDouble();
        double health = scanner.nextDouble();

        if (health < 0) {
            System.out.println("Input tidak valid: kesehatan musuh tidak dapat negatif");
            return;
        }

        health -= atkPower;
        if (health < 0) {
            health = 0;
        }

        System.out.println(nama + " attacking enemy with attack power " + atkPower + "0");
        System.out.printf("Health of Enemy = " + health + "0");
    }
}