

public class Siswa {
    //variabel
    int id;
    String nama;
    double ipk;

    // ts

    //Construstor (yang membangun objek)
    public Siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;

    }

    // Better
    // Setter
    // Method
    public void print() {
        System.out.println("ID = " +id);
        System.out.println("Nama = " +nama);
        System.out.println("IPK = " +ipk);
    }
}
