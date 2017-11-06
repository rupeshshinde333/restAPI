package com.krishagni.test;

import java.util.ArrayList;
import java.util.List;



public class UserDetail{

	private int id;
	private String FirstName;
	private String LastName;
	private String Address;
	
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


	public static UserDetail from(User user)
	{
		UserDetail u = new UserDetail();
		u.setId(user.getId());
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		u.setAddress(user.getAddress());
		return u;		
	}
	
	public static List<UserDetail> from(List<User> users)
	{
		List<UserDetail> udl = new ArrayList<UserDetail>();
		for(User user : users){
			//udl.add((UserDetail) user);
			UserDetail ud = from(user);
			udl.add(ud);
			//System.out.println(udl);
			}
		return udl;		
	}

	 
	
/*public String toString()
	{
		return id +" "+ FirstName +" " + LastName +" "+ Address;
		
	}*/
	

}
