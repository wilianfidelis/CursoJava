package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Util;

public class Dollar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Util doll = new Util(); 
		
		
		System.out.print("Qual cotacão do dollar: ");
		doll.cotacao = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados: ");
		doll.dollar = sc.nextDouble();
		

		double iof;
		System.out.printf("Valor em reais: %.2f", doll.ValorTotal());
		
		
	}

}
