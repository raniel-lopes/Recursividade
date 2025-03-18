package ex01;

public class MDC {
	
	public static int mdc(int m, int n) {
		if (n == 0) {
			return m;
		}
		return mdc(n, m % n);
	}
	
	public static void main(String[] args) {
        int resultado = mdc(48, 18); 
        System.out.println("MDC: " + resultado);
    }
}

