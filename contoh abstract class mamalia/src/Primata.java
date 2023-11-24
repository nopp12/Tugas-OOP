class Primata extends Mamalia {
    public Primata(String nama, int usia) {
        super(nama, usia, "Primata");
    }

    public void suara() {
        System.out.println(nama + " membuat suara.");
        System.out.println(nama + " adalah: "+jenis);
    }

    public void menyusui() {
        System.out.println(nama + " sedang menyusui.");
    }
}