package test.marcosbatista.java.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import marcosbatista.java.utils.Multiply;
import marcosbatista.java.utils.Operation;

public class MultiplyTest {
	
	private Operation factoryOperation() {
		return new Multiply();
	}
	
	@Test
	public void run1() {
		Operation multiply = factoryOperation();
		Number result = multiply.run(1, 1);
		assertEquals(1.0, result);
	}
	
	@Test
	public void run2() {
		Operation multiply = factoryOperation();
		Number result = null; double i = 1;
		do {
			result = multiply.run(2, i);
			i = (Double) result;
			
		} while (i < 10);
		assertEquals(16.0, result);
	}

}
