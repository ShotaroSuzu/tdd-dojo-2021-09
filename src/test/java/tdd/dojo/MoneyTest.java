package tdd.dojo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MoneyTest {
	@Test
	public void testMultiplication() {
		Doller product = new Doller(5);
		assertThat(product.times(2), is(new Doller(10)));
		assertThat(product.times(3), is(new Doller(15)));
	}

	@Test
	public void testEquals_sameAmount_true() {
		assertThat(new Doller(5).equals(new Doller(5)), is(true));
	}
	
	@Test
	public void testEquals_differentAmount_false() {
		assertThat(new Doller(5).equals(new Doller(4)), is(false));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc product = new Franc(5);
		assertThat(product.times(2), is(new Franc(10)));
		assertThat(product.times(3), is(new Franc(15)));
	}
}
