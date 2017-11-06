package com.krishagni.test;


public class User  {
	private int id ;
	private String FirstName  , LastName , Address ;


	User(){}
	
	User(int id,String FirstName , String LastName , String Address)
	{
		this.setId(id);
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		this.setAddress(Address);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
