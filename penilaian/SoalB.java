package penilaian;

import java.util.Scanner;

public class SoalB {
    public static void main(String[] args) {
        int hari=5, stok, stokAkhir=0, i=1;

        Scanner s = new Scanner(System.in);

        while (i <= hari) {
            System.out.println("Masukkan stok barang hari ke-" +i);
            stok = s.nextInt();
            stokAkhir += stok;
            i++;
        }
        System.out.println("Jumlah Keseluruhan barang setelah 5 Hari adalah " +stokAkhir);
        
    }
}
