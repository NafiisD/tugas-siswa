package tokoMainan;

public class DVD {
    private int lenght;
    private String rating;
    private String studio;

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