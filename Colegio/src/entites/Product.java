package entites;

public class Product {

	private String name;
	private double preco;
	private int quantidade;
	
	
	public Product() {
		
	}

	public Product(String name, double preco) {
		this.name = name;
		this.preco = preco;
	}

	/*------- Get e Set ------ */
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double setTotal() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	/*------------------------ */
	public double totalT() {
		return preco * quantidade;
	}
	
	
	
}
