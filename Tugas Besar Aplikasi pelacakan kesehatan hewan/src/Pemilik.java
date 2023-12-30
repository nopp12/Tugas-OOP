class Pemilik {
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Pemilik(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    @Override
    public String toString() {
        return "Pemilik: " + nama + " (Alamat: " + alamat + ", Nomor Telepon: " + nomorTelepon + ")";
    }
}