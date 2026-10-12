import java.util.Random;

public class Atvd_v_10 {
    public static Random gerador = new Random(7);
    public static void main(String[] args) {
        int[] notas = new int[15];
        preencher(notas);
        mediaGeral(notas);
        
    }
        public static void preencher(int[] a) {
        for (int i = 0; i < a.length; i += 1) {
            a[i] = gerador.nextInt(10);
            System.out.printf("%d ", a[i]);
        }
        System.out.println(" ");
    }

    public static void mediaGeral(int[] notas) {
        double soma = 0;
        double media;
        for (int i = 0; i < notas.length; i += 1) {
            soma += notas[i];
            

        }
        media = soma / notas.length;
        System.out.printf("media das notas %.2f: ", media);
    }
    
}
