import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println("Adicionar");
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
			
		}
		System.out.printf("VALOR A PAGA: R$ %.2f%n", conta);

		
		sc.close();
	}

}
