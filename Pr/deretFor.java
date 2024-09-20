package Pr;

import java.util.Scanner;

public class deretFor {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan batas awal : ");
        int awal = s.nextInt();

        System.out.println("Masukkan batas akhir : ");
        int akhir = s.nextInt();

        System.out.println("Masukkan beda : ");
        int beda = s.nextInt();

        System.out.println("Deret Aritmatika : ");
        for (int i = awal; i<=akhir; i += beda){
            System.out.print(i+ ", ");
        }
        s.close();
    }
}
