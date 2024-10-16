package array;

import java.util.Scanner;

public class menuMakanan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah menu : ");
        int jumlah = s.nextInt();
        String makanan[] = new String[jumlah];
        int harga[] = new int[jumlah];

        for (int i = 0; i < makanan.length; i++) {
            System.out.println("Menu " +(i+1)+" :");
            makanan[i]= s.next();
            System.out.println("Harga "+ makanan[i]+" :");
            harga[i]= s.nextInt();

        }

        System.out.println("<==]====> DAFTAR MENU <====[==>");
        for (int i = 0; i < makanan.length; i++) {
            System.out.println(makanan[i]+" :"+harga[i]);
            
        }

    }
}
