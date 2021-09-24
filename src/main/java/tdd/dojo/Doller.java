package tdd.dojo;

public class Doller extends Money{

	public Doller(int amount) {
		this.amount = amount;
	}

	public Doller times(int multiplier) {
		return new Doller(amount * multiplier);
	}
}
