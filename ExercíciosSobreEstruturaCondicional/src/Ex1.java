import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int NUMERO;
		
		System.out.println("Digitar o numero:");
		NUMERO = sc.nextInt();
		
		if (NUMERO > 0) {
			
			System.out.printf("Positivo", NUMERO);
			
		}else {
			System.out.printf("NEGATIVO", NUMERO);
		}
		
		sc.close();
	}

}
