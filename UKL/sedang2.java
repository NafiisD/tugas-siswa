package UKL;

import java.util.Scanner;

public class sedang2 {

    public static class volumeTabung {
        
        // Fungsi untuk menghitung Volume tabung
        public static double hitungVolume(double jariJari){
            double phi = 3.14;
            return 4 * phi * jariJari * jariJari;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            
            System.out.print("Masukkan Jari-Jari Bola : ");
            double jariJari = s.nextDouble();

            double volume = hitungVolume(jariJari);

            System.out.print("Volume tabung Adalah : " +volume);
            s.close();
        }
    }
}