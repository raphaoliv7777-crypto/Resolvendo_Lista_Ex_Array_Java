import java.util.Scanner;

public class Atvd_v_6 {
    public static final int TAM = 10;
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        int[] v = new int[TAM];
        preencher(v);
        int menorValor = menorValorFuncao(v);
        int maiorValor = maiorValorFuncao(v);
        imprimirResultados(menorValor, maiorValor);

    }

    public static void preencher (int[] v) {
        for (int i = 0; i < v.length; i += 1) {
            System.out.printf("Digite o Valor %d/%d\n", i + 1, v.length);
            v[i] = input.nextInt();

        }
    }

    public static int menorValorFuncao (int[] v) {
        int menor = v[0];
        for (int i = 0; i < v.length; i += 1) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return menor;
    }

    public static int maiorValorFuncao(int[] v) {
        int maior = v[0];
        for (int i = 0; i < v.length; i += 1) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        return maior;
    }

    public static void imprimirResultados (int menor, int maior) {
        System.out.printf("Menor valor = %d\n", menor);
        System.out.printf("Maior Valor = %d", maior);


    }
    
}
