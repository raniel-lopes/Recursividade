package ex04;

import java.util.Scanner;

public class SomaAlgarismos {
	
	public static int somaAlgarismos(int n) {
		//se n for = 0, significa que já somamos todos os algarismos
		if(n < 1) {
			return n;
		}
		return somaAlgarismos(n / 10) + n % 10;
	}
	
	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		int n = new Scanner(System.in) .nextInt();
		int soma = somaAlgarismos(n);
		
		System.out.println("Soma dos algarismos: " + soma);
	}
}
