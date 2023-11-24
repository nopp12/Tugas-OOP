class Kucing extends Hewan {
    public Kucing(String nama, String jenis, int usia) {
        super(nama, jenis, usia);
    }

    public void makan() {
        System.out.println("Kucingku " + nama + " Dia berjenis " +jenis+ ",dengan usia " + usia + " tahun" + " sedang makan.");
    }

    public void tidur() { 
        System.out.println("Kucingku " + nama + " Dia berjenis " +jenis+ ",dengan usia " + usia + " tahun" + " sedang tidur.");
    }

    public void bergerak() {
        System.out.println("Kucingku " + nama + " Dia berjenis " +jenis+ ",dengan usia " + usia + " tahun" + " sedang bergerak.");
    }
}