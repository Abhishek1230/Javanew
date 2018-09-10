package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController 
{
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello(Model map)
	{
		map.addAttribute("message", "hello spring mvc");
		return "hello";
	}

}
