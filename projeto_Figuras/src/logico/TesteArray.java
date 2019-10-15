package logico;

public class TesteArray {
	public static void main(String[] args) {
		String[][] retangulo = new String[5][9];
		for (int linha = 0; linha < retangulo.length; linha++) {
			for (int coluna = 0; coluna < retangulo[linha].length; coluna++) {
				retangulo[linha][coluna] = "-";
			}
		}
		
		int L = retangulo.length-1;
		int C = retangulo[0].length-1;
		retangulo[L][C] = "*";
		
		for (int linha = 0; linha < retangulo.length; linha++) {
			for (int coluna = 0; coluna < retangulo[linha].length; coluna++) {
				System.out.printf("%s ", retangulo[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println(retangulo.length);
		System.out.println(retangulo[0].length);
	}
}
