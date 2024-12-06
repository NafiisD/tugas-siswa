package tokoMainan;

public class testerArray {
    public static void main(String[] args) {

        //method static
        System.out.println("Hasil : "+tambah(2,3));
       
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        if (a > b){
            return a - b;
        }else{
            return b - a;
        }
    }
}
