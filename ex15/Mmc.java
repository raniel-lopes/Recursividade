package ex15;

public class Mmc {
	 public static int mdc(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return mdc(b, a % b);
	    }

	    // Método recursivo para calcular o MMC usando a fórmula MMC(a, b) = (a * b) / MDC(a, b)
	    public static int mmc(int a, int b) {
	        return (a * b) / mdc(a, b);
	    }

	    public static void main(String[] args) {
	        int num1 = 12, num2 = 18;
	        System.out.println("O MMC de " + num1 + " e " + num2 + " é: " + mmc(num1, num2));
	    }
	}