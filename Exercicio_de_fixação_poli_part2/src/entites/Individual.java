package entites;

public class Individual extends TaxPayer {

	private double healthExpenditures;
	

	public Individual() {

	}
	public Individual(String name, double anuallcome, double healthExpenditures) {
		super(name, anuallcome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	public Double tax() {
		if (getAnuallcome() < 2000) {
			return
					super.getAnuallcome() * 0.15 - healthExpenditures * 0.5;
			
		} else {
			return 
					super.getAnuallcome() * 0.25 - healthExpenditures * 0.5;
		}
	}

}
