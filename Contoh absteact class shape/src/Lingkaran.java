class Lingkaran extends Shape {
    public Lingkaran(String nama, String warna) {
        super(nama, warna);
    }

    public void draw() {
        System.out.println("Menggambar " + getNama() + " berwarna " + getWarna());
    }
}