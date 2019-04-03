package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapWithEqualsHashcodeTrue {
	public static void main(String[] args) {

	
		
		for(int i =1;i <=50;i++){
			Employee5 e1 = new Employee5(1,"1");
			Employee5 e2 = new Employee5(2,"2");
			Employee5 e3 = new Employee5(1,"1");
			Map<Employee5,Employee5> map = new HashMap<>();
			map.put(e1,e1);
			map.put(e2,e2);
			map.put(e3,e3);
			System.out.println(map.size());
		}
		
	
	}
}

class Employee5 {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee5(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		return 1;
	}
	
	@Override
	public boolean equals(Object obj){
		return true;
	}

}