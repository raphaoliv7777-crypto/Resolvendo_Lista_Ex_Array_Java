import java.util.Random;
public class Atvd11 {
    public static final int TAM = 4;
    public static Random gerador = new Random(7);
    public static void main (String[] args) {
        int[][] m = new int [TAM][TAM];
        preencher(m);
        int soma = somaDiagonalSecundaria(m);
        imprimir(m);
        System.out.println("soma dos elementos na diagonal secundária: " + soma);
    }

    public static void preencher (int[][] m) {
        for (int i = 0; i < m.length; i += 1) {
            for (int j = 0; j < m[0].length; j += 1) {
                m[i][j] = gerador.nextInt(10);
            }
        }
    }

    public static int somaDiagonalSecundaria (int[][] m) {
        int soma = 0;
        int j = m[0].length - 1;
        int i = 0;
        while (i < m.length) {
            soma += m[i][j];
            j -= 1;
            i += 1;
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
