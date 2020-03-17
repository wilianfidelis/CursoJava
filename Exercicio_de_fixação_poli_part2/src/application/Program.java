package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Company;
import entites.Individual;
import entites.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income:");
			double anuallcome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("healthExpenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anuallcome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anuallcome, numberOfEmployees));
			}

		}

		double sum = 0.0;
		System.out.print("TAXES PAID ");
		for (TaxPayer taxPayer : list) {
			double tax = taxPayer.tax();
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $" + String.format("%.2f", sum));

		sc.close();

	}

}
