package uap.models;

import uap.bases.Shape; // Mengimport abstract class Shape
import uap.interfaces.*; // Mengimport semua file interface

public class Sphere extends Shape implements ThreeDimensional, MassCalculable, MassConverter, PiRequired, ShippingCostCalculator {
    private double radius; // Jari-jari bola

    // Konstruktor default tanpa parameter
    public Sphere() {}

    // Konstruktor dengan parameter radius
    public Sphere(double radius) {
        this.radius = radius;
        this.name = "Sphere";
    }

    // Method untuk menghitung volume bola
    public double getVolume() {
        return 4 * PI * radius * radius * radius / 3; // Rumus volume bola
    }

    // Method untuk menghitung luas permukaan bola
    public double getSurfaceArea() {
        return 4 * PI * radius * radius; // Rumus luas permukaan bola
    }

    // Method untuk menghitung massa bola
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // Method untuk konversi gram ke kilogram
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // MMethod untuk menghitung biaya kirim
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    // Method untuk menampilkan info lengkap bola
    public void printInfo() {
        System.out.println("Volume                : " + getVolume());
        System.out.println("Luas permukaan        : " + getSurfaceArea());
        System.out.println("Massa                 : " + getMass());
        System.out.println("Massa dalam kg        : " + gramToKilogram());
        System.out.println("Biaya kirim           : Rp" + (int) calculateCost());
    }
}