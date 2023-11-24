abstract class Shape {
    String nama;
    String warna;

    public Shape(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public String getNama() {
        return this.nama;
    }

    public String getWarna() {
        return this.warna;
    }

    public abstract void draw();
}