import java.util.Random;

public class Atvd_v_5 {
    public static final int TAM = 15;
    public static Random gerador = new Random(7);
    public static void main (String[] args) {
        int[] a = new int[TAM];
        preencher(a);
        imprimir(a);
        qtdPares(a);
    }

    public static void preencher (int[] a) {
        for (int i = 0; i < a.length; i += 1) {
            a[i] = gerador.nextInt(10);
        }
    }

    public static void qtdPares(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i += 1) {
            if (a[i] % 2 == 0) {
                contador += 1;
            }

        }

        System.out.printf("\nQUANTIDADE DE PARES: %d", contador);
    }

    public static void imprimir (int[] a) {
        for (int i = 0; i < a.length; i += 1) {
            System.out.printf("%2d", a[i]);
        }
    }
    
}
