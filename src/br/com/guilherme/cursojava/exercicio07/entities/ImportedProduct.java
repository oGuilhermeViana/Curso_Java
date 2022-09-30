package br.com.guilherme.cursojava.exercicio07.entities;

public class ImportedProduct extends Product {
	
	private Double customFee;

	public ImportedProduct(String name, double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public String priceTag() {
		// TODO Auto-generated method stub
		return getName() + " $" + String.format("%.2f", getPrice() + customFee) +
				"( Customs fee: $" + String.format("%.2f", customFee) + ")";
	}
	
}
