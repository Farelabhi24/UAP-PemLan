package uap.bases;

// Abstract class yang menjadi dasar dari semua bentuk cetakan
public abstract class Shape {
    private String name; // Menyimpan nama shape

    // Konstruktor default tanpa parameter
    public Shape() {}

    // Method untuk mengatur nama shape
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Mengembalikan nama bentuk
    public String getName() {
        return this.name;
    }

    // Abstract method untuk menampilkan info bentuk
    public abstract void printInfo();
}