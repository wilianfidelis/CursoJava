package entites;

public class employer {
	public String name;
	public double salarioGrosso;
	public double taxa;
	
	
	public double liquido() {
		return salarioGrosso - taxa;
		
	}
	public double tporcentagem(double porcentagem) {
		return salarioGrosso += salarioGrosso * porcentagem /100;
		
	}

	public String toString() {
		return name
		+", $"
		+String.format("%.2f", liquido()); /* String format para formatar a string e adicionar uma variavel*/
	}
}