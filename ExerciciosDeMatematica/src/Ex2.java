import java.util.Scanner;
/* Exercicio para calular um raio de um circulo */

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double r = sc.nextDouble();
		double soma;

		r = Math.pow(r, 2.0);
		soma = pi * r;

		System.out.printf("Raio será: %.4f%n ", soma);

	}

}
