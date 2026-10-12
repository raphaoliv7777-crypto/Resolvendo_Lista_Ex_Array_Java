import java.util.Scanner;
public class Atvd2 {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        int[] a = new int[6];
        preencher(a);
        imprimir(a);
    }

    public static void preencher(int[] a) {
        for(int i =0; i < a.length; i += 1) {
            System.out.printf("preencher: %d/%d\n", i + 1, a.length);
            a[i] = input.nextInt();
        }
    }

    public static void imprimir(int[] a) {
        System.out.println("=====VETOR=======");
        for (int i = 0; i < a.length; i += 1) {
            System.out.println(a[i]);
        }
    }

    
}
