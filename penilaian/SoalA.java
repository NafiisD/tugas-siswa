package penilaian;

import java.util.Scanner;

public class SoalA {
    public static void main(String[] args) {
        int jTiket=0, hari=7, i=1, tiket;
        double rataRata;

        Scanner s = new Scanner(System.in);

        while (i <= hari) {
            System.out.println("Masukkan jumlah tiket hari ke-" +i);
            tiket = s.nextInt();
            jTiket += tiket;
            i++;
        }
        System.out.println("Total tiket selama seminggu adalah " +jTiket);
        rataRata = jTiket/hari;
        System.out.println("Rata-rata penjualan tiket di bioskop adalah " +rataRata);
    }
}
