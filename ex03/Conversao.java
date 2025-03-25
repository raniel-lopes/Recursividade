package ex03;

public class Conversao {

	public static void conversaoBinario(int n) {
		if (n > 0) { // Caso Base
			conversaoBinario(n / 2);
			System.out.print(n % 2);
		}
	}

	public static void main(String[] args) {
		conversaoBinario(15);
	}
}
