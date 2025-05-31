package uap.mains;

import java.util.Scanner;
import uap.models.Sphere; // Mengimport class Sphere
import uap.models.Torus; // Mengimport class Torus

public class KalkulatorPabrik {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.print("NAMA LENGKAP        : ");
        String namaLengkap = input.nextLine(); // Menerima input nama lengkap dari pengguna
        System.out.print("NIM                 : "); 
        long nim = input.nextLong(); // Menerima input NIM dari pengguna
        System.out.println("=============================================");

        // ==================== Torus ====================
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius (besar) : ");
        double R = input.nextDouble();  // Input major radius (besar)
        System.out.print("Isikan radius (kecil) : ");
        double r = input.nextDouble();  // Input minor radius (kecil)

        Torus torus = new Torus(R, r);  // Membuat objek Torus dengan konstruktor
        System.out.println("=============================================");
        torus.printInfo();              // Menampilkan volume, luas permukaan, dan massa
        System.out.println("Massa dalam kg        : " + torus.gramToKilogram() + " kg"); // Konversi ke kilogram
        System.out.println("Biaya kirim           : Rp" + torus.calculateCost());       // Menghitung biaya kirim
        System.out.println("=============================================");

        // ==================== Sphere ====================
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius         : ");
        double rs = input.nextDouble();  // Input radius untuk Sphere

        Sphere sphere = new Sphere(rs);  // Membuat objek Sphere dengan konstruktor
        System.out.println("=============================================");
        sphere.printInfo();              // Menampilkan volume, luas permukaan, dan massa
        System.out.println("Massa dalam kg        : " + sphere.gramToKilogram() + " kg"); // Konversi ke kilogram
        System.out.println("Biaya kirim           : Rp" + sphere.calculateCost());       // Menghitung biaya kirim
        System.out.println("=============================================");
        
        input.close();  // Menutup scanner
    }
}