package tdd.dojo;

public abstract class Money {

	protected int amount;

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount
				&& getClass().equals(money.getClass());
	}
	abstract Money times(int i);

	public static Money dollar(int amount) {
		return new Doller(amount);
	}

	public static Money franc(int amount) {
		return new Franc(amount);
	}

}
