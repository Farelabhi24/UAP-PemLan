package uap.interfaces;

// Interface untuk menghitung biaya kirim
public interface ShippingCostCalculator {
    int PRICE_PER_KG = 2000;       // Biaya kirim per kg
    double calculateCost();        // Menghitung biaya kirim
}