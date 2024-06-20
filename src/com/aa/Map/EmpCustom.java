package com.aa.Map;

public class EmpCustom {

	private int id;
	private String name;
	
	EmpCustom(){
		
	}

	public EmpCustom(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "EmpCustom [id=" + id + ", name=" + name + "]";
	}
	
}
