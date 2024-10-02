package datasekolah;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Silahkan Pilih : ");
        System.out.println("1. Student\n2. Teacher");
        String pilihan = s.nextLine();

        if(pilihan.equals("1")){
        System.out.println("Namanya : ");
        String name = s.nextLine();
        System.out.println("Jurusan : ");
        String major = s.nextLine();
        System.out.println("Umur : ");
        int age = s.nextInt();
        System.out.println("Nilainya : ");
        int score = s.nextInt();
        s.nextLine();
        System.out.println("NIS : ");
        int studentNumber = s.nextInt();
        Student student = new Student(score, studentNumber, major, age, name);
        student.print();

        }else if(pilihan.equals("2")){
            System.out.println("Pilih salah satu : ");
            System.out.println("1. Part Time\n2. Full Time");
            String pilihanA = s.nextLine();

            if(pilihanA.equals("1")){
                System.out.println("Detail :");
                System.out.println("Name : ");
                String name = s.nextLine();
                System.out.println("Subject : ");
                String subject = s.nextLine();
                System.out.println("Umur : ");
                int age = s.nextInt();
                s.nextLine();
                System.out.println("Jam Kerja : ");
                int hoursWorked = s.nextInt();
                s.nextLine();
                
                int salary = hoursWorked*200000;
                System.out.println("Total Gaji adalah : " +salary);

                partTime parttime = new partTime(subject, hoursWorked, salary, age, name);
                parttime.print();

            }else if(pilihanA.equals("2")){
                System.out.println("Detail : ");
                System.out.println("Nama : ");
                String name = s.nextLine();
                System.out.println("Unit Bagian : ");
                String unit = s.nextLine();
                System.out.println("Subject : ");
                String subject = s.nextLine();
                System.out.println("Anual Salary : ");
                int anualSalary = s.nextInt();
                System.out.println("Umur : ");
                int age = s.nextInt();

                fullTime fulltime = new fullTime(subject, anualSalary, unit, age, name);
                fulltime.print();
            }
        }       
    }
}
