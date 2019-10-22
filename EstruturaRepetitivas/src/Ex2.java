import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;

		System.out.println("Qual sua preferência, digite o codigo do produto");
		System.out.println("1-Alcool, 2-Gasolina, 3-Diesel e 4 SAIR");
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int produto = sc.nextInt();
		
		while (produto != 4) {
			System.out.println("Qual sua preferência, digite o codigo do produto");
			if (produto == 1) {
				Alcool = Alcool + 1;
			} else if (produto == 2) {
				Gasolina = Gasolina + 1;
			} else if (produto == 3) {
				Diesel += 1;
			}
			produto = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		

		sc.close();
	}

}
