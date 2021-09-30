package entities;

public class Holder {

	private int accNumber;
	public String accName;
	double value;
	
	public Holder(int accNumber, String accName, double value) {
		this.accNumber = accNumber;
		this.accName = accName;
		this.value = value;
	}

	public void deposit(double value) {
		this.value += value;
	}

	public void withdraw(double value) {
		this.value -= value;
		this.value = this.value - 5;
	}
	
	public String toString() {
		return accNumber 
				+ ", Holder: " 
				+ accName 
				+ ", Balance: $" 
				+ String.format("%.2f", value);
	}
}
