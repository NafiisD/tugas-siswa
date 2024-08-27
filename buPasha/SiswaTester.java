package buPasha;

import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Id : ");
        int id = input.nextInt();
        System.out.println("Ipk : ");
        double ipk = input.nextDouble();
        input.close();
        // membuat Objek
        // namaClass namaObjek = newConstructor():
        Siswa rehan = new Siswa();
        rehan.id = 23;
        rehan.nama = "Raihan Ardhanis Raharja";
        rehan.ipk = 100.0;
        rehan.print();
        System.out.println("--------------------");

        Siswa nero = new Siswa();

        // tambahan
        nero.id = 11;
        nero.nama = "Dinero Sulung Suseno";
        nero.ipk = 86.5;
        nero.print();
        System.out.println("--------------------");

        Siswa jeki = new Siswa();
        jeki.id = 3;
        jeki.nama = "Ananda Valentino Zaky";
        jeki.ipk = 55.5;
        jeki.print();
        System.out.println("--------------------");
        

        Siswa davin = new Siswa();
        davin.id = 8;
        davin.nama = "Davin Falih Ramadhan";
        davin.ipk = 5.0;
        davin.print();
        System.out.println("--------------------");

        Siswa dimas = new Siswa();
        dimas.id = 10;
        dimas.nama = "Dimas Ardiyan Firmansyah";
        dimas.ipk = 99.5;
        dimas.print();
        System.out.println("--------------------");

        Siswa aidan = new Siswa(20, "aidan", 99.5);
        aidan.print();
        System.out.println("--------------------");
    }
}
