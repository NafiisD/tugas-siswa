package contohSoalUKL;

import java.util.Scanner;

public class soalSedang {
    public static void main(String[] args) {
        int i=1, nilai, jumlahSiswa, totalNilai=0;
        double rataRata;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa: ");
        jumlahSiswa = s.nextInt();

        while(i<=jumlahSiswa){
            System.out.println("Masukkan Nilai Siswa: " +i);
            nilai = s.nextInt();
            totalNilai+=nilai;
            i++;
        }


        rataRata=totalNilai/jumlahSiswa;
        System.out.println("Total Siswa dalam Ujian " +jumlahSiswa);
        System.out.println("Rata-rata : " +rataRata);


    }
}
