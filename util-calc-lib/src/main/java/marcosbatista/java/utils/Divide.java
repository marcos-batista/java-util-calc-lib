package marcosbatista.java.utils;

public class Divide implements Operation {

	public Number run(Number a, Number b) {
		return (a.doubleValue() / b.doubleValue());
	}

}
