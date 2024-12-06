package contohSoalUKL;

import java.util.Scanner;

public class soalSusah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] data = {
            {"1", "Galuh", "1", "Sawojajar", "1000"},
            {"2", "Indro", "3", "Blimbing", "2000"},
            {"3", "Jedi", "2", "Lowokwaru", "1500"},
            {"4", "Kanu", "3", "Klojen", "2000"},
        };
        System.out.print("Masukkan ID : ");
        String ID = input.next();
        System.out.print("Masukkan jumlah Kwh : ");
        int kwh = input.nextInt();

        if(ID.equals("1")){
            System.out.println();
            System.out.println("--------------------");
            System.out.println("Nama : " + data[0][1]);
            System.out.println("Golongan : " + data[0][2]);
            System.out.println("Alamat : " + data[0][3]);
            System.out.println("Jumlah Kwh : " + kwh);
            System.out.println("Harga : " + data[0][4]);
            System.out.println("Total bayar : " + Integer.parseInt(data[0][4])*kwh);
            System.out.println("--------------------");
            System.out.println();

        }

        if(ID.equals("2")){
            System.out.println();
            System.out.println("--------------------");
            System.out.println("Nama : " + data[1][1]);
            System.out.println("Golongan : " + data[1][2]);
            System.out.println("Alamat : " + data[1][3]);
            System.out.println("Jumlah Kwh : " + kwh);
            System.out.println("Harga : " + data[1][4]);
            System.out.println("Total bayar : " + Integer.parseInt(data[1][4])*kwh);
            System.out.println("--------------------");
            System.out.println();

        }

        if(ID.equals("3")){
            System.out.println();
            System.out.println("--------------------");
            System.out.println("Nama : " + data[2][1]);
            System.out.println("Golongan : " + data[2][2]);
            System.out.println("Alamat : " + data[2][3]);
            System.out.println("Jumlah Kwh : " + kwh);
            System.out.println("Harga : " + data[2][4]);
            System.out.println("Total bayar : " + Integer.parseInt(data[2][4])*kwh);
            System.out.println("--------------------");
            System.out.println();

        }

        if(ID.equals("4")){
            System.out.println();
            System.out.println("--------------------");
            System.out.println("Nama : " + data[3][1]);
            System.out.println("Golongan : " + data[3][2]);
            System.out.println("Alamat : " + data[3][3]);
            System.out.println("Jumlah Kwh : " + kwh);
            System.out.println("Harga : " + data[3][4]);
            System.out.println("Total bayar : " + Integer.parseInt(data[3][4])*kwh);
            System.out.println("--------------------");
            System.out.println();

        }
    }
}