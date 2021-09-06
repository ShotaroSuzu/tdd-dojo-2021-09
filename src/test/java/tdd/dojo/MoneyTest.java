package tdd.dojo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MoneyTest {
	@Test
	public void testMultiplication() {
		//$5 * 2 = $10というテスト書く
		Doller five = new Doller(5);
		Doller product = five.times(2);
		assertThat(product.amount, is(10));
		product = five.times(3);
		assertThat(product.amount, is(15));
	}

	@Test
	public void testEquals_sameAmount_true() {
		assertThat(new Doller(5).equals(new Doller(5)), is(true));
	}
	
	@Test
	public void testEquals_differentAmount_false() {
		assertThat(new Doller(5).equals(new Doller(4)), is(false));
	}
}
