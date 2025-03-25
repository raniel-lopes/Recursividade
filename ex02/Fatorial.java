package ex02;

public class Fatorial {

	public static int fatorial(int n) {
		if (n == 0 || n == 1) { // Caso Base
			return 1;
		}

		return n * fatorial(n - 1); // Chamada Recursiva
	}
	
	 public static void main(String[] args) {
	        System.out.println(fatorial(8)); // Teste 
	    }
}
