package tokoMainan;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Kaset atau DVD?");
        String pilihan = in.nextLine();
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("Nomer : ");
        int angka = in.nextInt();
        System.out.println("Kuantitas : ");
        int kuantitas = in.nextInt();
        System.out.println("Harga : ");
        double harga = in.nextDouble();
        in.nextLine(); //reset Scanner
        if(pilihan.equalsIgnoreCase("CD")) {
            System.out.println("Artis : ");
            String artis = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Total lagu : ");
            int numSong = in.nextInt();
            in.nextLine();

            CD c1 = new CD(numSong, artis, label, angka, nama, harga, kuantitas);
            c1.print();

        } else if(pilihan.equalsIgnoreCase("DVD")) {

        }
        in.close();
    }
}
