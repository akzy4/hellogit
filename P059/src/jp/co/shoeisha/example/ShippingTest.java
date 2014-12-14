package jp.co.shoeisha.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShippingTest {

	@Test
	public void testCalculate() {
		assertEquals(600, Shipping.calculate(9, 20, 20, 19));
		assertEquals(1200, Shipping.calculate(10, 20, 20, 19));
		assertEquals(1200, Shipping.calculate(19, 40, 40, 39));
		assertEquals(1800, Shipping.calculate(20, 40, 40, 39));
	}
}
