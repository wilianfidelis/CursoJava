import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int N;
		double  H, S, SOMA;
		N = sc.nextInt();
		H = sc.nextDouble();
		S = sc.nextDouble();
		SOMA = H * S;
		

		System.out.println("NUMBER: "+ N);
		System.out.printf("SALARIO: U$ %.2f ", SOMA);
		
		
		sc.close();
	}

}
