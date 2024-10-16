package ujianh;

import java.util.Scanner;

public class Testerr {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Silahkan Memilih!");
        System.out.println("1. Circle\n2. Rectangle");
        String pilihan = t.next();

        System.out.println("Masukkan Warna : ");
        String color = t.next();

        if(pilihan.equalsIgnoreCase("1")){
            System.out.println("Masukkan Radius :");
            int radius = t.nextInt();
            Circle c = new Circle("Circle", color, radius);
            c.print();
            c.luas(radius);
        }

        if(pilihan.equalsIgnoreCase("2")){
            System.out.println("Silahkan Pilih!");
            System.out.println("1. Rectangle\n2. Cube");
            String choice = t.next();

            if(choice.equalsIgnoreCase("1")){
                System.out.println("Masukkan Panjang :");
                int lenght = t.nextInt();
                System.out.println("Masukkan Lebar :");
                int width = t.nextInt();
                Rectangle r = new Rectangle("Rectangle", color, lenght, width);
                r.print();
                r.luas();
            }

            if(choice.equalsIgnoreCase("2")){
                System.out.println("Masukkan Tinggi :");
                int height = t.nextInt();
                System.out.println("Masukkan Panjang :");
                int lenght = t.nextInt();
                System.out.println("Masukkan Lebar :");
                int width = t.nextInt();
                Cube b = new Cube("Cube", color, lenght, width, height);
                b.print();
                b.luas();
            }
        }
    }
}
