abstract class CatatanKesehatan {
    protected String tanggal;
    protected String keterangan;

    public CatatanKesehatan(String tanggal, String keterangan) {
        this.tanggal = tanggal;
        this.keterangan = keterangan;
    }

    public abstract String getInfo();
}