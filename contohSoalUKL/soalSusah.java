package contohSoalUKL;

import java.util.Scanner;

public class soalSusah {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] golongan = {1, 2, 3, 4};
        String[] nama = {"Galuh", "Indro", "Jedi", "Kanu"};
        String[] alamat = {"Sawojajar", "Blimbing", "Lowokwaru", "Klojen"};
        double[] harga = {1000.0, 1500.0, 2000.0};

        System.out.println("Masukkan Jumlah ID :");
        int jumlahID = s.nextInt();

        for (int i = 1 ; i <= jumlahID ; i++){
            System.out.println("ID ke -" +i+ ":");
            int id =s.nextInt();
            System.out.println("Masukkan jumlah Kwh ID ke-" +i+ ":");
            int jumlahKwh = s.nextInt();

            if (id == 1) {
            System.out.println();
            System.out.println("--------------------");
            System.out.println("Nama :" + nama[0]);
            System.out.println("Golongan :" + golongan[0]);
            System.out.println("Alamat :" + alamat[0]);
            System.out.println("Jumlah Kwh :" + jumlahKwh);

            }    
        }
    }
}
