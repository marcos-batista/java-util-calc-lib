package test.marcosbatista.java.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import marcosbatista.java.utils.Operation;
import marcosbatista.java.utils.Subtract;

public class SubtractTest {
	
	private Operation factoryOperation() {
		return new Subtract();
	}
	
	@Test
	public void run1() {
		Operation subtract = factoryOperation(); Number result = 10;
		
		result = subtract.run(result, 3);
		assertEquals(7.0, result);
		
		result = subtract.run(result, 3);
		assertEquals(4.0, result);
		
		result = subtract.run(result, 3);
		assertEquals(1.0, result);
		
		result = subtract.run(result, 3);
		assertEquals(-2.0, result);
		
		result = subtract.run(result, 3);
		assertEquals(-5.0, result);
		
		result = subtract.run(result, 3);
		assertEquals(-8.0, result);
		
	}

}
