import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qt1, qt2;
		double valor1, valor2, soma1, soma2, total;
		
		
		System.out.println("FAVOR ADICIONAR OS PRODUTOS");
		
		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		valor1 = sc.nextDouble();
		soma1 = valor1 * qt1; 
		
		
		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		valor2 = sc.nextDouble();
		soma2 = valor2 * qt2;
		total = soma1 + soma2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		
		
		sc.close();

	}

}
