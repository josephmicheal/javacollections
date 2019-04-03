package com.systemdesign.vm;

public class NotSufficientChangeException extends RuntimeException {
	private String message;

	public NotSufficientChangeException(String string) {
		this.message = string;
	}

	@Override
	public String getMessage() {
		return message;
	}
}

// Read more:
// https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5jlAFoYCe