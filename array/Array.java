package array;
public class Array {
    
    public static void main(String[] args) {
        
        String siswa[];
        int []usia;
        char jenisKelamin[] = new char[2];
        String murid[] = {"Juna", "Purnomo", "Gatot"};
        String alamat[] = {"Malang", "Pandaan"};
        int berat[] = {45, 75, 34, 51};

        System.out.println(murid[2]);
        System.out.println(alamat[1]);
        System.out.println(berat[2]);

        for (int i = 0; i < murid.length; i++) {
            System.out.println(murid[i]);
        }
    }
}
