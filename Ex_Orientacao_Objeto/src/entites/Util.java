package entites;

public class Util {
	
	public double dollar;
	public double reais;
	public static double cotacao;
	public double resultado;
	public double valor;
	
	
	public  double CurrentConverter() {
		return cotacao * dollar;
	}
	
	public double iof() {
		return 0.06 * CurrentConverter();
	}
	
	public double ValorTotal() {
		return CurrentConverter() + iof();
	}
}
