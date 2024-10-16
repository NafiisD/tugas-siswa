package ujianh;

public class Cube extends Rectangle{
    private int height;

    
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cube(String name, String color, int lenght, int width, int height){
        super(name, color, lenght, width);
        this.height= height;
    }

    public void print(){
        super.print();
        System.out.println("Height :" +height);
    }

    public void luas(int height){
        System.out.println("Luas :" +(6*height^2));
    }

}
