package tokoMainan;

public class DVD extends produk {
    private int lenght;
    private String rating;
    private String studio;

	public DVD (){
		super();
		lenght = 0;
		rating = "";
		studio = "";
	}

	public DVD (int angka, int kuantitas, String nama, double harga, int lenght, String rating, String studio){
		super(angka, kuantitas, nama, harga);
		this.lenght = lenght;
		this.rating = rating;
		this.studio = studio;
	}

	public int getLenght() {
		return this.lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getStudio() {
		return this.studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

    public void print() {
        System.err.println("Lenght\t: " +lenght);
        System.err.println("Rating\t: " +rating);
        System.err.println("Studio\t: " +studio);
    }
}