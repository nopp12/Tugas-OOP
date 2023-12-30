import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Hewan {
    private String nama;
    private String jenis;
    private int umur;
    private String jenisKelaminHewan;
    private List<Double> pengeluaranMingguan = new ArrayList<>();

    public Hewan(String nama, String jenis, String jenisKelaminHewan, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.jenisKelaminHewan = jenisKelaminHewan;
    }
    public void tambahPengeluaranMakanan(double pengeluaran) {
        pengeluaranMingguan.add(pengeluaran);
    }

    public double hitungRataRataPengeluaranBulanan() {
        double totalPengeluaran = 0.0;
        for (Double pengeluaranMingguan : pengeluaranMingguan) {
            totalPengeluaran += pengeluaranMingguan;
        }
        return totalPengeluaran / pengeluaranMingguan.size();
    }

    public void inputPengeluaranMingguan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Pengeluaran Makanan per Minggu:");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Minggu " + i + ": Rp ");
            double pengeluaran = scanner.nextDouble();
            tambahPengeluaranMakanan(pengeluaran);
        }
    }
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }
    
    public String getJenisKelamin() {
        return jenisKelaminHewan;
    }

    public int getUmur() {
        return umur;
    }

    @Override
    public String toString() {
        return "Hewan: " + nama + " (" + jenis + ", " + jenisKelaminHewan + ", " + umur + " tahun)";
    }
    public Object getPemilik() {
        return null;
    }
}
