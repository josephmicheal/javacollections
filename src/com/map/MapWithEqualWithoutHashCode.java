package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapWithEqualWithoutHashCode {
	public static void main(String[] args) {

	
		
		for(int i =1;i <=50;i++){
			Employee2 e1 = new Employee2(1,"1");
			Employee2 e2 = new Employee2(2,"2");
			Employee2 e3 = new Employee2(1,"1");
			Map<Employee2,Employee2> map = new HashMap<>();
			map.put(e1,e1);
			map.put(e2,e2);
			map.put(e3,e3);
			System.out.println(map.size());
		}
		
	
	}
}

class Employee2 {
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

	public Employee2(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Employee2){
			Employee2 other = (Employee2)obj;
			if(other.getId()==this.getId() && other.getName().equals(this.getName())){
				return true;
			}
		}
		return false;
	}

}