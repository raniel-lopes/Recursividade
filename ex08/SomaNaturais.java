package ex08;

import java.util.Scanner;

public class SomaNaturais {
	 
		public static int somaNaturais(int n) {
			//  Caso Base
			if(n == 0) {
				return 0;
			}
			// Faz a soma de N com o resultado da função chamada com (N - 1)
			return n + somaNaturais(n - 1);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um número: ");
			int n = sc.nextInt();
			sc.close();
			
			 int resultado = somaNaturais(n);
		        System.out.println("A soma dos primeiros " + n + " números naturais é: " + resultado);
		}
	}


