abstract class Plant {
    String nama;
    double tinggi;

    public Plant(String nama, double tinggi) {
        this.nama = nama;
        this.tinggi = tinggi;
    }

    public abstract void tumbuh();
}