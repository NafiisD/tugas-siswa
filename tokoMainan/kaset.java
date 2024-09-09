package tokoMainan;

public class kaset extends produk {
    private String artis;
    private int numSong;
    private String label;

    public kaset() {
        super(); //constructor dari superclass
        artis = "";
        numSong = 0;
        label = "";
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
