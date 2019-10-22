package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Product acount; /* ---- Cria��o da variavel para n�o ficar no if ---*/

		System.out.print(" Digite o n�mero da conta: ");
		int number = sc.nextInt();
		System.out.print(" Digite o nome do titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Ira com um deposito inicial (y/n):");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print(" Entre com deposito inicial: ");
			
			double initialDeposit = sc.nextDouble();
			acount = new Product(number, holder, initialDeposit);
		} 
		else {
			acount = new Product(number, holder);
		}
		
		System.out.println();
		System.out.println("Valor da conta atualizado: ");
		System.out.println(acount);
		
		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		double depositValue = sc.nextDouble();
		acount.deposit(depositValue);
		System.out.println("Valor da conta atualizado: ");
		System.out.println(acount);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		acount.withdraw(saque);
		System.out.println("Valor da conta atualizado: ");
		System.out.println(acount);
		
		
		
		
		sc.close();
	}

}
