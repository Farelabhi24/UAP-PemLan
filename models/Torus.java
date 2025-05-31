package uap.models;

import uap.bases.Shape; // Mengimport abstract class Shape
import uap.interfaces.*; // Mengimport semua file interface 

public class Torus extends Shape implements ThreeDimensional, MassCalculable, MassConverter, PiRequired, ShippingCostCalculator {
    private double majorRadius;   // Jari-jari besar torus
    private double minorRadius;   // Jari-jari kecil torus

    // Konstruktor default tanpa parameter
    public Torus() {}

    // Konstruktor dengan parameter radius major dan minor
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
        this.name = "Torus";
    }

    // Method untuk menghitung volume torus
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius; // Rumus volume torus
    }

    // Method untuk menghitung luas permukaan torus
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius; // Rumus luas permukaan torus
    }

    // Method untuk menghitung massa torus
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // Method untuk mengubah massa ke kg
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // Method untuk menghitung biaya kirim
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    // Method untuk menampilkan info lengkap torus
    public void printInfo() {
        System.out.println("Volume                : " + getVolume());
        System.out.println("Luas permukaan        : " + getSurfaceArea());
        System.out.println("Massa                 : " + getMass());
        System.out.println("Massa dalam kg        : " + gramToKilogram());
        System.out.println("Biaya kirim           : Rp" + (int) calculateCost());
    }
}