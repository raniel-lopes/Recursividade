package ex10;

import java.util.Scanner;

public class Fibonacci {

	public static int fibonacci(int n) {

		// Casos bases
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		// Chamada recursiva
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		sc.close();

		System.out.println("Fibonacci de " + n + " é: " + fibonacci(n));
	}
}