import java.util.Random;
public class Atvd5
{
    public static Random gerador = new Random(7);
	public static void main(String[] args) {
	    int [][] m = new int[5][5];
		preencher(m);
		imprimir(m);
		buscar(m, 18);
	}
	
	public static void preencher (int[][] m) {
	    for (int i = 0; i < m.length; i += 1) {
	        for (int j = 0; j < m[0].length; j += 1) {
	            m[i][j] = gerador.nextInt(100);
	        }
	    }
	}
	
	public static void buscar(int[][] m, int x) {
	    int linha = 0;
	    int coluna = 0;
	    for (int i = 0; i < m.length; i += 1) {
	        for (int j = 0; j < m[0].length; j += 1) {
	            if (m[i][j] == x) {
	                linha = i;
	                coluna = j;
	                System.out.printf("\nNumero %d Achado!", x);
	                System.out.printf("\nNa linha %d, e Coluna %d", linha, coluna);
	                return;
	            }
	        }
	    }
	    System.out.println("Numero não encontrado");
	}
	
	public static void imprimir (int[][] m) {
	    for (int i = 0; i < m.length; i += 1) {
	        for (int j = 0; j < m[0].length; j += 1) {
	            if (m[i][j] < 10) {
	                System.out.printf("0");
	            }
	            
	            System.out.printf("%d ", m[i][j]);
	        }
	        
	        System.out.println(" ");
	    }
	    

	}
}