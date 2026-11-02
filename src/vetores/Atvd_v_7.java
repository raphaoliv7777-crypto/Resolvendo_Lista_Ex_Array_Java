import java.util.Random;
public class Atvd_v_7 {
    public static Random gerador = new Random(7);
    public static final int TAM = 10;
    public static void main (String[] args) {
        int[] v = new int[TAM];
        preencher(v);
        int posicaoMaiorNumero = acharMaior(v);
        imprimirVetor(v);
        System.out.printf("\nMaior elemento: %d\nPosição do maior elemento: %d", v[posicaoMaiorNumero], posicaoMaiorNumero);

    }

    public static void preencher (int[] v) {
        for (int i = 0; i < v.length; i += 1) {
            v[i] = gerador.nextInt(100);
        }
    }

    public static int acharMaior (int[] v) {
        int maior = v[0];
        int posicao = 0;
        for (int i = 0; i < v.length; i += 1) {
            if (v[i] > maior) {
                maior = v[i];
                posicao = i;

            }
        }

        return posicao;
    }

    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i += 1) {
            System.out.printf("%d ", v[i]);
        }
    }
    
}
