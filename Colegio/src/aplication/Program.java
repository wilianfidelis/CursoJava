package aplication;

import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Product acount = new Product();
		
		System.out.println("Adicionar Produtos");
		System.out.print("Adicionar nome: ");
		String name = sc.nextLine();
		System.out.println("Adicionar valor do produto: ");
		double preco = sc.nextDouble();
		System.out.println("Adicionar quantidade: ");
		int quantidade = sc.nextInt();
		System.out.println();
		System.out.println("Total " + acount.totalT());

	}

}
