import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan nama hewan: ");
        String namaHewan = scanner.nextLine();
        System.out.print("Masukkan jenis hewan: ");
        String jenisHewan = scanner.nextLine();
         System.out.print("Masukkan jenis kelamin hewan: ");
        String jenisKelaminHewan = scanner.nextLine(); 
        System.out.print("Masukkan umur hewan: ");
        int umurHewan = scanner.nextInt();
        scanner.nextLine();

        Hewan hewan = new Hewan(namaHewan, jenisHewan, jenisKelaminHewan, umurHewan);

   
        System.out.print("\nMasukkan nama pemilik: ");
        String namaPemilik = scanner.nextLine();
        System.out.print("Masukkan alamat pemilik: ");
        String alamatPemilik = scanner.nextLine();
        System.out.print("Masukkan nomor telepon pemilik: ");
        String nomorTeleponPemilik = scanner.nextLine();

        Pemilik pemilik = new Pemilik(namaPemilik, alamatPemilik, nomorTeleponPemilik);

        ArrayList<CatatanKesehatan> catatanKesehatanList = new ArrayList<>();

  
        while (true) {
            System.out.println("\n--- Menu Utama ---");
            System.out.println("1. Catat Kunjungan ke Dokter Hewan");
            System.out.println("2. Catat Vaksinasi");
            System.out.println("3. Lihat Riwayat Kesehatan");
            System.out.println("4. Cek Informasi Hewan");
            System.out.println("5. Cek Informasi Pemilik");
            System.out.println("6. Hitung Pengeluaran Makanan");
            System.out.println("7. Masukkan Pengeluaran Makanan");
            System.out.println("8. Keluar");

            System.out.print("Pilih menu (1-8): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan tanggal kunjungan ke dokter hewan (format: dd/mm/yyyy): ");
                    String tanggalKunjungan = scanner.nextLine();
                    System.out.print("Masukkan diagnosa dokter hewan: ");
                    String diagnosa = scanner.nextLine();
                    System.out.print("Masukkan nama dokter: ");
                    String namaDokter = scanner.nextLine();

                    KunjunganDokter kunjunganDokter = new KunjunganDokter(tanggalKunjungan, diagnosa, namaDokter);
                    catatanKesehatanList.add(kunjunganDokter);

                    System.out.println("Kunjungan berhasil dicatat.");
                    break;

                case 2:
                    System.out.print("\nMasukkan tanggal vaksinasi (format: dd/mm/yyyy): ");
                    String tanggalVaksinasi = scanner.nextLine();
                    System.out.print("Masukkan jenis vaksin: ");
                    String jenisVaksin = scanner.nextLine();
                    Vaksinasi vaksinasi = new Vaksinasi(tanggalVaksinasi, "Vaksinasi", jenisVaksin);
                    catatanKesehatanList.add(vaksinasi);

                    System.out.println("Vaksinasi berhasil dicatat.");
                    break;

                case 3:
                    System.out.println("\n--- Riwayat Kesehatan ---");
                    for (CatatanKesehatan catatan : catatanKesehatanList) {
                        System.out.println(catatan.getInfo());
                    }
                    break;

                case 4:
                    System.out.println("\n--- Informasi Hewan ---");
                    System.out.println(hewan.toString());
                    if ("betina".equalsIgnoreCase(hewan.getJenisKelamin())) {
                        System.out.println("Peringatan!!!: Hewan betina. Harap diawasi dan dibatasi kehamilannya.");
                    } else {
                        System.out.println("Informasi: Hewan bukan betina.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Informasi Pemilik ---");
                    System.out.println(pemilik.toString());
                    break;
                
               
                case 7:
                    hewan.inputPengeluaranMingguan();
                    System.out.println("Pengeluaran makanan berhasil dicatat.");
                    break;

                case 6:
                    hitungPengeluaranMakanan(hewan);
                    break;
        
                case 8:
                    System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa!");
                    System.exit(0);
                    break;


                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar (1-4).");
            }
        }
    }

    private static void hitungPengeluaranMakanan(Hewan hewan) {
        System.out.println("Rata-rata Pengeluaran Makanan selama satu Bulan: Rp " + hewan.hitungRataRataPengeluaranBulanan());
    }
}