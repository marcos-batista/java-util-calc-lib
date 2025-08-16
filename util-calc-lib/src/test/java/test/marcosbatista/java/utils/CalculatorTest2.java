package test.marcosbatista.java.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import marcosbatista.java.utils.Sum;
import marcosbatista.java.utils.Divide;
import marcosbatista.java.utils.Multiply;
import marcosbatista.java.utils.Operation;
import marcosbatista.java.utils.Subtract;

public class CalculatorTest2 {
	
	private Number getFirst() { return 8; }
	
	private Number getSecond() { return 2; }
	
	private Number runOperation(Operation operation) {
		Number a = getFirst(), b = getSecond();
		return operation.run(a, b);
	}
	
	@Test
	public void sum() {
		Number result = runOperation(new Sum());
		assertEquals(10.0, result);
	}
	
	@Test
	public void subtract() {
		Number result = runOperation(new Subtract());
		assertEquals(6.0, result);
	}
	
	@Test
	public void multiply() {
		Number result = runOperation(new Multiply());
		assertEquals(16.0, result);
	}
	
	@Test
	public void divide() {
		Number result = runOperation(new Divide());
		assertEquals(4.0, result);
	}
	
}
