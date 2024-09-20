package perulangan;

import java.util.Scanner;

public class ulangi {
    public static void main(String[] args) {
        int nilaiAtas, nilaiBawah;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan batas atas: ");
        nilaiAtas = s.nextInt();
        System.out.println("Masukka batas bawah: ");
        nilaiBawah = s.nextInt();


        for(int i=nilaiAtas;i <=nilaiBawah; i++){
            if(i%6==0){
                int j=i;
                while(j==i){
                    if(j%10==0 && j!=0){
                        System.out.println("ERROR!");
                    }else{
                        System.out.println(j);
                    }
                        break;
                }
            }
        }
    }
}

