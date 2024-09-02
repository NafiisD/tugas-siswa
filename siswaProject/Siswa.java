package siswaProject;


public class Siswa {
    //variabel
    private int id;
    private String nama;
    private double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }


    //Construstor Default (yang membangun objek)
    public Siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;

    }
    // Constructor Parameter
    public Siswa(int i, String n, double k) {
        id = i;
        nama = n;
        ipk = k;
        
    }

    // Getter --> untuk mengambil nilai variabel
    public int getid() {
        return id;
    }

    // Setter --> untuk merubah nilai variabel
    public void setid(int id) {
        // dengan this itu variabel = tanpa this itu parameter
        this.id = id;
    }

    // Method
    public void print() {
        System.out.println("ID = " +id);
        System.out.println("Nama = " +nama);
        System.out.println("IPK = " +ipk);
    }
}
