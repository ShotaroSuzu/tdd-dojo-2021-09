package tdd.dojo;

public class Doller {

	public int amount;

	public Doller(int amount) {
		this.amount = amount;
	}

	public Doller times(int multiplier) {
		return new Doller(amount * multiplier);
	}

	public boolean equals(Doller object) {
		Doller doller = (Doller) object;
		return this.amount == doller.amount;
	}
}
