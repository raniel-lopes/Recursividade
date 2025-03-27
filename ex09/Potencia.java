package ex09;

import java.util.Scanner;

public class Potencia {
	
	public static int potencia(int base, int expoente) {
		
		// Caso base: qualquer número elevado a 0 é 1
		if (expoente == 0) {
			return 1;
		}
		// Recursividade: base * base^(expoente-1)
		return base * potencia(base, expoente - 1);
	}
		
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Digite a base: ");
	        int base = sc.nextInt();
	        
	        System.out.print("Digite o expoente: ");
	        int expoente = sc.nextInt();
	        
	        sc.close();
	        
	        System.out.println(potencia(base, expoente));
	    }	
}