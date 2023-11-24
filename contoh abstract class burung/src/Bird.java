abstract class Bird extends Burung {
    String jenis;

    public Bird(String nama, int usia, String jenis) {
        super(nama, usia);
        this.jenis = jenis;
    }

    public abstract void terbang();
}