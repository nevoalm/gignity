package com.gignity.gignity.dao;

import com.gignity.gignity.user.User;

public interface UserDao {
 	public void insertUser(String name);
 	public User getUser(int id);
	
	

}
