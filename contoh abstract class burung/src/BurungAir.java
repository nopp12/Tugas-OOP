class BurungAir extends Bird {
    public BurungAir(String nama, int usia) {
        super(nama, usia, "Burung Air");
    }

    public void suara() {
        System.out.println(nama + " berbunyi.");
    }

    public void terbang() {
        System.out.println(nama + " berenang.");
    }
}