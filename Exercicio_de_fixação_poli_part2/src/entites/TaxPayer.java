package entites;

public  abstract class TaxPayer {
	
	private String name;
	protected double anuallcome;
	
	public TaxPayer() {
		super();
	}

	public TaxPayer(String name, double anuallcome) {
		super();
		this.name = name;
		this.anuallcome = anuallcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnuallcome() {
		return anuallcome;
	}

	public void setAnuallcome(double anuallcome) {
		this.anuallcome = anuallcome;
	}

	public abstract Double tax();
	
}
