package com.systemdesign.atm;

public class Five100Dispenser implements Dispenser{

	Dispenser dispenser;
	
	@Override
	public void next(Dispenser dispenser) {
		// TODO Auto-generated method stub
		this.dispenser = dispenser;
	}

	@Override
	public void dispense(int amount) {
		// TODO Auto-generated method stub
		if(amount > 500){
			int _500notes = amount/500;
			int remaining = amount%500;
			
			System.out.println("Dispensing "+_500notes+" of 500 notes");
			if(remaining > 0){
				dispenser.dispense(remaining);
			}
		}else{
			dispenser.dispense(amount);
		}
	}

}
