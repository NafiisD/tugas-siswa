package Pr;

import java.util.Scanner;

public class deretWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan batas awal : ");
        int awal = s.nextInt();
        System.out.println("Masukkan batas akhir : ");
        int akhir = s.nextInt();
        System.out.println("Masukkan beda : ");
        int beda = s.nextInt();

        System.out.println("Deret aritmatika : ");
        int i = awal;
        while (i <= akhir){
            System.out.print(i+ ", ");
            i+=beda;
        }
        s.close();
    }
}
