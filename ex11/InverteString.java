package ex11;

import java.util.Scanner;

public class InverteString {

	public static String inverteString(String str) {
		
		//Caso base - se a string estiver vazia ou com 1 caractere
		if (str.isEmpty()) {
			return str;
		}
		
		// Recursividade - inverte a substring e adiciona o 1º carac. no final
		return inverteString(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o texto: ");
		String txt = sc.nextLine();
		
		sc.close();
		
		System.out.println("Texto invertido: " + inverteString(txt));
				
	}
}
