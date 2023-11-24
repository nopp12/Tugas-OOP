abstract class Burung {
    String nama;
    int usia;

    public Burung(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public abstract void suara();
}
