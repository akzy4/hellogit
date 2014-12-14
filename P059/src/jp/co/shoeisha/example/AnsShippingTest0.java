package jp.co.shoeisha.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnsShippingTest0 {


	@Test public void testCalculate() {
		AnsShipping ship = new AnsShipping();
		assertEquals(600, ship.calculate(5, 10, 10, 10));
	}
	@Test public void testCalculate2() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(15, 30, 30, 30));
	}
	@Test public void testCalculate3() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1800, ship.calculate(25, 50, 50, 50));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate4() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(-100, 30, 30, 30);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate5() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(100, 30, 30, 30);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate6() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(15, -10, -10, -10);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate7() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(15, 100, 100, 100);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate8() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(15, -10, 10, 10);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate9() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(15, 10, -10, 10);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate10() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(15, 10, 10, -10);
	}
	@Test public void testCalculate11() {
		AnsShipping ship = new AnsShipping();
		assertEquals(600, ship.calculate(1, 1, 1, 1));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate12() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(0, 1, 1, 1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate13() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(1, 0, 1, 1);
	}
	@Test public void testCalculate14() {
		AnsShipping ship = new AnsShipping();
		assertEquals(600, ship.calculate(10, 1, 1, 1));
	}
	@Test public void testCalculate15() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(11, 1, 1, 1));
	}
	@Test public void testCalculate16() {
		AnsShipping ship = new AnsShipping();
		assertEquals(600, ship.calculate(10, 20, 20, 20));
	}
	@Test public void testCalculate17() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(11, 20, 20, 20));
	}
	@Test public void testCalculate18() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(10, 20, 20, 21));
	}
	@Test public void testCalculate19() {
		AnsShipping ship = new AnsShipping();
		assertEquals(600, ship.calculate(1, 20, 20, 20));
	}
	@Test public void testCalculate20() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(1, 20, 20, 21));
	}
	@Test public void testCalculate21() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(20, 1, 1, 1));
	}
	@Test public void testCalculate22() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1800, ship.calculate(21, 1, 1, 1));
	}
	@Test public void testCalculate23() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(20, 40, 40, 40));
	}
	@Test public void testCalculate24() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1800, ship.calculate(21, 40, 40, 40));
	}
	@Test public void testCalculate25() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1800, ship.calculate(20, 40, 40, 41));
	}
	@Test public void testCalculate26() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(1, 40, 40, 40));
	}
	@Test public void testCalculate27() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1800, ship.calculate(1, 40, 40, 41));
	}
	@Test public void testCalculate28() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1800, ship.calculate(30, 1, 1, 1));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate29() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(31, 1, 1, 1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate30() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(30, 0, 1, 1);
	}
	@Test public void testCalculate31() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1800, ship.calculate(30, 60, 60, 60));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate32() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(31, 60, 60, 60);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate33() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(30, 60, 60, 61);
	}
	@Test public void testCalculate34() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1800, ship.calculate(1, 60, 60, 60));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate35() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(1, 60, 60, 61);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate36() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(0, 60, 60, 60);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate37() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(15, 0, 10, 10);
	}
	@Test public void testCalculate38() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(15, 1, 10, 10));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate39() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(15, 10, 0, 10);
	}
	@Test public void testCalculate40() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(15, 10, 1, 10));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculate41() {
		AnsShipping ship = new AnsShipping();
		ship.calculate(15, 10, 10, 0);
	}
	@Test public void testCalculate42() {
		AnsShipping ship = new AnsShipping();
		assertEquals(1200, ship.calculate(15, 10, 10, 1));
	}

}
