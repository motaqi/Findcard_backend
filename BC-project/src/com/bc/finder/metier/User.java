package com.bc.finder.metier;

public class User {
	
	private String name;
	private int id;
	
	public User(){
		
	}
	
	
	
	public User(String name) {
		super();
		this.name = name;
	}



	public User(int id) {
		super();
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
