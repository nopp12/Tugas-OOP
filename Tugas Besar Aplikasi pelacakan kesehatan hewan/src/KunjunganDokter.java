class KunjunganDokter extends CatatanKesehatan {
    private String namaDokter;

    public KunjunganDokter(String tanggal, String keterangan, String namaDokter) {
        super(tanggal, keterangan);
        this.namaDokter = namaDokter;
    }

    @Override
    public String getInfo() {
        return "Kunjungan Dokter pada " + tanggal + ", diagnosa " + keterangan + " (Dokter: " + namaDokter + ")";
    }
}