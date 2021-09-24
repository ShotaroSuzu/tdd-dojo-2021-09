package tdd.dojo;

public abstract class Money {

	protected int amount;
	protected String currency;
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount
				&& getClass().equals(money.getClass());
	}
	abstract Money times(int i);

	public String currency() {
		return currency;
	}
	public static Money dollar(int amount) {
		return new Doller(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

}
