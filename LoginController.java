package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

@RequestMapping("/login")	
public ModelAndView loginCheck(HttpServletRequest request,HttpServletResponse res){

	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String msg;
if(password.equals("bhushan")){
    msg="Welcome"+"  "+name;	
	return new ModelAndView("welcome","message",msg); 	
}else{
	msg="Sorry Wrong Username or Password";
	return new ModelAndView("errorPage","message",msg); 
}
	
}
}
