abstract class Mamalia extends Animal {
    String jenis;

    public Mamalia(String nama, int usia, String jenis) {
        super(nama, usia);
        this.jenis = jenis;
    }

    public abstract void menyusui();
}
