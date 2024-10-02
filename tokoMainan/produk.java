package tokoMainan;
// inheritance (pewarisan)

public class produk {
    private int angka;
    private int kuantitas;
    private String nama;
    private double harga;

    public produk() {
        angka = 0;
        kuantitas = 0;
        nama = "";
        harga = 0.0;
    }

    public produk(int a, int k, String n, double h) {
        this.angka= angka;
        this.kuantitas= kuantitas;
        this.nama= nama;
        this.harga= harga; 
    }

    public int getAngka() {
        return this.angka;
    }

    public void setAngka(int angka) {
        this.angka = angka;
    }

    public int getKuantitas() {
        return this.kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void print() {
        System.out.println("Nama\t: " +nama);
        System.out.println("Kuantitas: " +kuantitas);
        System.out.println("Angka\t: " +angka);
        System.out.println("Harga\t: " +harga);
    }
}
