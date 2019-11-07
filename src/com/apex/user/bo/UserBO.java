package com.apex.user.bo;

import java.util.ArrayList;

import com.apex.user.vo.User;

public interface UserBO {
	public void addUser(User user);

	public ArrayList getUser();

	public void updateUser(User user);
	
	public void delUser(String firstname);

}
