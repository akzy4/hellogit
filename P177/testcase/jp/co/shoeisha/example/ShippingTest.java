package jp.co.shoeisha.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShippingTest{

	@Test public void testCalculate() {
		Shipping ship = new Shipping();
			assertEquals(600, ship.calculate(5, 10, 10, 10));
	}
	@Test public void testCalculate2() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(15, 30, 30, 30));
	}
	@Test public void testCalculate3() {
		Shipping ship = new Shipping();
		assertEquals(1800, ship.calculate(25, 50, 50, 50));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate4() {
		Shipping ship = new Shipping();
		ship.calculate(-100, 30, 30, 30);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate5() {
		Shipping ship = new Shipping();
		ship.calculate(100, 30, 30, 30);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate6() {
		Shipping ship = new Shipping();
		ship.calculate(15, -10, -10, -10);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate7() {
		Shipping ship = new Shipping();
		ship.calculate(15, 100, 100, 100);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate8() {
		Shipping ship = new Shipping();
		ship.calculate(15, -10, 10, 10);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate9() {
		Shipping ship = new Shipping();
		ship.calculate(15, 10, -10, 10);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate10() {
		Shipping ship = new Shipping();
		ship.calculate(15, 10, 10, -10);
	}
	@Test public void testCalculate11() {
		Shipping ship = new Shipping();
		assertEquals(600, ship.calculate(1, 1, 1, 1));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate12() {
		Shipping ship = new Shipping();
		ship.calculate(0, 1, 1, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculate13() {
		Shipping ship = new Shipping();
		ship.calculate(1, 0, 1, 1);
	}
	@Test public void testCalculate14() {
		Shipping ship = new Shipping();
		assertEquals(600, ship.calculate(10, 1, 1, 1));
	}
	@Test public void testCalculate15() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(11, 1, 1, 1));
	}
	@Test public void testCalculate16() {
		Shipping ship = new Shipping();
		assertEquals(600, ship.calculate(10, 20, 20, 20));
		}
	@Test public void testCalculate17() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(11, 20, 20, 20));
	}
	@Test public void testCalculate18() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(10, 20, 20, 21));
	}
	@Test public void testCalculate19() {
		Shipping ship = new Shipping();
		assertEquals(600, ship.calculate(1, 20, 20, 20));
	}
	@Test public void testCalculate20() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(1, 20, 20, 21));
	}
	@Test public void testCalculate21() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(20, 1, 1, 1));
	}
	@Test public void testCalculate22() {
		Shipping ship = new Shipping();
		assertEquals(1800, ship.calculate(21, 1, 1, 1));
	}
	@Test public void testCalculate23() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(20, 40, 40, 40));
	}
	@Test public void testCalculate24() {
		Shipping ship = new Shipping();
		assertEquals(1800, ship.calculate(21, 40, 40, 40));
	}
	@Test public void testCalculate25() {
		Shipping ship = new Shipping();
		assertEquals(1800, ship.calculate(20, 40, 40, 41));
	}
	@Test public void testCalculate26() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(1, 40, 40, 40));
	}
	@Test public void testCalculate27() {
		Shipping ship = new Shipping();
		assertEquals(1800, ship.calculate(1, 40, 40, 41));
	}
	@Test public void testCalculate28() {
		Shipping ship = new Shipping();
		assertEquals(1800, ship.calculate(30, 1, 1, 1));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate29() {
		Shipping ship = new Shipping();
		ship.calculate(31, 1, 1, 1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate30() {
		Shipping ship = new Shipping();
		ship.calculate(30, 0, 1, 1);
	}
	@Test public void testCalculate31() {
		Shipping ship = new Shipping();
		assertEquals(1800, ship.calculate(30, 60, 60, 60));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate32() {
		Shipping ship = new Shipping();
		ship.calculate(31, 60, 60, 60);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate33() {
		Shipping ship = new Shipping();
		ship.calculate(30, 60, 60, 61);
	}
	@Test public void testCalculate34() {
		Shipping ship = new Shipping();
		assertEquals(1800, ship.calculate(1, 60, 60, 60));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate35() {
		Shipping ship = new Shipping();
		ship.calculate(1, 60, 60, 61);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate36() {
		Shipping ship = new Shipping();
		ship.calculate(0, 60, 60, 60);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate37() {
		Shipping ship = new Shipping();
		ship.calculate(15, 0, 10, 10);
	}
	@Test public void testCalculate38() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(15, 1, 10, 10));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate39() {
		Shipping ship = new Shipping();
		ship.calculate(15, 10, 0, 10);
	}
	@Test public void testCalculate40() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(15, 10, 1, 10));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate41() {
		Shipping ship = new Shipping();
		ship.calculate(15, 10, 10, 0);
	}
	@Test public void testCalculate42() {
		Shipping ship = new Shipping();
		assertEquals(1200, ship.calculate(15, 10, 10, 1));
	}
}

