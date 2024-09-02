package teast;


public class Guru {
    // Contructor (untuk membangun objek)
    private String nama, mapel, status;
    private int nip;

    public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getNip() {
        return this.nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }


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
