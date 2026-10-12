import java.util.Random;
import java.util.Scanner;
public class Atvd4 {
    public static Random gerador = new Random(7);
    public static Scanner input = new Scanner(System.in);
    public static final int TAM = 8;
    public static void main(String[] args) {
        int[] a = new int[TAM];
        int x = 0; 
        int y = 0;

        preencher(a);
        imprimir(a, "A");
        somarDoisValores(a, x, y);
        
    }

    public static void preencher(int[] a) {
        for (int i = 0; i < a.length; i += 1) {
            a[i] = gerador.nextInt(10);
        }
    }

    public static void somarDoisValores(int[] v, int x, int y) {
        System.out.println("DIGITE POSICAO 1");
        x = input.nextInt();
        System.out.println("DIGITE POSICAO 2");
        y = input.nextInt();

        int soma = v[x] + v[y];
        System.out.println("RESULTADO SOMA: " + soma);


    }

    public static void imprimir (int[] v, String l) {
        System.out.printf("\n==========VETOR %s========\n", l);
        for (int i = 0; i < v.length; i += 1) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println(" ");
    }
    
}
