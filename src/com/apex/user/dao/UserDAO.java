package com.apex.user.dao;

import java.util.ArrayList;

import com.apex.user.vo.User;

public interface UserDAO {
	public void addUser(User user) throws Exception;

	public ArrayList getUser() throws Exception;

	public void updateUser(User user) throws Exception;
	
	public void delUser(String firstName) throws Exception;
}
