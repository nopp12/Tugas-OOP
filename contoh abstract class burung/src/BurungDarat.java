class BurungDarat extends Bird {
    public BurungDarat(String nama, int usia) {
        super(nama, usia, "Burung Darat");
    }

    public void suara() {
        System.out.println(nama + " berkicau.");
    }

    public void terbang() {
        System.out.println(nama + " terbang rendah.");
    }
}