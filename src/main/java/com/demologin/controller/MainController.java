package com.demologin.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demologin.Constant;
import com.demologin.thread.MyThread;

@Controller
public class MainController {

	MyThread thread;

	@RequestMapping(value = { "/", "/welcomePage" }, method = RequestMethod.GET)
	public String welcomePage(Model model) {

		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome page!");
		return "welcomePage";
	}

	@RequestMapping(value = "/startThread", method = RequestMethod.GET)
	@ResponseBody
	public void startThread(Model model) {
		Constant.THREADRUNNING=true;
		thread = new MyThread();
		thread.start();
	}
	
	@RequestMapping(value = "/stopThread", method = RequestMethod.GET)
	@ResponseBody
	public void stopThread(Model model) {
		Constant.THREADRUNNING=false;
	}
	

	@RequestMapping(value = "/threadStatus", method = RequestMethod.GET)
	public String threadStatus(Model model) {
		if (thread != null && thread.isAlive()) {
			model.addAttribute("isRunning", true);
		}else{
			model.addAttribute("isRunning", false);
		}
		return "threadStatus";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(Model model) {
		model.addAttribute("title", "Admin");
		model.addAttribute("message", "Admin Page - This is protected page!");
		return "adminPage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		model.addAttribute("title", "Login");
		model.addAttribute("message", "Enter your username/password:");
		return "loginPage";
	}

	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	public String logoutSuccessfulPage(Model model) {
		model.addAttribute("title", "Logout");
		return "logoutSuccessfulPage";
	}

	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public String loginPage(Model model, Principal principal) {
		model.addAttribute("title", "User Info");

		// Sau khi user login thanh cong se co principal
		String userName = principal.getName();

		model.addAttribute("message", "User Info - This is protected page!. Hello " + userName);

		return "userInfoPage";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Model model, Principal principal) {
		model.addAttribute("title", "Access Denied!");

		if (principal != null) {
			model.addAttribute("message",
					"Hi " + principal.getName() + "<br> You do not have permission to access this page!");
		} else {
			model.addAttribute("msg", "You do not have permission to access this page!");
		}
		return "403Page";
	}
}