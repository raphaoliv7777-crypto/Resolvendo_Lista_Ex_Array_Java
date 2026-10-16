import java.util.Random;

public class Atvd_v_30
{
    
    public static Random gerador = new Random(7);
    public static final int tam1 = 20;
    public static final int tam2 = 20;
	public static void main(String[] args) {
	    int a [] = new int[tam1];
	    int b [] = new int[tam2];
	    int menor;
	    if (tam1 < tam2) {
	        menor = tam1;
	    } else {
	        menor = tam2;
	    }
	    int c [] =  new int[menor];
		preencher(a);
		preencher(b);
		imprimir(a, a.length);
		imprimir(b, b.length);
		int posicaoC = interseccao(a, b, c);
		imprimir(c, posicaoC);
		

	}
	
	public static void preencher (int[] a) {

	    for (int i = 0; i < a.length; i += 1) { 
	       a[i] = gerador.nextInt(10);
	    }
	    
	}
	public static int interseccao(int[] a, int[] b, int[] c) {
	    int k = 0;
	    for (int i = 0; i < a.length; i += 1) {
	        for (int j = 0; j < b.length; j += 1) {
	            if (a[i] == b[j] && !jaTem(c, a[i], k)) {
	                c[k] = a[i];
	                k += 1;
	                break;
	            }
	        }
	    }
	    
	    return k;
	    
	}
	
	public static boolean jaTem (int[] a, int n, int x) {
	    for (int i = 0; i < x; i += 1) {
	        if (a[i] == n) {
	            return true;
	        }
	    }
	    
	    return false;
	}
	

	
	public static void imprimir (int[] a, int tam) {
	    System.out.println("\n=======VETOR======");
	    for (int i = 0; i < tam; i += 1) {
	        
            System.out.printf("%1d ", a[i]);
	   }
    }
	
}