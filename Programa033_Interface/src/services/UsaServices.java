package services;

public class UsaServices implements TaxArea{
	public double interestRate;
	public UsaServices (double interestRate) {
		this.interestRate=interestRate;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
