import java.util.Random;

public class Atvd7 {
    public static Random gerador = new Random(7);
    public static final int TAM = 10;
    public static void main (String[] args) {
        int[][] m = new int[TAM][TAM];
        preencherComRegras(m);
        imprimir(m);
        

    }

    public static void preencherComRegras(int[][] m) {
        for (int i = 0; i < m.length; i += 1) {
            for (int j = 0; j < m[0].length; j += 1) {
                if (i < j) {
                    m[i][j] = (2 * i) + (7 * j) - 2;

                }else if (i == j) {
                    m[i][j] = (3 * (int)Math.pow(i, 3)) - 1;

                } else {
                    m[i][j] = (4 * (int)Math.pow(i, 3) - (5 * (int)Math.pow(j, 2)));

                }

            }
        }
    }
    public static void imprimir(int[][] m) {
        for (int i = 0; i < m.length; i += 1) {
            for (int j = 0; j < m[0].length; j += 1) {
                if (m[i][j] < 10) {
                    System.out.printf("000");
                } else if(m[i][j] < 100) {
                    System.out.printf("00");

                } else if(m[i][j] < 1000) {
                    System.out.printf("0");
                }
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println(" ");
        }
    }
}
