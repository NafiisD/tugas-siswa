package methodJava;

import java.util.Scanner;

public class bilPrima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Angka :");
        int angka = in.nextInt();
        boolean prima = true;
        for (int i = 2; i < angka ; i++) {
            if (angka%i == 0) {
                prima = false;

                break;
            }
        }
        if (prima){
            System.out.println(angka + " Merupakan bilangan Prima");
        }else {
            System.out.println(angka + " Bukan Bilangan Prima");
        }
    }
}
