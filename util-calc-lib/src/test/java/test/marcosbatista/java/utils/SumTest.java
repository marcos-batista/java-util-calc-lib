package test.marcosbatista.java.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import marcosbatista.java.utils.Sum;
import marcosbatista.java.utils.Operation;

public class SumTest {
	
	private Operation factoryOperation() {
		return new Sum();
	}
	
	@Test
	public void run1() {
		Operation sum = factoryOperation();
		Number result = sum.run(1, 1);
		assertEquals(2.0, result);
	}
	
	@Test
	public void run2() {
		Operation sum = factoryOperation();
		Number result = null; double i = 0;
		do {
			result = sum.run(1, i);
			i = (Double) result;
			
		} while (i < 10);
		assertEquals(10.0, result);
	}

}
