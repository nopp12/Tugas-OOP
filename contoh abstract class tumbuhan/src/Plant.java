abstract class Plant {
    String nama;
    String jenis;
    double tinggi;

    public Plant(String nama, String jenis, double tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    public abstract void tumbuh();
}
