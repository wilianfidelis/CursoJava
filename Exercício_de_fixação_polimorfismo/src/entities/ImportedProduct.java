package entities;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {

	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	public double totalPrice() {
		return super.price + customsFee;

	}
	public double customsFee() {
		return super.price + customsFee;
		
	}

	public String priceTag() {
		return getName() + " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}

}
