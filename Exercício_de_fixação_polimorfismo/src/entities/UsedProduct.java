package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	static SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, double price, SimpleDateFormat date1, Date manufactureDate) {
		super(name, price);
		this.date1 = date1;
		this.manufactureDate = manufactureDate;
	}

	public SimpleDateFormat getDate1() {
		return date1;
	}

	public void setDate1(SimpleDateFormat date1) {
		this.date1 = date1;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ date1.format(manufactureDate)
				+ ")";
	}

}
