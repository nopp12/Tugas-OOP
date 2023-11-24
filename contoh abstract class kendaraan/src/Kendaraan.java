abstract class Kendaraan {
    String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public abstract void suaraKendaraan();
}
