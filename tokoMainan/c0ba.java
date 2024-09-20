package tokoMainan;

import java.util.Scanner;

public class c0ba {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Berapa jumlah objek?");
        int jumlah = in.nextInt();

        while (jumlah > 10 || jumlah <1){
            System.out.println("Program Tidak bisa dijalankan");
            return;
        }

        // kondisi
        for(int i = 1; i <=10; i++){
            try {
                System.out.println("Silahkan pilih 1.kaset atau 2.DVD");
                int pilihan = in.nextInt();
    
                if (pilihan == 1) {
                    kaset c1 = new kaset();
                    c1.print();
    
                } else if (pilihan == 2) {
                    DVD c2 = new DVD();
                    c2.print();
    
                } else {
                    System.out.println("ERROR!");
                }

                } catch (Exception e) {
                    System.out.println("Data hanya bisa di isi dengan Angak!");
            }
        }
                    in.close();
    }
}
