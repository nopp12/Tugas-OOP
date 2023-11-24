class Bunga extends Plant {
    public Bunga(String nama, double tinggi) {
        super(nama, "Bunga", tinggi);
    }

    public void tumbuh() {
        this.tinggi += 0.1;
        System.out.println(jenis + nama + " tumbuh menjadi " + tinggi + " meter.");
    }
}