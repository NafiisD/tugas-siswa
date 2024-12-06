package array;

public class Matriks {
    public static void main(String[] args) {
        int matriksA[][]={{1,2,3},{4,5,6}};
        int matriksB[][]={{7,8,9},{10,11,12}};
        int matriksC[][]=new int[2][3];

        for (int i = 0; i < matriksA.length; i++){
            for (int j = 0; j < matriksA[i].length; j++) {
                matriksC[i][j]=matriksA[i][j]+matriksB[i][j];
            }
        }

        System.out.println("Penjualan Matriks A+B");
        for (int i = 0; i < matriksC.length; i++) {
            for (int j = 0; j < matriksC[i].length; j++) {
                System.out.println(matriksC[i][j]+" ,");
            }
            System.out.println();
        }
    }
}
