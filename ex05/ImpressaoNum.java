package ex05;

import java.util.Scanner;

public class ImpressaoNum {
	
	public static void impressaoNum(int n) {
		if(n == 1) {
			System.out.println(n + " ");;
			return;
		}
		impressaoNum(n - 1);
		System.out.println(n + " ");;

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		sc.close();
		           
		impressaoNum(n);

	}
}
