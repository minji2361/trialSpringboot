package com.example.trial.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.trial.model.Member;
import com.example.trial.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/main")
	public String main(HttpSession session) throws Exception{
		String loginId = (String) session.getAttribute("id");
		if (loginId != null) {
			session.setAttribute("loginMessage", "님 로그인중");
			session.setAttribute("loginId", loginId);
		}
		else {
			session.setAttribute("message", "방문을 환영합니다");
		}
		return "home";
	}
	
	@RequestMapping("/loginPage")
	public String loginPage() throws Exception{
		return "/user/loginPage";
	}
	
	@PostMapping(value = "/login")
	public String loginCheck(Model model, HttpServletRequest request, HttpSession session) {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		Member member = userService.findMember(id, password);
		int memNum = member.getMemberNum();
		
		if (member != null) {
			session.setAttribute("id", id);
			session.setAttribute("memNum", memNum);
			return "redirect:/main";
		}
		else {
			return "redirect:/loginPage";
		}
		
	}
	
	@RequestMapping("/logout")
	public String logout(Model model, HttpSession session) {
		session.invalidate();
		return "redirect:/main";
	}
	
	@RequestMapping("/joinPage")
	public String joinPage() throws Exception{
		return "/user/joinPage";
	}
}
