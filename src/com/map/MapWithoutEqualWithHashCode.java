package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapWithoutEqualWithHashCode {
	public static void main(String[] args) {

	
		
		for(int i =1;i <=50;i++){
			Employee3 e1 = new Employee3(1,"1");
			Employee3 e2 = new Employee3(2,"2");
			Employee3 e3 = new Employee3(1,"1");
			Map<Employee3,Employee3> map = new HashMap<>();
			map.put(e1,e1);
			map.put(e2,e2);
			map.put(e3,e3);
			System.out.println(map.size());
		}
		
	
	}
}

class Employee3 {
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

	public Employee3(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		return this.id;
	}

}