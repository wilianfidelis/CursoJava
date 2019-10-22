package aplication;

import java.util.Locale;
import java.util.Scanner;
import entites.employer;

public class ProgramEmployer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		employer salario = new employer();
		/*--------- informações do funcionario---------*/
		System.out.print("Digite o nome: ");
		salario.name = sc.nextLine();
		System.out.print("Digite o salario Bruto:");
		salario.salarioGrosso = sc.nextDouble();
		System.out.print("Digite a taxa do salario:");
		salario.taxa = sc.nextDouble();
		System.out.print("Empregador "+ salario);
		/*--------- informações do funcionario---------*/
		
		/*--------- Aumento do funcionario---------*/
		System.out.println();
		System.out.print("Digite uma porcentagem para incrementar o salario bruto: ");
		
		double porcentagem = sc.nextDouble();
		salario.tporcentagem(porcentagem);
		
		System.out.print("Valor atualizado: "+ salario );
		
		
	}

}
