package instrument;

public class Instrument {

    private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Instrument() {
        type = "kosong";
        price = 0;
    }

    public Instrument(String y, double r) {
        type = y;
        price = r;
    }

    public void print() {
        System.out.println("Type: " +type);
        System.out.println("Price: " +price);
    }
}
