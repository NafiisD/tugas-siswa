package contohSoalUKL;

import java.util.Scanner;

public class soalMudah {
    public static void main(String[] args) {
        int bilangan;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Bilangan");
        bilangan = s.nextInt();
        
        cekBilangan(bilangan);

        s.close();
    }
    public static void cekBilangan(int bilangan) {

        if (bilangan % 2 == 0){
            System.out.println(bilangan+ " Merupakan Bilangan Genap");
        }else{
            System.out.println(bilangan+ " Merupakan Bilangan Ganjil");
        }
    }
}
