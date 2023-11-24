class Karnivora extends Mamalia {
    public Karnivora(String nama, int usia) {
        super(nama, usia, "Carnivora");
    }

    public void suara() {
        System.out.println(nama + " mengaum.");
        System.out.println(nama + " adalah: "+jenis);
    }

    public void menyusui() {
        System.out.println(nama + " sedang menyusui.");
    }
}