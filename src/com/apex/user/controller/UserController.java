package com.apex.user.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.apex.user.bo.UserBO;
import com.apex.user.vo.User;
import com.mysql.cj.Session;

@Controller
@SessionAttributes("user")
public class UserController {

	@Autowired
	UserBO userBo = null;

	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping("")
	public String entryAddUser(@ModelAttribute("user") User user) {
		return "person";
	}

	@RequestMapping("/AddUser")
	public String processAddUser(HttpServletRequest request, @ModelAttribute("user") User user) {
		return "Contact";
	}

	@RequestMapping("/ContactUser")
	public String processContactAddUser(HttpServletRequest request,@ModelAttribute("user") User user) {
		return "Bank";
	}

	@RequestMapping("/BankUser")
	public String processBankAddUser(HttpServletRequest request, @ModelAttribute("user") User user) {
		userBo.addUser(user);
		return "success";
	}
	
	@RequestMapping("/DelUser")
	public String processDelUser(HttpServletRequest request, @ModelAttribute("user") User user) {
		System.out.println("del user with fname: " +request.getParameter("firstname"));
		userBo.delUser(request.getParameter("firstname"));
		return "DelSuccess";
	}
	
	@RequestMapping("/ViewUser")
	public String processViewUser(HttpServletRequest request, @ModelAttribute("user") User user) {
		User[] PersonalList = null;
			System.out.println("in ViewUser controller");
			ArrayList list = userBo.getUser();
			Object[] aList = list.toArray(new User[list.size()]);
			PersonalList = new User[list.size()];
			for (int i = 0; i < aList.length; i++) {
				PersonalList[i] = (User) aList[i];
			}
			request.getSession().setAttribute("PList", PersonalList);
		return "viewallcontacts";
	}
}
