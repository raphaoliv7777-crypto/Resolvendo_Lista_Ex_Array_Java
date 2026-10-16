import java.util.Random;
public class Atvd_v_37 {
    public static Random gerador = new Random(7);
    public static final int TAM = 11; 
    public static void main(String[] args) {
        int[] v = new int[TAM];
        preencher(v); 
        imprimir(v, v.length);
        ordenar(v);
        imprimir(v, v.length);

    }

	public static void preencher (int[] a) {

	    for (int i = 0; i < a.length; i += 1) { 
	       a[i] = gerador.nextInt(10);
	    }
	    
	}

    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i += 1) {
            if (i < 6) {
                ordenarCrescent(v, i);

            } else {
                ordenarDecrescent(v, i);
            }
        }
    }

        public static void ordenarCrescent (int[] v, int i) {
                int menor = v[i];
                int indice = i;
                for (int j = i + 1; j < v.length; j += 1) {
                    if (v[j] < menor) {
                        menor = v[j];
                        indice = j;
                        
                        
                    }
                    
                }
                if (i != indice) {
                    int aux = v[i];
                    v[i] = menor;
                    v[indice] = aux;
                }
        }

        public static void ordenarDecrescent (int[] v, int i) {
            int maior = v[i];
            int indice = i;
            for (int j = i + 1; j < v.length; j += 1) {
                if (v[j] > maior) {
                    maior = v[j];
                    indice = j;
                }

            }
            if (i != indice) {
                int aux = v[i];
                v[i] = maior;
                v[indice] = aux;
            }

        }




        public static void imprimir (int[] v, int tam) {
        System.out.println();
        for (int i = 0; i < tam; i += 1) {
            System.out.printf("%4d ", v[i]);
        }
    }

    
}
