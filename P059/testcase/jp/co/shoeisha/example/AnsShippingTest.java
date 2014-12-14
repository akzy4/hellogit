package jp.co.shoeisha.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnsShippingTest {

	@Test
	public void testCalculate01()  {
		int weight = 5;
		int x = 10;
		int y = 10;
		int z = 10;
		AnsShipping sp = new AnsShipping();
		int result = sp.calculate(weight,  x,  y,  z);
		assertEquals(600, result);
	}

	@Test
	public void testCalculate04()  {
		int weight = 100;
		int x = 30;
		int y = 30;
		int z = 30;
		AnsShipping sp = new AnsShipping();
		try{
			sp.calculate(weight, x, y, z);
			fail();
		}catch(IllegalArgumentException e){
			System.out.println("予想通り例外発生!");
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculate05() {
		int weight = 100;
		int x = 30;
		int y = 30;
		int z = 30;
		AnsShipping sp = new AnsShipping();
		sp.calculate(weight, x, y, z);
	}
}
