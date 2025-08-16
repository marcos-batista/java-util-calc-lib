package marcosbatista.java.utils;

public class Sum implements Operation {

	public Number run(Number a, Number b) {
		return (a.doubleValue() + b.doubleValue());
	}

}
