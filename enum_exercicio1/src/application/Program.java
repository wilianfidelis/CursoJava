package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Formatos de datas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/yyyy");
		//Modelo de data
		
		System.out.print("Entre com nome do departamento: ");
		String departamentName = sc.nextLine();
		System.out.println("insira dados do trabalhador: ");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salario base: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Departament(departamentName));
		
		System.out.print("quantos contratos para esse trabalhador");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Entre com contrato: "+ i + "data: ");
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duraçao do contrato: ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		} 
		
		System.out.println();
		System.out.print("Digite o mês e o ano para calcular a renda (MM/AAAA)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Renda para: "+ monthAndYear +": "+String.format("%2.f",+ worker.income(year, month)));
		

		sc.close();

	}

}
