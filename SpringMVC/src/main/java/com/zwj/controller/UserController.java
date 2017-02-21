package com.zwj.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zwj.entity.CardTradeDetail;
import com.zwj.entity.User;
import com.zwj.service.ICardTradeDetailService;
import com.zwj.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@Resource
	private ICardTradeDetailService iCardTradeDetailService;
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		String id=request.getParameter("id");
		String errormessage=request.getParameter("errormessage");
		CardTradeDetail user = iCardTradeDetailService.getCardTradeDetailById(id,errormessage);
		model.addAttribute("user", user);
		return "showUser"; 
	}
	
	public List<User> getAllUser(){
		
		return null;
	}
}
