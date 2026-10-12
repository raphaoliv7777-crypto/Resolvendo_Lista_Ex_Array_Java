import java.util.Random;
public class Atvd6
{
	public static final int TAM = 4;
    public static Random gerador = new Random(7);
	public static void main(String[] args) {
	    int[][] m1 = new int[TAM][TAM];
		int[][] m2 = new int [TAM][TAM];
		int[][] mNova = new int[TAM][TAM];
		preencher(m1);
		preencher(m2);
		imprimir(m1, 1);
		imprimir(m2, 2);
		preencherMatrizMaioresValores(m1, m2, mNova);
		imprimir(mNova, 3);
		

		
	}
	
	public static void preencher (int[][] m) {
	    for (int i = 0; i < m.length; i += 1) {
	        for (int j = 0; j < m[0].length; j += 1) {
	            m[i][j] = gerador.nextInt(100);
	        }
	    }
	}

	public static void preencherMatrizMaioresValores(int[][] m1, int[][] m2, int[][] mNova) {
		int maior;
		for (int i = 0; i < m1.length; i += 1) {
			for (int j = 0; j < m1[0].length; j += 1) {
				if (m1[i][j] > m2[i][j]) {
					maior = m1[i][j];
				} else {
					maior = m2[i][j];
				}

				mNova[i][j] = maior;
			}
		}
	}
	
	
	public static void imprimir (int[][] m, int n) {
		System.out.printf("\n======MATRIZ %d=========\n", n);
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