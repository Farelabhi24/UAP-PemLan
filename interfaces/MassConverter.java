package uap.interfaces;

// Interface untuk konversi massa
public interface MassConverter {
    int DENOMINATOR = 1000; // Faktor konversi gram ke kg
    double gramToKilogram(); // Mengubah gram ke kg
}