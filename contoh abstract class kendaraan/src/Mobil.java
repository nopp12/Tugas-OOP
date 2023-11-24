class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama);
    }

    public void suaraKendaraan() {
        System.out.println("Suara kendaraan " + getNama() + " adalah: Brrrroooooommm");
    }
}
