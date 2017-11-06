package com.krishagni.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		User user = new User();
		
			user.setId(10);
			user.setFirstName("Rupesh");
			user.setLastName("Shinde");
			user.setAddress("Katraj");
		
		//UserDetail ud = new UserDetail();
		/*
			ud.setId(user.getId());
			ud.setFirstName(user.getFirstName());
			ud.setLastName(user.getLastName());
			ud.setAddress(user.getAddress());*/
		
		/*System.out.println(ud.getId());
		System.out.println(ud.getFirstName());
		System.out.println(ud.getLastName());
		System.out.println(ud.getAddress());
		*/
		
		//System.out.println(ud.from(user));
			UserDetail u= UserDetail.from(user);
			
			System.out.println(u.getId());
			System.out.println(u.getFirstName());
			System.out.println(u.getLastName());
			System.out.println(u.getAddress());
			
			
			List<User> l = new ArrayList<User>();
			l.add(new User(10,"Vinod","G","Hadpsar"));
			l.add(new User(11,"Paresh","P","Sangvi"));
			l.add(new User(12,"Dharam","G","Narhe"));
			l.add(new User(13,"Tushar","T","Narhe"));
			
			System.out.println("************************");
			
			List<UserDetail> ud = UserDetail.from(l); 
			for(UserDetail us : ud)
			{
				System.out.println(us.getId()+" "+us.getFirstName()+" "+us.getLastName()+" "+us.getAddress());
			}
	}

}
