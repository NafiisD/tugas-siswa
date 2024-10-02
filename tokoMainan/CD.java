package tokoMainan;

public class CD extends produk {
    private String artis;
    private int numSong;
    private String label;

    public CD() {
        super(); //constructor dari superclass
        artis = "";
        numSong = 0;
        label = "";
    }

    public CD(int numSong, String artis, String label, int angka, String nama, double harga, int kuantitas){
        super(angka, kuantitas, nama, harga);
        this.artis = artis;
        this.numSong = numSong;
        this.label = label;

    }

    public String getArtis() {
        return this.artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void print() {
        super.print();
        System.out.println("Artis\t: " +artis);
        System.out.println("Num\t: " +numSong);
        System.out.println("Label\t: " +label);
    }
}
