package datasekolah;

import java.util.Scanner;

public class testerArrayy {
        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingin Memasukkan data berapa?");
        int data = in.nextInt();
        System.out.println();

        System.out.println("Pilihan : ");
        System.out.println("1. Person\n2. Student\n3. Teacher");

        int pilihan = in.nextInt();
        System.out.println();

        person p[] = new person[20];

        for (int i = 1; i <= data; i++) {
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nama : ");
                    String name = in.next();
                    System.out.println("Masukkan umur : ");
                    int age = in.nextInt();
                    p[0] = new person(age, name);
                    p[0].print();
                    break;

                case 2:
                    System.out.println("Masukkan nama : ");
                    String name2 = in.next();
                    System.out.println("Masukkan umur : ");
                    int age2 = in.nextInt();
                    System.out.println("Masukkan number : ");
                    int studentNumber = in.nextInt();
                    System.out.println("Masukkan score : ");
                    int score = in.nextInt();
                    System.out.println("Masukkan major : ");
                    String major = in.next();
                    p[1] = new Student(score, studentNumber, major, age2, name2);
                    p[1].print();

                    break;

                case 3:
                    System.out.println("Masukkan nama : ");
                    String name3 = in.next();
                    System.out.println("Masukkan umur : ");
                    int age3 = in.nextInt();
                    System.out.println("Masukkan subject : ");
                    String subject = in.next();

                    p[2] = new teacher(subject, age3, name3);
                    p[2].print();

                default:
                
                    break;
            }

        }
    }
}
