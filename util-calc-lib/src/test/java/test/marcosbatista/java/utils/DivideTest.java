package test.marcosbatista.java.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import marcosbatista.java.utils.Divide;
import marcosbatista.java.utils.Operation;

public class DivideTest {
	
	private Operation factoryOperation() {
		return new Divide();
	}
	
	@Test
	public void run1() {
		Operation divide = factoryOperation();
		Number result = 16;
		
		result = divide.run(result.doubleValue(), 4);
		assertEquals(4.0, result);
		
		result = divide.run(result, 4);
		assertEquals(1.0, result);
		
		result = divide.run(result, 2);
		assertEquals(0.5, result);
		
		result = divide.run(result, 2);
		assertEquals(0.25, result);
		
	}
	
}
