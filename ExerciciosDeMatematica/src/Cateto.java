import java.util.Scanner;

public class Cateto {

	public static void main(String[] args) {
		 System.out.println("ADICIONAR OS VALORES: ");
		
		Scanner sc = new Scanner(System.in); 
		 double a, b, x, y, r, SOMA, ceno;
		 
		 a = sc.nextDouble();
		 b = sc.nextDouble();

		 x = a * a;
		 y = b * b;
		 SOMA = x + y;
		 ceno = Math.sqrt (SOMA);
		 
		 System.out.println("O VALOR SERÁ: ");
		 System.out.print(ceno);
		 
		 sc.close();

	}

}
