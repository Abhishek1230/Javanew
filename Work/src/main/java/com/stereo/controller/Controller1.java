package com.stereo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Controller1 
{
	@RequestMapping(method = RequestMethod.GET)
	public String Memo(ModelMap model)
	{	
		model.addAttribute("greet", "Hello");
		
		return "welcome";
	}

	

}
