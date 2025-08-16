package marcosbatista.java.utils;

public class Calculator {
	
	private Number runOperation(Operation operation, int a, int b) {
		return operation.run(a, b);
	}
	
	public Number add(int a, int b) {
		return runOperation(new Add(), a, b);
	}
	
	public Number subtract(int a, int b) {
		return runOperation(new Subtract(), a, b);
	}
	
	public Number multiply(int a, int b) {
		return runOperation(new Multiply(), a, b);
	}
	
	public Number divide(int a, int b) {
		return runOperation(new Divide(), a, b);
	}
	
}
