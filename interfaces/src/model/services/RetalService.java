package model.services;

import model.entities.Carental;
import model.entities.Invoice;

public class RetalService {

	private Double pricePerday;
	private Double pricePerhour;

	private TaxService taxService;

	public RetalService(Double pricePerday, Double pricePerhour, TaxService taxService) {
		this.pricePerday = pricePerday;
		this.pricePerhour = pricePerhour;
		this.taxService = taxService;
	}

	public void processInvoice(Carental carental) {
		long t1 = carental.getStart().getTime();
		long t2 = carental.getFinish().getTime();
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;

		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerhour *  Math.ceil(hours);
		} else {
			basicPayment = pricePerday * Math.ceil(hours / 24);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
