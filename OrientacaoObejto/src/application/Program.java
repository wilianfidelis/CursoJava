package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		
		/* ---------------------------- Variaveis ---------------------------------------*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; /* ctrl + shift + O para importar a clase*/
		x = new Triangle(); /* - chamar a classe para o x */
		y = new Triangle(); /* - chamar a classe para o y */
		
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		/* ----------------------------Variaveis ---------------------------------------*/
		
		/* --------------- Formula da conta --------------------------- */
		double areaX = x.area();
		double areaY = y.area();
		/*--------------------------------------------------------------*/
		
		/*------------------------Print --------------------------------*/
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		/*------------------------Print --------------------------------*/
		sc.close();
	}
}