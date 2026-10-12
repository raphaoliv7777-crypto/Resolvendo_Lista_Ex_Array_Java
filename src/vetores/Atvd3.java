import java.util.Random;
public class Atvd3 {
    public static Random gerador = new Random(7);
    public static final int TAM = 10;
    public static void main(String[] args) {
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        preencher(a, b);
        imprimir(a, "A");
        imprimir(b, "B");
        
    }

    public static void preencher(int[] a, int[] b) {
        for (int i = 0; i < a.length; i += 1) {
            a[i] = gerador.nextInt(10);
            b[i] = (int)Math.pow(a[i], 2);
        }
    }

    public static void imprimir (int[] v, String l) {
        System.out.printf("\n==========VETOR %s========\n", l);
        for (int i = 0; i < v.length; i += 1) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println(" ");
    }
    
}
