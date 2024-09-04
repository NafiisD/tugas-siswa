import java.util.Scanner;

public class soalC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int menu, bJava, bNode;
        double hJava, hNode, diskon, total, totalDiskon;

        hJava = 50000;
        hNode = 75000;
        diskon = 0.1;

        System.out.println("Masukkan jumlah buku");
        System.out.println("Buku Java : ");
        bJava = s.nextInt();
        System.out.println("Buku Node : ");
        bNode = s.nextInt();

        if (bJava <=3 && bNode <=3){
            total = (hJava*bJava)+(hNode*bNode);
            System.out.println("Total harga " +total+ "Tanpa diskon");
        }else if(bJava >3 && bNode >3) {
            totalDiskon = diskon* ((hJava*bJava)+(hNode*bNode));
            total = ((hJava*bJava)+(hNode*bNode)) - totalDiskon;
            System.out.println("Total harga " +total+ " Dengan diskon");
        }
       
    }
}
