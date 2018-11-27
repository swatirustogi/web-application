package com.webapp.jee;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password)
	{
		System.out.println(user);
		if((user.equals("user")) && (password.equals("abc123")))
			return true;
		else
			return false;
	}

}
