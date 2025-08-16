package marcosbatista.java.utils;

public class Calculator {
	
	private Number runOperation(Operation operation, Number a, Number b) {
		return operation.run(a, b);
	}
	
	public Number sum(Number a, Number b) {
		return runOperation(new Sum(), a, b);
	}
	
	public Number subtract(Number a, Number b) {
		return runOperation(new Subtract(), a, b);
	}
	
	public Number multiply(Number a, Number b) {
		return runOperation(new Multiply(), a, b);
	}
	
	public Number divide(Number a, Number b) {
		return runOperation(new Divide(), a, b);
	}
	
}
