package UKL;

import java.util.Scanner;

public class sulit1 {
    public static void main(String[] args) {
        System.out.print("Sistem rekap absen kehadiran Siswa");
        Scanner s = new Scanner(System.in);
        double totalAbsen = 0.0, rataKehadiran = 0.0;

        System.out.print("Masukkan Jumlah Siswa : ");
        int jumlahSiswa = s.nextInt();
        int[] absenSiswa = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++){
            System.out.print("Masukkan jumlah absen Siswa Ke - " +(i + 1)+ " : ");
            absenSiswa[i] = s.nextInt();

            totalAbsen += absenSiswa[i];
        }
        rataKehadiran = totalAbsen/jumlahSiswa;
        System.out.print("Rata-rata Kehadiran dari " +jumlahSiswa+ " Siswa Adalah " +rataKehadiran);

        System.out.println(" ");
        System.out.println("\n=== Kesimpulan ===");
        System.out.println(" ");
        System.out.println("Siswa dengan Kehadiran di atas Rata-rata : ");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (absenSiswa[i] > rataKehadiran) {
                System.out.println("Siswa ke-" + (i + 1) + " memiliki kehadiran di atas rata-rata (" + absenSiswa[i] + " hari).");

            }
        }
        System.out.println("--------------------");
        System.out.println("Siswa dengan Kehadiran di bawah Rata-rata : ");
        for(int i = 0; i < jumlahSiswa; i++){
            if (absenSiswa[i] < rataKehadiran) {
                System.out.println("Siswa ke-" + (i + 1) + " memiliki kehadiran di bawah rata-rata (" + absenSiswa[i] + " hari).");
    
            }
        }
    }
}
