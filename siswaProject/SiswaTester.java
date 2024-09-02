package siswaProject;

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
        System.out.println("--------------------");

        Siswa rehan = new Siswa();
        rehan.setId(29);
        rehan.setNama("Raihan");
        rehan.setIpk(5.5);
        rehan.print();
        System.out.println("--------------------");

        Siswa nero = new Siswa();

        // tambahan
        nero.setId(11);
        nero.setNama("Dinero");
        nero.setIpk(99.5);
        nero.print();
        System.out.println("--------------------");

        Siswa jeki = new Siswa();
        jeki.setId(3);
        jeki.setNama("Jeki");
        jeki.setIpk(100.1);
        jeki.print();
        System.out.println("--------------------");
        

        Siswa davin = new Siswa();
        davin.setId(8);
        davin.setNama("Davin");
        davin.setIpk(5.5);
        davin.print();
        System.out.println("--------------------");

        Siswa dimas = new Siswa();
        dimas.setId(10);
        dimas.setNama("Dimas");
        dimas.setIpk(99.9);
        dimas.print();
        System.out.println("--------------------");

        Siswa aidan = new Siswa(20, "aidan", 99.5);
        aidan.print();
        System.out.println("--------------------");
    }
}
