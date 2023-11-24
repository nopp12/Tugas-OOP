class Pohon extends Plant {
    public Pohon(String nama, double tinggi) {
        super(nama, "Pohon", tinggi);
    }

    public void tumbuh() {
        this.tinggi += 0.5;
        System.out.println(jenis + nama + " tumbuh menjadi " + tinggi + " meter.");
    }
}