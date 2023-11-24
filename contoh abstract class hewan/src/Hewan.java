abstract class Hewan {
    String nama;
    String jenis;
    int usia;

    public Hewan(String nama, String jenis, int usia) {
        this.nama = nama;
        this.jenis = jenis;
        this.usia = usia;
    }

    public abstract void makan();
    public abstract void tidur();
    public abstract void bergerak();
}
