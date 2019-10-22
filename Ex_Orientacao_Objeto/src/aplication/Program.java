package aplication;

import java.util.Locale;
import java.util.Scanner;
import entites.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Entre com o produto: ");
		System.out.print("Name: ");
		String name2 = sc.nextLine();
		System.out.print("Preço: ");
		double valor2 = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		int quantidade2 = sc.nextInt();
		
		Product produto = new Product(name2, valor2, quantidade2);
		/*-------- METODOS-------*/
		double total = produto.total();
		
		/*-------- total-------*/
		System.out.println();
		System.out.print("Produtos: "+ produto);
		System.out.println();
		/*---- adiciona produtos----*/
		System.out.print("Digite o número de produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade); 
		System.out.println("Atualizar dados: "+ produto);
		
		/*-- remove Produtos--------*/
		System.out.print("Digite o número de produtos a serem removidos ao estoque: ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		System.out.print("Atualizar dados: "+ produto);
		
		
		sc.close();
	}

}
