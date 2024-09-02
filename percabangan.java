
import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
       double total, diskon;
       Scanner s = new Scanner(System.in);
       System.out.println("Masukkan Total Belanja: ");
       total = s.nextDouble();
       if(total < 100000) {
        diskon = 0.1 * total;
        total = diskon;
       }else{
        System.out.println("Anda akan mendapatkan Spesial Gift");
       }
       System.out.println("Total belanjaan anda: " +total);
       System.out.println("Terima kasih telah berbelanja di toko kami!");
    }
}

// if adalah kondisi dimana ketika suatu progam dijalankan dan salah maka tidak terjadi apa apa, tapi jika if-else maka akan ada sesuatu pada program apabila program itu salah.