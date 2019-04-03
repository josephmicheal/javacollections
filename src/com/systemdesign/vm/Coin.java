package com.systemdesign.vm;

public enum Coin {
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	private int denomination;

	private Coin(int denomination) {
		this.denomination = denomination;
	}

	public int getDenomination() {
		return denomination;
	}
}

// Read more:
// https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5jl9rjOSQ