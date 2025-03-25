package ex06;

import java.util.Scanner;

public class ContagemRegressiva {
	
	public static void contagem(int n) {
		if (n == 0) {
			System.out.println(n);
			return;
		}
		System.out.println(n); //Imprime o número
		contagem(n - 1);	   // Chama a recursividade para o número menor
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número para a contagem regressiva: ");
		int n = sc.nextInt();
		sc.close();
		
		contagem(n);
	}
}
