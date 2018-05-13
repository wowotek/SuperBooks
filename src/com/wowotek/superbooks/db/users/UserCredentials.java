package com.wowotek.superbooks.db.users;

public class UserCredentials
{
	public String Username, Password, Email, RegID;
	
	public UserCredentials(String username, String password, String email, String regid)
	{
		this.Username = username;
		this.Password = password;
		this.Email = email;
		this.RegID = regid;
	}
	
	public UserCredentials(String username, String password, String email)
	{
		this.Username = username;
		this.Password = password;
		this.Email = email;
	}
}
