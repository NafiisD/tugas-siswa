import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        int angka1, angka2, menu, hasil;

        Scanner s = new Scanner(System.in);
        System.out.println("Kalkulator Sempurna");
        System.out.println("====================");
        System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Pembagian\n4. Perkalian");
        menu = s.nextInt();

        System.out.println("Masukkan angka Pertama : ");
        angka1 = s.nextInt();
        System.out.println("==============================");
        System.out.println("Masukkan angka Kedua : ");
        angka2 = s.nextInt();

        switch (menu) {
            case 1:
            hasil = angka1 + angka2;
            System.out.println("Hasil Penjumlahan = " +hasil);
            break;

            case 2:
            hasil = angka1 - angka2;
            System.out.println("Hasil Pengurangan = " +hasil);
            break;

            case 3:
            hasil = angka1 / angka2;
            System.out.println("Hasil Pembagian = " +hasil);
            break;

            case 4:
            hasil = angka1 * angka2;
            System.out.println("Hasil Perkalian = " +hasil);

                break;
        
            default:
                break;
        }
    }
}