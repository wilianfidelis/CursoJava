package entities;

public class OutsourcedEmployee extends Employee {

	private double addtionalCharg;

	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double addtionalCharg) {
		super(name, hours, valuePerHour);
		this.addtionalCharg = addtionalCharg;
	}

	public double getAddtionalCharg() {
		return addtionalCharg;
	}

	public void setAddtionalCharg(double addtionalCharg) {
		this.addtionalCharg = addtionalCharg;
	}
	
	
	@Override
	public double payment() {
		return super.payment() + addtionalCharg * 1.1;
	}
}
