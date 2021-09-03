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
}
