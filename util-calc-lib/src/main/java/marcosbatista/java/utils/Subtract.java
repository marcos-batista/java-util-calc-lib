package marcosbatista.java.utils;

public class Subtract implements Operation {

	public Number run(Number a, Number b) {
		return (a.doubleValue() - b.doubleValue());
	}

}
