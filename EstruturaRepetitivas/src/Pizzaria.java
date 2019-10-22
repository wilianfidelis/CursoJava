import java.util.Scanner;

public class Pizzaria {

	public static void main(String[] args) {

		double hotdog = 0;
		double pizza = 0;
		double sanduiche = 0;
		double refri = 0;

		System.out.println("Digite o codigo dos produtos que deseja:");
		System.out.println("1-Hotdog 2-Pizza 3-Sanduiche 4-refrigerante 0-Finalizar");

		Scanner sc = new Scanner(System.in);

		int produto = sc.nextInt();
		double soma1 = 0;
		double soma2 = 0;
		double soma3 = 0;
		double soma4 = 0;
		double total;
		
		while (produto != 0) {

			if (produto == 1) {
				hotdog = hotdog + 1;
				
				soma1 = hotdog * 4;
				
			} else if (produto == 2) {
				pizza = pizza + 1;
				
				soma2 = pizza * 5;

			} else if (produto == 3) {
				sanduiche = sanduiche + 1;
				soma3 = sanduiche * 3;

			} else if (produto == 4) {
				refri = refri + 1;
				
				soma4 = refri * 3.50;
			}
			System.out.println("1-Hotdog 2-Pizza 3-Sanduiche 4-refrigerante 0-Finalizar");
			produto = sc.nextInt();
		}
		
		total = soma1+soma2+soma3+soma4;
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Hotdog: " + hotdog);
		System.out.println("Pizza: " + pizza);
		System.out.println("Sanduiche: " + sanduiche);
		System.out.println("Refrigerante: " + refri);
		System.out.printf("TOTAL A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}