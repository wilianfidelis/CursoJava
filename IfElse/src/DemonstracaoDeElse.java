import java.util.Scanner;

public class DemonstracaoDeElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h;

		System.out.println("Adicionar Hora: ");
		h = sc.nextInt();

		if (h <= 12) {

			System.out.println("Bom Dia senhor");
		} else if (h < 18) {
			System.out.println("Bom Tarde senhor");
		} else {
			System.out.println("Boa noite senhora");
		}

		sc.close();
	}

}
