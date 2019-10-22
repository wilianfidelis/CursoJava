import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Exercicio 1 de soma */
		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();
		soma = A + B;

		System.out.println("A SOMA = " + soma);

		sc.close();

	}

}
