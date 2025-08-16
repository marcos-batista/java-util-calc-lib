package test.marcosbatista.java.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import marcosbatista.java.utils.Add;
import marcosbatista.java.utils.Operation;

public class AddTest {
	
	private Operation factoryOperation() {
		return new Add();
	}
	
	@Test
	public void run1() {
		Operation add = factoryOperation();
		Number result = add.run(1, 1);
		assertEquals(2, result);
	}
	
	@Test
	public void run2() {
		Operation add = factoryOperation();
		Number result = null; int i = 0;
		do {
			result = add.run(1, i);
			i = (Integer) result;
			
		} while (i < 10);
		assertEquals(10, result);
	}

}
