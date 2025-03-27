package ex13;

import java.util.Scanner;

public class ContaCaracter {
	
	public static int contaCaracter(String txt, char caractere) {
		
		if(txt.isEmpty()) {
			return 0;
		}
		int contagem = (txt.charAt(0) == caractere) ? 1 : 0;
		return contagem + contaCaracter(txt.substring(1), caractere);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		System.out.println("Digite o caractere a ser contado: ");
		char caractereBuscado = sc.next().charAt(0);
		
		int resultado = contaCaracter(palavra, caractereBuscado);
		
		System.out.println("O caractere " + caractereBuscado + " aparece " + resultado + " vezes");
		
		sc.close();
	}
	
}
