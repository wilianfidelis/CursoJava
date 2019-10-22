import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int NUMERO, SOMA;
		
		
		System.out.println("Digitar o Numero:");
		NUMERO = sc.nextInt();
		
 		if (NUMERO %2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
