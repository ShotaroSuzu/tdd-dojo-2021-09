package tdd.dojo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MoneyTest {
	@Test
	public void testMultiplication() {
		Money product = Money.dollar(5);
		assertThat(product.times(2), is(Money.dollar(10)));
		assertThat(product.times(3), is(Money.dollar(15)));
	}

	@Test
	public void testDollerEquals_sameAmount_true() {
		assertThat(Money.dollar(5).equals(Money.dollar(5)), is(true));
	}
	
	@Test
	public void testDollerEquals_differentAmount_false() {
		assertThat(Money.dollar(5).equals(Money.dollar(4)), is(false));
	}
	
	@Test
	public void testEquals_differentCurrency() {
		assertThat(Money.dollar(5).equals(Money.franc(5)), is(false));
	}
	
	@Test
	public void testFrancMultiplication() {
		Money product = Money.franc(5);
		assertThat(product.times(2), is(Money.franc(10)));
		assertThat(product.times(3), is(Money.franc(15)));
	}
	
	@Test
	public void testCurrency() {
		assertThat(Money.dollar(1).currency(), is("USD"));
		assertThat(Money.franc(1).currency(), is("CHF"));
	}
	
	
	@Test
	public void testSimpleAddition() {
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertThat(reduced, is(Money.dollar(10)));
	}
	
	@Test
	public void testPlusReturnsSum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertThat(sum.augend, is(five));
		assertThat(sum.addend, is(five));
	}
	
	@Test
	public void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertThat(result, is(Money.dollar(7)));
	}
	
	@Test
	public void testReduceMoney() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), "USD");
		assertThat(result, is(Money.dollar(1)));
	}
}
