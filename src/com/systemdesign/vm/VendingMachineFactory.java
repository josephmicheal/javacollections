package com.systemdesign.vm;

/**
 * * Factory class to create instance of Vending Machine, this can be extended
 * to create instance of * different types of vending machines. * @author Javin
 * Paul
 */
public class VendingMachineFactory {
	public static VendingMachine createVendingMachine() {
		return new VendingMachineImpl();
	}
}

// Read more:
// https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5jl9da8Xe