package com.systemdesign.atm;

import java.util.HashMap;
import java.util.Map;

public class ATMStock {

	private static ATMStock stock = new ATMStock();
	private int total;
	private Map<Integer,Integer> currentStock = new HashMap<Integer, Integer>();
	private Map<Integer,Integer> initialStock = new HashMap<Integer, Integer>();
	
	
	private ATMStock(){
		
	}
	
	public static ATMStock getInstance(){
		return stock;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Map<Integer, Integer> getCurrentStock() {
		return currentStock;
	}
	public void setCurrentStock(Map<Integer, Integer> currentStock) {
		this.currentStock = currentStock;
	}
	public Map<Integer, Integer> getInitialStock() {
		return initialStock;
	}
	public void setInitialStock(Map<Integer, Integer> initialStock) {
		this.initialStock = initialStock;
	}
	
	public void refill(){
		initialStock.keySet().stream().forEach((key)->{
			currentStock.put(key, initialStock.get(key));
		});
	}
}
