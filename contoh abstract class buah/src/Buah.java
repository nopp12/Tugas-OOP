abstract class Buah extends Plant {
    String rasa;
    String kandunganNutrisi;

    public Buah(String nama, double tinggi, String rasa, String kandunganNutrisi) {
        super(nama, tinggi);
        this.rasa = rasa;
        this.kandunganNutrisi = kandunganNutrisi;
    }

    public abstract void matang();
}
