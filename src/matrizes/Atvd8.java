import java.util.Random;
public class Atvd8 {
    public static final int TAM = 5;
    public static Random gerador = new Random(7);
    public static void main (String[] args) {
        int[][] m = new int [TAM][TAM];
        preencher(m);
        int soma = somaSuperior(m);
        imprimir(m);
        System.out.println("soma da parte superior à diagonal: " + soma);
    }

    public static void preencher (int[][] m) {
        for (int i = 0; i < m.length; i += 1) {
            for (int j = 0; j < m[0].length; j += 1) {
                m[i][j] = gerador.nextInt(100);
            }
        }
    }

    public static int somaSuperior (int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i += 1) {
            for (int j = 0; j < m[0].length; j += 1) {
                if (j > i) {
                   soma += m[i][j];
                }
            }
        }
        return soma;
    }
    public static void imprimir (int[][] m) {
        for (int i = 0; i < m.length; i += 1) {
            for (int j = 0; j < m[0].length; j += 1) {
                if (m[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d ", m[i][j]);

            }
            System.out.println(" ");
        }

    }
    
}
