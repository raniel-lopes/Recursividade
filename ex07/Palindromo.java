package ex07;

import java.util.Scanner;

public class Palindromo {
	
	public static boolean isPalindromo(String txt) {
		//Remove os espaços em branco e transforma em letras minúsculas
		txt = txt.replaceAll("\\s+", "").toLowerCase();
				
		//Chama a função para verificar se é um palindromo
		return verificarPalindromo(txt, 0, txt.length() - 1);
	}
	
	private static boolean verificarPalindromo(String txt, int inicio, int fim) {
		
		// Se os índices que se cruzam quando comparados lado a lado, são iguais , 
		// significa que a string é um palindromo
		if (inicio >= fim) {
			return true;
		}
		
		// Se os caracteres do inicio e fim forem diferentes, não é um palindromo
		if (txt.charAt(inicio) != txt.charAt(fim)) {
			return false;
		}
		
		// Função Recursiva que reduz a string para os caracteres internos
		return verificarPalindromo(txt, inicio + 1, fim - 1);
				
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = sc.nextLine();
        sc.close(); 

        // Chama a função principal e exibe o resultado
        if (isPalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}
