class Vaksinasi extends CatatanKesehatan {
    private String jenisVaksin;

    public Vaksinasi(String tanggal, String keterangan, String jenisVaksin) {
        super(tanggal, keterangan);
        this.jenisVaksin = jenisVaksin;
    }

    @Override
    public String getInfo() {
        return "Vaksinasi pada " + tanggal + ": " + keterangan + " (Jenis Vaksin: " + jenisVaksin + ")";
    }
}