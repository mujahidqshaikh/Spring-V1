package com.iqtc.dao;

public class UserDaoImpl implements LoginDao {

	//@Override
	public boolean ValidateUser(String uname,String password) {
		
		if(uname==null && password==null)
			return false;
		if(uname.equalsIgnoreCase("admin") && password.equals("12345"))
		{
			return true;
		}
		
		return false;
	}
	

}
