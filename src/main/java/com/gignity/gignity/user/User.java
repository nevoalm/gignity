package com.gignity.gignity.user;

import org.springframework.stereotype.Component;

@Component
public class User implements Iuser{

	public User() {
	}

	public Integer id;

	public void setId(int i) {
		this.id = i;
		
	}
	

}
