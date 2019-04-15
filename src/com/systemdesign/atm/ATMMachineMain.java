package com.systemdesign.atm;

public class ATMMachineMain {

	public static void main(String[] args) {
		Dispenser _100Dispenser = new HundredDispenser();
		
		Dispenser _500Dispenser = new Five100Dispenser();
		_500Dispenser.next(_100Dispenser);
		
		Dispenser _2000Dispenser = new TwoKDispenser();
		_2000Dispenser.next(_500Dispenser);
		
		
		_2000Dispenser.dispense(2600);
		
	}
}
