package perulangan;

import java.util.Scanner;

public class repeatFor {
    public static void main(String[] args) {
        int nilaiAtas, nilaiBawah;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Angak pertama: ");
        nilaiAtas = s.nextInt();
        System.out.println("Masukkan angka terakhir: ");
        nilaiBawah = s.nextInt();
        System.out.println();
        for (int i = nilaiAtas; i <=nilaiBawah; i++) {
            if (i%2==0){
                System.out.print(i+ ", ");
            }
        }
            
    }
}
