import java.util.Scanner;
public class Atvd_v_9 {
    public static final int TAM = 6;
    public static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        int[] a = new int[TAM];
        preencher(a);
        imprimirOrdemInversa(a);

    }

    public static void preencher(int[] a) {
        int i = 0;
        while (i < TAM) {
            System.out.printf("\nDIGITE UM NÚMERO PAR %d/%d: ", i, a.length);
            int n = input.nextInt();
            if (n % 2 == 0) {
                a[i] = n;
                i += 1;
            } else {
                System.out.println("o número digitado não é par, tente novamente");
            }
            
        }
        
    }

    public static void imprimirOrdemInversa(int[] a) {
        for (int i = a.length - 1; i >= 0; i  -= 1) {
            System.out.printf("%d ", a[i]);
        }
    }
    
}
