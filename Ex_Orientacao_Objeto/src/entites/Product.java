package entites;

public class Product {
	public String name;
	public double valor;
	public int quantidade;

	
	/*---- construtor ----------------*/
	public Product(String name2, double valor2, int quantidade2) {
		this.name = name2;
		this.valor = valor2;
		this.quantidade = quantidade2;
	}
	/*---- construtor ----------------*/
	public double total() {
		return valor * quantidade;
	}

	public void addProdutos(int  quantidade) {
		this.quantidade += quantidade;
	}
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", valor)
		+ ", "
		+ quantidade
		+ " Unidades, Total: $ "
		+ String.format("%.2f", total());
	}
}
