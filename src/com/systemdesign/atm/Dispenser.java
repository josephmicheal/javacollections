package com.systemdesign.atm;

public interface Dispenser {
	public void next(Dispenser dispenser);

	public void dispense(int amount);
}
