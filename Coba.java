import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        int pilihan;
        String kelas;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan kelas Pilihan : ");
        System.out.println("1. XRPL 1\n2. XRPL 2\n3. XRPL 3\n4. XRPL 4\n5. XRPL 5");
        pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
            kelas = "X RPL 1";
            break;

            case 2:
            kelas = "X RPL 2";
            break;

            case 3:
            kelas = "X RPL 3";
            break;

            case 4:
            kelas = "X RPL 4";
            break;

            case 5:
            kelas = "X RPL 5";    

                break;
        
            default:
            kelas = "Kelas Tidak terdaftar";
                break;
        }

        System.out.println("Kelas: " +kelas);
        
    }
}
