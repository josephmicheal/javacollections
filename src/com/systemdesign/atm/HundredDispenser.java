package com.systemdesign.atm;

public class HundredDispenser implements Dispenser{

	Dispenser dispenser;
	
	@Override
	public void next(Dispenser dispenser) {
		// TODO Auto-generated method stub
		this.dispenser = dispenser;
	}

	@Override
	public void dispense(int amount) {
		// TODO Auto-generated method stub
		if(amount >= 100){
			int _100notes = amount/100;
			
			System.out.println("Dispensing "+_100notes+" of 100 notes");
			
		}
	}

}
