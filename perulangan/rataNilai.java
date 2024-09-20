package perulangan;

import java.util.Scanner;

public class rataNilai {
    public static void main(String[] args) {
        int i=1, nilai, jumlahSiswa, totalNilai=0;
        double rataRata;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Nilai: ");
        jumlahSiswa = s.nextInt();

        while(i<=jumlahSiswa){
            System.out.println("Masukkan Nilai Siswa: " +i);
            nilai = s.nextInt();
            totalNilai+=nilai;
            i++;
        }


        rataRata=totalNilai/jumlahSiswa;
        System.out.println("Total nilai dari " +jumlahSiswa+":" +totalNilai);
        System.out.println("Rata-rata : " +rataRata);

        
    }
}
