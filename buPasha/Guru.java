package buPasha;

public class Guru {
    // Contructor (untuk membangun objek)
    String nama, mapel, status;
    int nip;

    // Constructor Parameter
    public Guru(String n, String m, String s, int i) {
        nama = n;
        mapel = m;
        status = s;
        nip = i;

    }

    // Method
    public void print() {
        System.out.println("Nama : " +nama);
        System.out.println("Mapel : " +mapel);
        System.out.println("Status : " +status);
        System.out.println("NIP : " +nip);
    }

    
}
