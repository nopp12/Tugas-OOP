class Apel extends Buah {
    public Apel(String nama, double tinggi, String rasa, String kandunganNutrisi) {
        super(nama, tinggi, rasa, kandunganNutrisi);
    }

    public void tumbuh() {
        this.tinggi += 0.1;
        System.out.println(nama + " tumbuh menjadi " + tinggi + " meter.");
    }

    public void matang() {
        System.out.println(nama + " matang dengan rasa " + rasa + " dan kandungan nutrisi " + kandunganNutrisi + ".");
    }
}