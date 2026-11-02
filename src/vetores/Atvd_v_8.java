import java.util.Random;
public class Atvd_v_8 {
    public static Random gerador = new Random(7);
    public static final int TAM = 6;
    public static void main (String[] args) {
        int[] a = new int[TAM];
        preencher(a);
        imprimir(a);
        imprimirInverso(a);

    }
    public static void preencher (int[] a) {
        for (int i = 0; i < a.length; i += 1) {
            a[i] = gerador.nextInt(100);
        }
    }

    public static void imprimir (int[] a) {

        for (int i = 0; i < a.length; i += 1) {
            System.out.printf("%d ", a[i]);
        }
    }

    public static void imprimirInverso(int[] a) {
        System.out.println("\n======ORDEM INVERSA =======");
        for (int i = a.length - 1; i >= 0; i -= 1) {
            System.out.printf("%d ", a[i]);
        }
    }
    
}
