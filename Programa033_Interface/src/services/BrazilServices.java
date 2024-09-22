package services;

public class BrazilServices implements TaxArea{
	public double interestRate;
	public BrazilServices (double interestRate) {
		this.interestRate=interestRate;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
