import java.util.Scanner;

class Main {
    public static void main(String[] args){
        String nama;
        Integer nim;
        double nilai_tubes, nilai_quiz, nilai_tugas, nilai_uts, nilai_uas;
        Scanner input = new Scanner(System.in);
        Nilai penghitung_nilai = new Nilai();

        System.out.println("Masukkan nama: ");
        nama = input.next();

        System.out.println("Masukkan NIM: ");
        nim = input.nextInt();

        System.out.println("Masukkan nilai tubes: ");
        nilai_tubes = input.nextDouble();

        System.out.println("Masukkan nilai quiz: ");
        nilai_quiz = input.nextDouble();

        System.out.println("Masukkan nilai tugas: ");
        nilai_tugas = input.nextDouble();

        System.out.println("Masukkan nilai uts: ");
        nilai_uts = input.nextDouble();

        System.out.println("Masukkan nilai uas: ");
        nilai_uas = input.nextDouble();


        double nilai_rata = penghitung_nilai.total_nilai(nilai_tubes, nilai_quiz, nilai_tugas, nilai_uts, nilai_uas);

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek : " + nilai_rata);

        input.close();
    }
}