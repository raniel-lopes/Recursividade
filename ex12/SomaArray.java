package ex12;

public class SomaArray {
	
	public static int somaArray(int[] array, int tamanho) {
		if (tamanho == 0) {
			return 0;
		}
		return array[tamanho - 1] + somaArray(array, tamanho - 1);
	}
	
	public static void main(String[] args) {
		int[] numeros = {5, 4, 8, 7, 5};
		int resultado = somaArray(numeros, numeros.length);
        System.out.println("A soma dos elementos do array é: " + resultado);

	}
	
}
