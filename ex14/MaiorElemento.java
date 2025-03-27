package ex14;

public class MaiorElemento {
	    
	public static int encontrarMaior(int[] array, int tamanho) {

			if (tamanho == 1) {
	            return array[0];
	        }
	        
	        // Chamada recursiva para encontrar o maior elemento no restante do array
	        int maiorRestante = encontrarMaior(array, tamanho - 1);
	        
	        // Retorna o maior entre o último elemento e o maior do restante
	        return Math.max(maiorRestante, array[tamanho - 1]);
	    }
	    
	    public static void main(String[] args) {
	        int[] numeros = {3, 1, 9, 7, 2, 8};
	        int maior = encontrarMaior(numeros, numeros.length);
	        System.out.println("O maior elemento é: " + maior);
	    }
	}


