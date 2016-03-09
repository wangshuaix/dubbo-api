package com.isoft.dubbo.demo.user;

import com.isoft.dubbo.demo.user.bean.User;

public interface UserService {

	public User getUser(String name);
	
	public boolean saveUser(User user);
	
	public boolean delUser(String name);
	
}
