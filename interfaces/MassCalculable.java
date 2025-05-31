package uap.interfaces;

// Interface untuk bentuk yang dapat dihitung massanya
public interface MassCalculable {
    int DENSITY = 8;         // Massa jenis bahan (g/cm³)
    double THICKNESS = 0.5;  // Ketebalan bahan (cm)
    double getMass();        // Mendapatkan massa dalam gram
}