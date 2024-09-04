import java.util.Scanner;

public class wikusama {
    public static void main(String[] args) {
        String perilaku, nama, kelas;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Akan diadakan seleksi untuk menjadi Duta Wikusama!");
        System.out.println("Masukkan namamu: ");
        nama = s.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = s.nextLine();

        if(kelas.equalsIgnoreCase("X") || kelas.equalsIgnoreCase("XI")) {
            System.out.println("Perilaku Siswa (Baik/Buruk)");
            perilaku = s.nextLine();
            if(perilaku.equalsIgnoreCase("Baik")) {
                System.out.println("Masukkan nilai anda: ");
                nilai = s.nextInt();

                if(nilai >=90) {
                    System.out.println("Selamat anda telah lolos seleksi!");
                }else{
                    System.out.println("Anda tidak lolos karena nilai!");
                }
            }else{
                System.out.println("Perilaku anda Buruk!");
            }
        }else{
            System.out.println("Berarti anda sudah kelas XII");
        }
        
    }
}
