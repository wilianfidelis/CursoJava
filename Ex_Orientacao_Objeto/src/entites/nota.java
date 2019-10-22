package entites;

public class nota {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double resultado;
	
	public double Total () {
		return nota1 + nota2 + nota3;
	}
	
	public double FinalGrade() {
		if (Total() < 60.0) {
			return 60.0 - Total();	
		}else {
			return 0.0;
		}
	}
		
}
