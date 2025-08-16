package test.marcosbatista.java.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import marcosbatista.java.utils.Sum;
import marcosbatista.java.utils.Divide;
import marcosbatista.java.utils.Multiply;
import marcosbatista.java.utils.Operation;
import marcosbatista.java.utils.Subtract;

public class CalculatorTest1 {
	
	private Number getFirst() { return 8; }
	
	private Number getSecond() { return 2; }
	
	@Test
	public void sum() {
		Operation operation = new Sum();
		Number a = getFirst(), b = getSecond();
		Number result = operation.run(a, b);
		assertEquals(10.0, result);
	}
	
	@Test
	public void subtract() {
		Operation operation = new Subtract();
		Number a = getFirst(), b = getSecond();
		Number result = operation.run(a, b);
		assertEquals(6.0, result);
	}
	
	@Test
	public void multiply() {
		Operation operation = new Multiply();
		Number a = getFirst(), b = getSecond();
		Number result = operation.run(a, b);
		assertEquals(16.0, result);
	}
	
	@Test
	public void divide() {
		Operation operation = new Divide();
		Number a = getFirst(), b = getSecond();
		Number result = operation.run(a, b);
		assertEquals(4.0, result);
	}
	
}
