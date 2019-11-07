package com.apex.user.bo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apex.user.dao.UserDAO;
import com.apex.user.vo.User;

@Service
public class UserBOImpl implements UserBO {
	
	@Autowired
	private UserDAO usrDAO = null;

	public UserBOImpl() {
	}

	@Override
	public void addUser(User user) {
		System.out.println("UserBO start");
		try {
			usrDAO.addUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UserBO ends");
		return;
	}

	@Override
	public ArrayList getUser() {
		ArrayList PInfo = null;
		try {
			PInfo = usrDAO.getUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return PInfo;
	}

	@Override
	public void updateUser(User user) {
	}

	public UserDAO getUsrDAO() {
		return usrDAO;
	}

	public void setUsrDAO(UserDAO usrDAO) {
		this.usrDAO = usrDAO;
	}

	@Override
	public void delUser(String firstname) {
		try {
			usrDAO.delUser(firstname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
}
