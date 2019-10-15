package logico;

public class Figura {
	/*
	 * 	QUADRADO (5X5)
	 * 	
	 * 	* * * * * 
	 *  * * * * * 
	 *  * * * * * 
	 *  * * * * * 
	 *  * * * * * 
	 *  
	 *  RETANGULO COMPLETO (5 X 9)
	 *  
	 *  * * * * * * * * *
	 *  * * * * * * * * *
	 *  * * * * * * * * *
	 *  * * * * * * * * *
	 *  * * * * * * * * *
	 *  
	 *  RETANGULO VAZADO (5 X 9)
	 *  
	 *  * * * * * * * * *
	 *  *               *
	 *  *               *
	 *  *               *
	 *  * * * * * * * * *
	 *  
	 *  
	 *  TRIANGULO(5 X 9)
	 *  
	 *          *
	 *        * * *
	 *      * * * * *
	 *    * * * * * * *
	 *  * * * * * * * * *
	 *  
	 *  
	 */
	
	public static void main(String[] args) {
		String[][] quadrado = new String[5][5];
		
		System.out.println("QUADRADO(5 X 5)");
		for (int linha = 0; linha < quadrado.length; linha++) {
			for (int coluna = 0; coluna < quadrado[linha].length; coluna++) {
				quadrado[linha][coluna] = "*";
				System.out.print(quadrado[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		//---------------------------------------------------------------------//
		
		String[][] retanguloCompleto = new String[5][9];
		
		System.out.println("\nRETANGULO(5 X 9)");
		for (int linha = 0; linha < retanguloCompleto.length; linha++) {
			for (int coluna = 0; coluna < retanguloCompleto[linha].length; coluna++) {
				retanguloCompleto[linha][coluna] = "*";
				System.out.printf("%s ", retanguloCompleto[linha][coluna]);
			}
			System.out.println();
		}
		
		//---------------------------------------------------------------------//
		
		String[][] retanguloVazado = new String[5][9];
		
		System.out.println("\nRETANGULO VAZADO (5 X 9)");
		for (int linha = 0; linha < retanguloVazado.length; linha++) {
			for (int coluna = 0; coluna < retanguloVazado[linha].length; coluna++) {
				if(linha == 0 || linha == retanguloVazado.length-1 || 
				   coluna == 0 || coluna == retanguloVazado[linha].length-1) {
					retanguloVazado[linha][coluna] = "*";
				} else {
					retanguloVazado[linha][coluna] = " ";
				}
				System.out.printf("%s ", retanguloVazado[linha][coluna]);
			}
			System.out.println();
		}
		
		//---------------------------------------------------------------------//
		
		String[][] triangulo = new String[5][9];
		
		System.out.println("\nTriângulo (5 x 9)");
		int meio = triangulo[0].length / 2;
		meio += triangulo[0].length % 2 == 0 ? 1 : 0;
		
		for (int linha = 0; linha < triangulo.length; linha++) {
			for (int coluna = 0; coluna < triangulo[linha].length; coluna++) {
				if(coluna >= (meio - linha) && coluna <= (meio + linha)) {
					triangulo[linha][coluna] = "*";
				} else {
					triangulo[linha][coluna] = " ";
				}
				System.out.printf("%s ", triangulo[linha][coluna]);
			}
			System.out.println();
		}
		
		
		
	}
}




















