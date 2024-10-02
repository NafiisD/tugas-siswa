package penilaian;

import java.util.Scanner;

public class SoalC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jumlahPegawai=5, i=1;
        double gaji, totalGaji=0;

        while (i <= jumlahPegawai) {
            System.out.println("Masukkan Gaji :" +i);
            gaji = s.nextInt();
            totalGaji += gaji;
            i++;
        }
        System.out.println("Berikut gaji Para pegawai :");
        System.out.print("Gaji Karyawan : " +totalGaji);
    }
}
