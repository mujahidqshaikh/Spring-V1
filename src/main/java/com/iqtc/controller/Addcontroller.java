package com.iqtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iqtc.dao.LoginDao;
import com.iqtc.dao.UserDaoImpl;
import com.iqtc.model.Login;
@Controller
public class Addcontroller {

	LoginDao userLogin=new UserDaoImpl();

	@RequestMapping("/add")
	public String Add(@RequestParam("uname")String uname,@RequestParam("password")String password)
	{

		if(userLogin.ValidateUser(uname, password))
		{
			return "Welcome";
		}

		return "index";
	}
}
