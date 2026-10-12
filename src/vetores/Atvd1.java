public class Atvd1 {
    public static void main (String[] args) {
        int[] a = new int[6];
        preencher(a);
        int somaEspecifica = somaV(a);
        System.out.println("\n========SOMA RESULTADO========");
        System.out.println(somaEspecifica);
        a[4] = 100;
        imprimir(a);

    }

    public static void preencher(int[] a) {
        a[0] = 1;
        a[1] = 0;
        a[2] = 5;
        a[3] = -2;
        a[4] = -5;
        a[5] = 7;
    }

    public static int somaV (int[] a) {
        int soma = a[0] + a[1] + a[5];
        return soma;
    }

    public static void imprimir (int[] a) {
        System.out.println("=========VETOR=========");
        for (int i = 0; i < a.length; i += 1) {
            System.out.printf("%d\n", a[i]);
        }
    }
}