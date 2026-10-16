import java.util.Random;

public class Atvd_v_14 {
    public static Random gerador = new Random(7);
    public static final int ARRAY_LENGTH = 10;
    public static void main(String[] args) {
        int[] a = new int[ARRAY_LENGTH];
        int[] valoresIguais = new int[ARRAY_LENGTH];

        
        preencher(a);
        int tamV = verificarIgual(a, valoresIguais);
        imprimir(valoresIguais, tamV);
        
        
    }
        public static void preencher(int[] a) {
        for (int i = 0; i < a.length; i += 1) {
            a[i] = gerador.nextInt(10);
            System.out.printf("%d ", a[i]);
        }
        System.out.println(" ");
    }

    public static int verificarIgual (int[] a, int[] valoresIguais) {
        int x = 0;
        for (int i = 0; i < a.length; i += 1) {
            for (int j = 0; j < a.length; j += 1) {
                if (i != j && a[i] == a[j] && !jaTem(valoresIguais, x, a[i])) {
                    valoresIguais[x] = a[j];
                    x += 1;
                    break;

                }
            }
        }
        return x;

    }

    public static boolean jaTem (int[] v, int x, int n) {
        for (int i = 0; i < x; i += 1) {
            if (n == v[i]) {
                return true;
            }
        }
        return false;
    }

    public static void imprimir (int[] v, int tam) {
        for (int i = 0; i < tam; i += 1) {
            System.out.printf("%d ", v[i]);
        }
    }

    
}

