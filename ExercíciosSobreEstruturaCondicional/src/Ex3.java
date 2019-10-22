import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("DIGITE O CODIGO");
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double total;
		
		System.out.println("DIGITE A QUANTIDADE:");
		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("TOTAL: R$ %.2f%n", total);
	}

}
