package com.systemdesign.atm;

public class TwoKDispenser implements Dispenser{

	Dispenser dispenser;
	
	@Override
	public void next(Dispenser dispenser) {
		// TODO Auto-generated method stub
		this.dispenser = dispenser;
	}

	@Override
	public void dispense(int amount) {
		// TODO Auto-generated method stub
		if(amount > 2000){
			int _2knotes = amount/2000;
			int remaining = amount%2000;
			
			System.out.println("Dispensing "+_2knotes+" of 2000 notes");
			if(remaining > 0){
				dispenser.dispense(remaining);
			}
		}else{
			dispenser.dispense(amount);
		}
	}

}
