package entites;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, double anuallcome, int numberOfEmployees) {
		super(name, anuallcome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	
	public Double tax(){
		if (getNumberOfEmployees() < 10) {
			return super.getAnuallcome() * 0.16;
			
		} else {
			return super.getAnuallcome() * 0.14;
			
		}
	}

}
